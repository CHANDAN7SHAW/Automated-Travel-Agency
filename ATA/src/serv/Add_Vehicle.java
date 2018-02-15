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
import bean.Vehicle;

/**
 * Servlet implementation class Add_Vehicle
 */
@WebServlet("/Add_Vehicle")
public class Add_Vehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		HttpSession ses=request.getSession(true);
		Vehicle v=new Vehicle();
		v.setName(request.getParameter("name"));
		v.setType(request.getParameter("type"));
		v.setRegistrationNumber(request.getParameter("reg_no"));
		v.setSeatingCapacity(request.getParameter("seating"));
		v.setFarePerKM(request.getParameter("fpk"));
		v.setIMG(request.getParameter("img"));
		Dao d=new Dao();
		if(d.insertVehicle(v)){
			ses.setAttribute("msg","Added successfully....");
			response.sendRedirect("Admin/manage_vehicle.jsp");
		}
		else{
			
			ses.setAttribute("msg","Add unsuccessfull....");
			response.sendRedirect("Admin/manage_vehicle.jsp");
			
			
		}
		

	}

}
