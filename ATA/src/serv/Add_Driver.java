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

import bean.Driver;
import dao.Dao;

/**
 * Servlet implementation class Add_Driver
 */
@WebServlet("/Add_Driver")
public class Add_Driver extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		HttpSession ses=request.getSession(true);
		Driver l=new Driver();
		l.setName(request.getParameter("name"));
		l.setStreet(request.getParameter("street"));
		l.setLocation(request.getParameter("location"));
		l.setCity(request.getParameter("city"));
		l.setState(request.getParameter("state"));
		l.setPincode(request.getParameter("pincode"));
		l.setMobileNo(request.getParameter("mobile"));
		l.setLicenseNo(request.getParameter("licenseno"));
		l.setEmail(request.getParameter("email"));
		Dao d=new Dao();
		if(d.insertDriver(l)){
			//RequestDispatcher rs=request.getRequestDispatcher("Admin/add_driver.jsp");
			//o.print("<h3>Driver Added Successfully</h3>");
			ses.setAttribute("msg","Added successfully....");
			response.sendRedirect("Admin/add_driver.jsp");
			
		}
		else{
			
			ses.setAttribute("msg","Add unsuccessfull....");
			response.sendRedirect("Admin/add_driver.jsp");
			
			
		}
	}

}
