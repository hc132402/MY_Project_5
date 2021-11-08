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
 * 登录时查找图书信息servlet
 * @author 胡超
 * @version V1.0
 *
 */
@WebServlet(name = "findBookInfoServlet", urlPatterns = { "/findBookInfoServlet" })
public class FindBookInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置字符编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		// 在前端输出后端数据
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		// 先从请求url上获取key为id的值，也就是图书的id
		String id = request.getParameter("id");
		BookService book = new BookService();
		Book b;
		try {
			// 根据id查询这本书，返回这本书
			b = book.findBookById(id);
			session.setAttribute("book", b);
			// 处理跳转，先把这本书设置成request的属性
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