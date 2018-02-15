<%@page import="java.sql.ResultSet"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>View Driver</title>
<!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Animation -->
    <link rel="stylesheet" href="css/animate.css">
</head>

<body>
<div class="container" style="height:500px; overflow:auto;">

	    <table class="table table-hover">
			<tr>
			<h3>View Driver</h3>
            	<th>Driver_Id</th>
                <th>Name</th>
                <th>City</th>
                <th>State</th>
                <th>Mobileno</th>
                <th>License No</th>
                <th>Email</th>
                <th>Action</th>
            </tr>
 <%
 Dao d=new Dao();
 ResultSet r=d.viewDriver(); 
 int i=0;
if(r!=null){
 while(r.next()){

	 String did=r.getString(1);
 %>           
            <tr>
            	<td><%=did %></td>
                <td><%=r.getString(2) %></td>
                <td><%=r.getString(5) %></td>
                <td><%=r.getString(6) %></td>
                <td><%=r.getString(8) %></td>
                <td><%=r.getString(9) %></td>
                <td><%=r.getString(10) %></td>
                <td>
                <a href="add_driver.jsp?did=<%=did%>"><span class="glyphicon glyphicon-edit"></span></a>
                <a href="../Del_Driver?did=<%=did%>"><span class="glyphicon glyphicon-remove"></span></a>
                </td>
                
                
            </tr>
		<%}
 
 }%>
		</table>
    </div>    
</body>
</html>