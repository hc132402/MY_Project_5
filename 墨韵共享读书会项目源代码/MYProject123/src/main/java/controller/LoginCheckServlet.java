package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginCheck;
import dao.UserDao;
import model.User;
/**
 * ��¼��֤servlet
 * @author ��С��
 * @version V1.0
 *
 */
@WebServlet(name = "loginCheckServlet", urlPatterns = { "/loginCheckServlet" })
public class LoginCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �����ַ�����
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		// ������¼��֤����
		LoginCheck lc = new LoginCheck();
		// ���õ�¼��֤����
		lc.loginCheck(request, response);

	}
}
