<!doctype html>
<%@page import="dao.Dao"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="utf-8">
<title>Manage Vehicle</title>
</head>

<body>
<jsp:include page="header.jsp"/>

	
  <div class="container">
    <%
    if(session.getAttribute("msg")!=null){
    	%>
    <h4 align="center"><%=(String)session.getAttribute("msg") %></h4>	
    	<%
    session.removeAttribute("msg");
    
    }
    %>
	<div class="page-header">
		<h3>ADD Vehicle</h3>
	</div>
    <div class="container">
    <%if(request.getParameter("id")==null){ %>
	<form action="../Manage_Vehicle" method="post" enctype="multipart/form-data">
    <table class="table table-responsive">
    	<tr>
        	<th height="40">Name</th>
            <td><input type="text" required class="form-control" name="name" /></td>
        </tr>
       
         <tr>
        	<th height="40">Type</th>
            <td>
            	<select class="form-control" name="type">
                	<option>-Select Type-</option>
                    <option value=""></option>
                    <option value=""></option>
                </select>
            </td>
        </tr>
        <tr>
        	<th height="40">Registration Number</th>
            <td><input type="text" class="form-control" name="reg_no" /></td>
        </tr>
        <tr>
        	<th height="40">Seating Capacity</th>
            <td><input type="text" required class="form-control" name="seating" /></td>
        </tr>
        <tr>
        	<th height="40">Fare Per km</th>
            <td><input type="text" class="form-control" name="fpk" /></td>
        </tr>
        
        
        <tr>
        	<th height="40">IMG</th>
            <td><input type="file" required class="form-control" name="img" size="50"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="btn-lg btn-success" name="send" value="Upload File" /></td>
        </tr>
    </table>
    </form>
     <%}
	else{
	ResultSet r=new Dao().viewVehicle(request.getParameter("id"));
	if(r!=null){
		
	r.next();
	%>
	<form action="../Modify_Vehicle" method="get">
    <table class="table table-responsive">
    	<tr>
        	<th height="40">Name</th>
            <td><input type="text" required class="form-control" name="name" /></td>
        </tr>
       
         <tr>
        	<th height="40">Type</th>
            <td>
            	<select class="form-control" name="type">
                	<option>-Select Type-</option>
                    <option value=""></option>
                    <option value=""></option>
                </select>
            </td>
        </tr>
        <tr>
        	<th height="40">Registration Number</th>
            <td><input type="text" class="form-control" name="reg_no" /></td>
        </tr>
        <tr>
        	<th height="40">Seating Capacity</th>
            <td><input type="text" required class="form-control" name="seating" /></td>
        </tr>
        <tr>
        	<th height="40">Fare Per km</th>
            <td><input type="text" class="form-control" name="fpk" /></td>
        </tr>
        
        
        <tr>
        	<th height="40">IMG</th>
            <td><input type="file" required class="form-control" name="img" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="btn-lg btn-success" name="send" value="SEND" /></td>
        </tr>
    </table>
    </form>
	<%
	}
	}
	
	%>
</div>	
  </div>  
<jsp:include page="view_vehicle.jsp"/>
<jsp:include page="footer.jsp"/>

</body>
</html>