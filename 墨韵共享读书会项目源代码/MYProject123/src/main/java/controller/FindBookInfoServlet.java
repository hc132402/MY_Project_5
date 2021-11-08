package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BookService;
import model.Book;
/**
 * ��¼ʱ����ͼ����Ϣservlet
 * @author ����
 * @version V1.0
 *
 */
@WebServlet(name = "findBookInfoServlet", urlPatterns = { "/findBookInfoServlet" })
public class FindBookInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �����ַ�����
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		// ��ǰ������������
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		// �ȴ�����url�ϻ�ȡkeyΪid��ֵ��Ҳ����ͼ���id
		String id = request.getParameter("id");
		BookService book = new BookService();
		Book b;
		try {
			// ����id��ѯ�Ȿ�飬�����Ȿ��
			b = book.findBookById(id);
			session.setAttribute("book", b);
			// ������ת���Ȱ��Ȿ�����ó�request������
			request.getRequestDispatcher("/detailPage3.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}