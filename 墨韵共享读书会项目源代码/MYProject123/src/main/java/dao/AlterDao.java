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

	// �޸ĸ�����Ϣ
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
		// ��ȡ�û���
		String username = request.getParameter("name");
		// ��ȡ����
		String password = request.getParameter("pwd");
		// ��ȡȷ������
		String rpsw = request.getParameter("rpsw");
		// ��ȡ�Ա�
		String sex = request.getParameter("sex");
		// ��ȡ����
		String age = request.getParameter("age");
		if (password == null || password.trim().isEmpty()) {
			request.setAttribute("alterError1", "���벻��Ϊ��");
			request.getRequestDispatcher("/alter.jsp").forward(request, response);
			return;
		}
		if (!password.equals(rpsw)) {
			request.setAttribute("alterError2", "���벻һ��");
			request.getRequestDispatcher("/alter.jsp").forward(request, response);
			return;
		}
		if (age == null || age.trim().isEmpty()) {
			request.setAttribute("alterError3", "���䲻��Ϊ��");
			request.getRequestDispatcher("/alter.jsp").forward(request, response);
			return;
		}

		// ע�Ტ��תҳ��
		try {
			if (new AlterDao().alterUserMess(username, password, sex, age)) {
				request.setAttribute("alterSuccess", "�޸ĳɹ��������µ�¼");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
