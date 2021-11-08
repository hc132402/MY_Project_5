package controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.AlterDao;
/**
 * 修改个人信息servlet
 * @author huchao
 * @version V1.0
 */
@WebServlet(name="alterCheckServlet",urlPatterns = {"/alterCheckServlet"})
public class AlterCheckServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		//创建修改操作对象
		AlterDao ad = new AlterDao();
		//调用修改信息验证方法
		ad.alterCheck(request, response);
}
}
