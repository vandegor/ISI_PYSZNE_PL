package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="zamowienieServlet", urlPatterns="/zamowienie")
public class ZamowienieServlet extends HttpServlet {
	
	private static final long serialVersionUID = -9172378032130544326L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.getRequestDispatcher("WEB-INF/view/zamowienie.jsp").include(req,resp);
	//String abcd = req.getParameter("restauracjaRBtn");
	//resp.getWriter().println(abcd);
}
}
