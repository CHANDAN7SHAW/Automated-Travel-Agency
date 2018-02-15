package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Driver;
import bean.Reservation;
import dao.Dao;

/**
 * Servlet implementation class Booking
 */
@WebServlet("/Booking")
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		HttpSession ses=request.getSession(true);
		Reservation r=new Reservation();
		String finaldate=request.getParameter("jdate").replace('-','/');
		SimpleDateFormat ft=new SimpleDateFormat("dd/MM/yyyy");
		 try {
			Date fdate=ft.parse(finaldate);
			System.out.println(fdate);
			java.sql.Date j=new java.sql.Date(fdate.getTime());
			r.setJourneyDate(j);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(finaldate);
		r.setReservationId();
		r.setBoardingPoint(request.getParameter("bpoint"));
		r.setDropPoint(request.getParameter("dpoint"));
		r.setBookingStatus();
		r.setBookingDate();
		r.setRouteId(request.getParameter("route"));

		r.setUserId((String)request.getSession(false).getAttribute("uid"));
	/*	
		try {
			r.setJourneyDate(f);
			System.out.println(r.getJourneyDate());
			System.out.println(ft.parse(request.getParameter("jdate")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Dao d=new Dao();
		if(d.insertReservation(r)){
			//RequestDispatcher rs=request.getRequestDispatcher("Admin/add_driver.jsp");
			//o.print("<h3>Driver Added Successfully</h3>");
			ses.setAttribute("msg","Added successfully....");
			response.sendRedirect("User/booking.jsp");
		}
		else{
			
			ses.setAttribute("msg","Add unsuccessfull....");
			response.sendRedirect("User/booking.jsp");
		}
	}
}
