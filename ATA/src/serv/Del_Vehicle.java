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

/**
 * Servlet implementation class Del_Vehicle
 */
@WebServlet("/Del_Vehicle")
public class Del_Vehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		String id=new String(request.getParameter("id"));
		Dao d=new Dao();
		if(d.delVehicle(id)){
			RequestDispatcher rs=request.getRequestDispatcher("Admin/add_driver.jsp");
			o.print("<h3>Vehicle Deleted Successfully</h3>");
			rs.include(request, response);
		}
		else{
			RequestDispatcher rs=request.getRequestDispatcher("Admin/add_driver.jsp");
			o.print("<h3>Wrong Credentials</h3>");
			rs.include(request, response);
		}
	}

}
