package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import bean.Userprofile;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		HttpSession ses=request.getSession();
		Dao d=new Dao();
		int z=-1;
		
		z=d.isAdmin(request.getParameter("email_id"), request.getParameter("pass"));
	
		if(z==1){
				
				ses.setAttribute("firstName", "admin");
		    	//RequestDispatcher rs=request.getRequestDispatcher("WelcomeAdmin.jsp");
				//rs.include(request, response);
				response.sendRedirect("Admin/index.jsp");
		}
		else if(z==0){
			try {
				String id=d.uid(request.getParameter("email_id"), request.getParameter("pass"));
				ses.setAttribute("uid", id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    	response.sendRedirect("User/index.jsp");
		}
		else{
			ses.setAttribute("error", "error");
			response.sendRedirect("login.jsp");
			
					
		}
	}

}
