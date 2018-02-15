package serv;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import bean.Userprofile;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Userprofile l=new Userprofile();
		HttpSession ses=request.getSession(true);
		l.setUserId((String)request.getSession(false).getAttribute("uid"));
		l.setFirstname(request.getParameter("fname"));
		l.setLastname(request.getParameter("lname"));
		l.setGender(request.getParameter("gen"));
		l.setStreet(request.getParameter("street"));
		l.setLocation(request.getParameter("location"));
		l.setState(request.getParameter("state"));
		l.setCity(request.getParameter("city"));
		l.setPincode(request.getParameter("pincode"));
		l.setMobileNo(request.getParameter("mobileno"));
		l.setEmailId(request.getParameter("email"));
		l.setPassword(request.getParameter("password"));
		l.setLoginstatus(0);
		Dao d=new Dao();
		if(d.updateUserProfile(l)){
			ses.setAttribute("msg","Added successfully....");
			response.sendRedirect("User/update_user.jsp");
		}
		else{
			ses.setAttribute("msg","Add unsuccessfull....");
			response.sendRedirect("User/update_user.jsp");
		}
	}

}
