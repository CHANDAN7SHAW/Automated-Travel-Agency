
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
import javax.swing.JOptionPane;

import org.apache.catalina.User;

import dao.Dao;
import bean.Userprofile;


/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		try{
			
				Userprofile l=new Userprofile();
				
				
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
				l.setUsertype(request.getParameter("utype"));
				l.setLoginstatus(0);
	
				Dao d= new Dao();
				if(d.insertUserProfile(l)){
					o.print("<h3>User Profile created Successfully</h3>");
					response.sendRedirect("login.jsp");
				
				}
				else{
					
					RequestDispatcher rs=request.getRequestDispatcher("reg_form.jsp");
					o.print("<h3>Wrong Credentials</h3>");
					rs.include(request, response);
				}
				
	//		}     //end of 1st else
			}catch(Exception e){
				e.printStackTrace();
		}
		
	}

}
