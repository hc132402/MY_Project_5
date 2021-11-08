package dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import controller.LoginCheckServlet;
import model.User;
import myDB.DBUtil;

public class LoginCheck {

	// 验证登录，在数据库中查询用户名和密码是否正确方法
	public static boolean islogin(String username, String password) throws Exception {
		// 与数据库建立连接
		Connection con = DBUtil.getCon();
		// 创建Statement对象
		Statement statement = con.createStatement();
		// 查询操作SQL语句
		String sql = "select * from user where name='" + username + "'and pwd='" + password + "'";
		// 执行SQL语句查询操作
		ResultSet resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	// 对登录表单进行验证方法
	public static void loginCheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取用户名
		String username = request.getParameter("name");
		// 获取密码
		String password = request.getParameter("pwd");
		// 判断登录信息并提示
		// 判断用户名是否为空
		if (username == null || username.trim().isEmpty()) {
			request.setAttribute("loginError1", "用户名不能为空");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		} // 判断密码是否为空
		if (password == null || password.trim().isEmpty()) {
			request.setAttribute("loginError2", "密码不能为空");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		try {
			// 创建登录验证对象
			LoginCheck lc = new LoginCheck();
			// 在数据库中查询用户名和密码是否正确
			if (lc.islogin(username, password)) {
				// 创建Session对象
				HttpSession session = request.getSession(true);
				// 创建User操作类对象
				UserDao ud = new UserDao();
				// 创建User对象并根据用户名查询数据库中用户的信息给予赋值
				User user = ud.setUserMess(username);
				// 把User的信息存入session中
				session.setAttribute("username", user.getName());
				session.setAttribute("pwd", user.getPassword());
				session.setAttribute("sex", user.getSex());
				session.setAttribute("age", user.getAge());
				// 重定向到index2.jsp页面
				response.sendRedirect("index2.jsp");
			} else {
				// 查询到用户名或密码输入错误则跳转到登录界面重新登录
				request.setAttribute("loginError3", "用戶名或密码错误");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
