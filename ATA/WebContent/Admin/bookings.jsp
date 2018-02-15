<%@page import="java.sql.ResultSet"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>View Reservations</title>
<!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Animation -->
    <link rel="stylesheet" href="css/animate.css">
</head>

<body>
<jsp:include page="header.jsp"/>
<div class="container" style="height:500px; overflow:auto;wdth:1400px">

	    <table class="table table-hover">
			<tr>
			<h3>View Reservations</h3>
            	<th>Reservstion_Id</th>
            	<th>User Id</th>
            	<th>Vehicle Id</th>
            	<th>Route Id</th>
            	<th>Booking Date</th>
            	<th>Journey Date</th>
            	<th>Driver Id</th>
            	<th>Booking Status</th>
            	<th>Total Fare</th>
                <th>Boarding Point</th>
                <th>Drop Point</th>
                <th>Vehicle Name</th>
                
            </tr>
 <%
 Dao d=new Dao();
 ResultSet r=d.viewReservation(); 
 int i=0;
if(r!=null){
 while(r.next()){

	 String reservId=r.getString(1);
 %>           
            <tr>
            	<td><%=reservId %></td>
                <td><%=r.getString(2) %></td>
                <td><%=r.getString(3) %></td>
                <td><%=r.getString(4) %></td>
                <td><%=r.getString(5) %></td>
                <td><%=r.getString(6) %></td>
                <td><%=r.getString(7) %></td>
                <td><%=r.getString(8) %></td>
                <td><%=r.getString(9) %></td>
                <td><%=r.getString(10) %></td>
                <td><%=r.getString(11) %></td>
                <td><%=r.getString(12) %></td>
                <td>
                <a href="add_driver.jsp?did=<%=reservId%>"><span class="glyphicon glyphicon-edit"></span></a>
                </td>
                <td>
                <a href="../Del_Driver?did=<%=reservId%>"><span class="glyphicon glyphicon-remove"></span></a>
                </td>
                
                
            </tr>
		<%}
 
 }%>
		</table>
    </div> 
<br>
<br>
<br>
<br>
<jsp:include page="footer.jsp"/>   
</body>
</html>