package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("サーブレット実行中");
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		if((name.equals("西牧")||name.equals("巌")||name.equals("鈴木"))&&pass.equals("1234")){
			
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			session.setAttribute("pass", pass);
			
			request.getRequestDispatcher("WEB-INF/jsp/SelectTable.jsp").forward(request, response);
		
		}else {
			
			request.getRequestDispatcher("WEB-INF/jsp/loginmiss.jsp").forward(request, response);
		}
		
	}

}
