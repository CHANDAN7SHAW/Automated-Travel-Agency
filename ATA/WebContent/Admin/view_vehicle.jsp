<%@page import="java.sql.ResultSet"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Vehicle</title>
</head>
<body>
<div class="container" style="height:500px; overflow:auto;">
	    <table class="table table-hover">
			<tr>
			<h3>View Vehicle</h3>
            	<th>Vehicle Id</th>
                <th>Name</th>
                <th>Registration Id</th>
                <th>Seating Capacity</th>
                <th>Fare Per Km</th>
                <th>Action</th>
            </tr>
 <%
 Dao d=new Dao();
 ResultSet res=d.viewVehicle();
 int i=0;
 while(res.next()){

 %>             
            <tr>
            	<td><%=res.getString(1)%></td>
                <td><%=res.getString(2)%></td>
                <td><%=res.getString(4)%></td>
                <td><%=res.getString(5)%></td>
                <td><%=res.getString(6)%></td>
                <td>
                <a href="manage_vehicle.jsp?id=<%=res.getString(1)%>"><span class="glyphicon glyphicon-edit"></span></a>
                 <a href="../Del_Vehicle?id=<%=res.getString(1)%>"><span class="glyphicon glyphicon-remove"></span></a>
                </td>
                
                
            </tr>
        <%} %>
		</table>
    </div>    
</body>
</html>