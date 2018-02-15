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

import bean.Route;
import dao.Dao;


@WebServlet("/Modify_Route")
public class Modify_Route extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		HttpSession ses=request.getSession(true);
		Route r=new Route();
		try{
		r.setRouteId(request.getParameter("routeid"));
		r.setSource(request.getParameter("source"));
		r.setDestination(request.getParameter("desti"));
		r.setTravelDuration(request.getParameter("tradu"));
		r.setDistance(request.getParameter("dist"));
		
		Dao d=new Dao();
		if(d.updateRoute(r)){
		/*	RequestDispatcher rs=request.getRequestDispatcher("Admin/add_route.jsp");
			o.print("<h3>Route update Successfully</h3>");
			rs.include(request, response);*/
			ses.setAttribute("msg", "Update Successful");
			response.sendRedirect("Admin/add_route.jsp");
		}
		else{
			
		/*	RequestDispatcher rs=request.getRequestDispatcher("Admin/add_route.jsp");
			o.print("<h3>Wrong Credentials</h3>");
			rs.include(request, response);*/
			ses.setAttribute("msg", "Update Unsuccessful");
			response.sendRedirect("Admin/add_route.jsp");
		}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
