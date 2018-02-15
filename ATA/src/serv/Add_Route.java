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
import bean.Route;

/**
 * Servlet implementation class Add_Route
 */
@WebServlet("/Add_Route")
public class Add_Route extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		HttpSession ses=request.getSession(true);
		Route r=new Route();
		r.setSource(request.getParameter("source"));
		r.setDestination(request.getParameter("desti"));
		r.setTravelDuration(request.getParameter("tradu"));
		r.setDistance(request.getParameter("dist"));
		r.setFare(request.getParameter("fare"));
		Dao d=new Dao();
		if(d.insertRoute(r)){
		//	RequestDispatcher rs=request.getRequestDispatcher("Admin/add_route.jsp");
		//	o.print("<h3>Route Added Successfully</h3>");
		//	rs.include(request, response);
			ses.setAttribute("msg","Added successfully....");
			response.sendRedirect("Admin/add_route.jsp");
		}
		else{
			
			ses.setAttribute("msg","Add unsuccessfull....");
			response.sendRedirect("Admin/add_route.jsp");
			
			
		}
	}

}
