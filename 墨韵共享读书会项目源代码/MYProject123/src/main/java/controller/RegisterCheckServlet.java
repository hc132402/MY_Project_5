package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginCheck;
import dao.RegisterCheck;
/**
 * ע��servlet
 * @author ����
 * @version V1.0
 *
 */
@WebServlet(name = "registerCheckServlet", urlPatterns = { "/registerCheckServlet" })
public class RegisterCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		//����ע����֤����
		RegisterCheck rc = new RegisterCheck();
		//�ж�ע����Ϣ����ʾ
		rc.checkForm(request, response);
	}
}
