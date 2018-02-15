package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import bean.Vehicle;

/**
 * Servlet implementation class Modify_Vehicle
 */
@WebServlet("/Modify_Vehicle")
public class Modify_Vehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		Vehicle v=new Vehicle();
		v.setVehicleId(request.getParameter("vehicleid"));
		v.setName(request.getParameter("name"));
		v.setType(request.getParameter("type"));
		v.setRegistrationNumber(request.getParameter("RegistrationNumber"));
		v.setSeatingCapacity(request.getParameter("SeatingCapacity"));
		v.setFarePerKM(request.getParameter("FarePerKm"));
		v.setIMG(request.getParameter("IMG"));
		Dao d=new Dao();
		if(d.updateVehicle(v)){
			RequestDispatcher rs=request.getRequestDispatcher("Admin/manage_vehicle.jsp");
			o.print("<h3>Vehicle Updated Successfully</h3>");
			rs.include(request, response);
		}
		else{
			
			RequestDispatcher rs=request.getRequestDispatcher("Admin/manage_vehicle.jsp");
			o.print("<h3>Wrong Credentials</h3>");
			rs.include(request, response);
			
			
		}
		
	}



}
