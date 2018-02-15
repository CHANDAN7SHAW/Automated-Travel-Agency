<%@page import="java.sql.ResultSet"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>view-route</title>
<!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Animation -->
    <link rel="stylesheet" href="css/animate.css">
</head>

<body>
	<div class="container" style="height:500px; overflow:auto;">
	    <table class="table table-hover">
	   
			<tr>
			<h3>View Route</h3>
            	<th>Route Id</th>
                <th>Source</th>
                <th>Destination</th>
                <th>Distance</th>
                <th>Travel Duration</th>
                <th>Fare</th>
                <th>Action</th>
            </tr>
 <%
 Dao d=new Dao();
 ResultSet res=d.viewRoute(); 
 int i=0;
 while(res.next()){
	String rid=res.getString(1);
 %>            
            <tr>
            	<td><%=res.getString(1) %></td>
                <td><%=res.getString(2) %></td>
                <td><%=res.getString(3) %></td>
                <td><%=res.getString(4) %></td>
                <td><%=res.getString(5) %></td>
                <td><%=res.getString(6) %></td>
                <td>
                <a href="add_route.jsp?rid=<%=rid%>"><span class="glyphicon glyphicon-edit"></span></a>
                 <a href="../Del_Route?rid=<%=rid%>"><span class="glyphicon glyphicon-remove"></span></a>
                </td>
                
                
            </tr>
     <%} %> 
		</table>
		
    </div>    
</body>
</html>