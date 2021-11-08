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
	// ִ��ע����������������ݳɹ�����true�����򷵻�false
	public static boolean isReg(String username, String password, String sex, String age) throws Exception {
		// �����ݿ⽨������
		Connection con = DBUtil.getCon();
		// ����Statement����
		Statement statement = con.createStatement();
		// �������SQL���
		String sql = "insert into user(name,pwd,sex,age) values('" + username + "','" + password + "','" + sex + "','"
				+ age + "')";
		// ִ�в������SQL���
		int resultSet = statement.executeUpdate(sql);
		if (resultSet > 0) {
			return true;
		} else {
			return false;
		}
	}

	// �ж��û����Ƿ��ѱ�ע��
	public static boolean UserExists(String username) throws Exception {
		// �����ݿ⽨������
		Connection con = DBUtil.getCon();
		// ����Statement����
		Statement statement = con.createStatement();
		// ��ѯ����SQL���
		String sql = "SELECT name FROM user WHERE name = '" + username + "'";
		// ִ�в�ѯ����SQL���
		ResultSet resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	// �ж�ע����Ϣ����ʾ
	public static void checkForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡע�����Ϣ
		String username = request.getParameter("name");
		String password = request.getParameter("pwd");
		String rpsw = request.getParameter("rpsw");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		System.out.println(username);
		// �ж��û�����Ϣ�Ƿ�Ϊ�ղ���ʾ������Ϣ
		if (username == null || username.trim().isEmpty()) {
			request.setAttribute("registError1", "�û�������Ϊ��");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} // �ж������Ƿ�Ϊ�ղ���ʾ������Ϣ
		if (password == null || password.trim().isEmpty()) {
			request.setAttribute("registError2", "���벻��Ϊ��");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} // �ж����������Ƿ�һ�²���ʾ������Ϣ
		if (!password.equals(rpsw)) {
			request.setAttribute("registError3", "���벻һ��");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} // �ж��Ա��Ƿ�Ϊ��
		if (sex == null || username.trim().isEmpty()) {
			request.setAttribute("registError4", "��ѡ���Ա�");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		} // �ж������Ƿ�Ϊ��
		if (age == null || age.trim().isEmpty()) {
			request.setAttribute("registError5", "����������");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		try {
			// �ж��û����Ƿ��ѱ�ע��
			if (RegisterCheck.UserExists(username)) {
				request.setAttribute("registError7", "�û����Ѵ���");
				request.getRequestDispatcher("/register.jsp").forward(request, response);
				return;
			}
			// ע�Ტ��תҳ��
			try {
				// ����ע����֤�����
				RegisterCheck rc = new RegisterCheck();
				// ִ��ע�����
				if (rc.isReg(username, password, sex, age)) {
					System.out.println(username);
					System.out.println(password);
					System.out.println(sex);
					System.out.println(age);
					// ����Session����
					HttpSession session = request.getSession(true);
					// ���û�������session��
					session.setAttribute("user", username);
					// ע��ɹ��� ����Ϣת������¼�ɹ�ҳ��
					request.getRequestDispatcher("/loginSuccess.jsp").forward(request, response);
				} else {
					// ע�᲻�ɹ�����ת����¼�������µ�¼
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
