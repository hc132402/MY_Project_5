package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myDB.DBUtil;

public class AlterDao {

	public AlterDao() {
	}

	// 修改个人信息
	public static boolean alterUserMess(String username, String pwd, String sex, String age) throws Exception {
		Connection con = DBUtil.getCon();
		Statement statement = con.createStatement();
		String sql = "update user set pwd='" + pwd + "',sex='" + sex + "',age='" + age + "' where name='" + username
				+ "'";
		// String sql ="select * from user where name='"+username+"'and
		// pwd='"+password+"'";
		System.out.println(sql);
		int resultSet = statement.executeUpdate(sql);
		if (resultSet > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void alterCheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取用户名
		String username = request.getParameter("name");
		// 获取密码
		String password = request.getParameter("pwd");
		// 获取确认密码
		String rpsw = request.getParameter("rpsw");
		// 获取性别
		String sex = request.getParameter("sex");
		// 获取年龄
		String age = request.getParameter("age");
		if (password == null || password.trim().isEmpty()) {
			request.setAttribute("alterError1", "密码不能为空");
			request.getRequestDispatcher("/alter.jsp").forward(request, response);
			return;
		}
		if (!password.equals(rpsw)) {
			request.setAttribute("alterError2", "密码不一致");
			request.getRequestDispatcher("/alter.jsp").forward(request, response);
			return;
		}
		if (age == null || age.trim().isEmpty()) {
			request.setAttribute("alterError3", "年龄不能为空");
			request.getRequestDispatcher("/alter.jsp").forward(request, response);
			return;
		}

		// 注册并跳转页面
		try {
			if (new AlterDao().alterUserMess(username, password, sex, age)) {
				request.setAttribute("alterSuccess", "修改成功，请重新登录");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
