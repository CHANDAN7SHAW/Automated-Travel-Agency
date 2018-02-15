<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="dao.Dao" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Booking</title>


</head>

<body>
<jsp:include page="header.jsp"/>
    

    <!-- Page Content -->
    <div class="container" >

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
            <br>
                <h1 class="page-header">Book My Ride</h1>
            </div>
        </div>
        <!-- /.row -->
		 <%
    if(session.getAttribute("msg")!=null){
    	%>
    <h4 align="center"><%=(String)session.getAttribute("msg") %></h4>	
    	<%
    session.removeAttribute("msg");
    
    }
    %>
        <!-- Content Row -->
        <div class="row">
           
            <!-- Booking Details Column -->
            <div class="col-md-4">
            <br>
            <br>
            
                <h2 align="center">Booking Details</h2>
                <br>
                <br>
                <br>
                
                <form action="../Booking" method="post">
    <table class="table table-responsive" align="center">
    
    	<tr>
        	<th height="40" colspan="2" align="center">Route</th>
        	
            <td>
		         <select name="route">
		         		<option>Select Route->Route Id</option>
		            <%
		             Dao d=new Dao();
		             ResultSet res=d.viewRouteId();
		             while(res.next()){
		            	 String rid=res.getString(1);
		            %>
		            	<option value="<%= rid %>"><%=res.getString(2) %> to <%=res.getString(3) %>-><%=res.getString(1) %>
		            <%
		             }
		             %>
		          </select>
		      </td>
        </tr>
       
         
        <tr>
        	<th height="40" colspan="2" align="center">Boarding Point</th>
            <td><input type="text" class="form-control" name="bpoint"></td>
        </tr>
        <tr>
        	<th height="40" colspan="2" align="center">Drop Point</th>
            <td><input type="text" class="form-control" name="dpoint"></td>
        </tr>
        <tr>
        	<th height="40" colspan="2" align="center">Journey Date</th>
            <td><input type="date" class="form-control" name="jdate"></td>
        </tr>
        
        <tr>
        	<th height="40" colspan="2" align="center">Time</th>
            <td><input type="time" required class="form-control" name="jtime"></td>
        </tr>
       
        <tr>
            <td colspan="4" align="center"><input type="submit" class="btn-lg btn-success" name="send" value="Submit" /></td>
        </tr>
    </table>
    </form>
         </div>     
        </div>
        </div>
        
        <!-- /.row -->
<br>
<br>
<br>
<jsp:include page="footer.jsp"/>
</body>
</html>
