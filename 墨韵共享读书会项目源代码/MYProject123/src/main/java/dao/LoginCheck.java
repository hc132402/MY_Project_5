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

	// ��֤��¼�������ݿ��в�ѯ�û����������Ƿ���ȷ����
	public static boolean islogin(String username, String password) throws Exception {
		// �����ݿ⽨������
		Connection con = DBUtil.getCon();
		// ����Statement����
		Statement statement = con.createStatement();
		// ��ѯ����SQL���
		String sql = "select * from user where name='" + username + "'and pwd='" + password + "'";
		// ִ��SQL����ѯ����
		ResultSet resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	// �Ե�¼��������֤����
	public static void loginCheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ�û���
		String username = request.getParameter("name");
		// ��ȡ����
		String password = request.getParameter("pwd");
		// �жϵ�¼��Ϣ����ʾ
		// �ж��û����Ƿ�Ϊ��
		if (username == null || username.trim().isEmpty()) {
			request.setAttribute("loginError1", "�û�������Ϊ��");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		} // �ж������Ƿ�Ϊ��
		if (password == null || password.trim().isEmpty()) {
			request.setAttribute("loginError2", "���벻��Ϊ��");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		try {
			// ������¼��֤����
			LoginCheck lc = new LoginCheck();
			// �����ݿ��в�ѯ�û����������Ƿ���ȷ
			if (lc.islogin(username, password)) {
				// ����Session����
				HttpSession session = request.getSession(true);
				// ����User���������
				UserDao ud = new UserDao();
				// ����User���󲢸����û�����ѯ���ݿ����û�����Ϣ���踳ֵ
				User user = ud.setUserMess(username);
				// ��User����Ϣ����session��
				session.setAttribute("username", user.getName());
				session.setAttribute("pwd", user.getPassword());
				session.setAttribute("sex", user.getSex());
				session.setAttribute("age", user.getAge());
				// �ض���index2.jspҳ��
				response.sendRedirect("index2.jsp");
			} else {
				// ��ѯ���û��������������������ת����¼�������µ�¼
				request.setAttribute("loginError3", "�Ñ������������");
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
