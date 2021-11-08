package dao;

import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myDB.DBUtil;

public class RegisterCheck {
	// 执行注册操作，若插入数据成功返回true，否则返回false
	public static boolean isReg(String username, String password, String sex, String age) throws Exception {
		// 与数据库建立连接
		Connection con = DBUtil.getCon();
		// 创建Statement对象
		Statement statement = con.createStatement();
		// 插入操作SQL语句
		String sql = "insert into user(name,pwd,sex,age) values('" + username + "','" + password + "','" + sex + "','"
				+ age + "')";
		// 执行插入操作SQL语句
		int resultSet = statement.executeUpdate(sql);
		if (resultSet > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 判断用户名是否已被注册
	public static boolean UserExists(String username) throws Exception {
		// 与数据库建立连接
		Connection con = DBUtil.getCon();
		// 创建Statement对象
		Statement statement = con.createStatement();
		// 查询操作SQL语句
		String sql = "SELECT name FROM user WHERE name = '" + username + "'";
		// 执行查询操作SQL语句
		ResultSet resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	// 判断注册信息并提示
	public static void checkForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取注册表单信息
		String username = request.getParameter("name");
		String password = request.getParameter("pwd");
		String rpsw = request.getParameter("rpsw");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		System.out.println(username);
		// 判断用户名信息是否为空并提示错误消息
		if (username == null || username.trim().isEmpty()) {
			request.setAttribute("registError1", "用户名不能为空");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} // 判断密码是否为空并提示错误消息
		if (password == null || password.trim().isEmpty()) {
			request.setAttribute("registError2", "密码不能为空");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} // 判断两次密码是否一致并提示错误消息
		if (!password.equals(rpsw)) {
			request.setAttribute("registError3", "密码不一致");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} // 判断性别是否为空
		if (sex == null || username.trim().isEmpty()) {
			request.setAttribute("registError4", "请选择性别");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} // 判断年龄是否为空
		if (age == null || age.trim().isEmpty()) {
			request.setAttribute("registError5", "请输入年龄");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		try {
			// 判断用户名是否已被注册
			if (RegisterCheck.UserExists(username)) {
				request.setAttribute("registError7", "用户名已存在");
				request.getRequestDispatcher("/register.jsp").forward(request, response);
				return;
			}
			// 注册并跳转页面
			try {
				// 创建注册验证类对象
				RegisterCheck rc = new RegisterCheck();
				// 执行注册操作
				if (rc.isReg(username, password, sex, age)) {
					System.out.println(username);
					System.out.println(password);
					System.out.println(sex);
					System.out.println(age);
					// 创建Session对象
					HttpSession session = request.getSession(true);
					// 把用户名存入session中
					session.setAttribute("user", username);
					// 注册成功后 将信息转发到登录成功页面
					request.getRequestDispatcher("/loginSuccess.jsp").forward(request, response);
				} else {
					// 注册不成功则跳转到登录界面重新登录
					response.sendRedirect("register.jsp");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
