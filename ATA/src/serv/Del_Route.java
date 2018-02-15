package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;

/**
 * Servlet implementation class Del_Route
 */
@WebServlet("/Del_Route")
public class Del_Route extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		HttpSession ses=request.getSession(true);
		String id=new String(request.getParameter("rid"));
		Dao d=new Dao();
		if(d.delRoute(id)){
		//	RequestDispatcher rs=request.getRequestDispatcher("Admin/add_route.jsp");
		//	o.print("<h3>Route Deleted Successfully</h3>");
		//	rs.include(request, response);
			ses.setAttribute("msg","Deleted successfully....");
			response.sendRedirect("Admin/add_route.jsp");
		}
		else{
			RequestDispatcher rs=request.getRequestDispatcher("Admin/add_route.jsp");
			o.print("<h3>Wrong Credentials</h3>");
			rs.include(request, response);
		}
	}

}
