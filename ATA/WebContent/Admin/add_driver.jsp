<!doctype html>
<%@page import="dao.Dao"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="utf-8">
<title>Manage Driver</title>
</head>

<body>
<jsp:include page="header.jsp"/>

	
  <div class="container" style="height:400px; overflow:auto;width:1400px">
	<div class="page-header">
		<h3>Add Driver</h3>
	</div>
    <div class="container">
      <%
    if(session.getAttribute("msg")!=null){
    	%>
    <h4 align="center"><%=(String)session.getAttribute("msg") %></h4>	
    	<%
    session.removeAttribute("msg");
    
    }
    %>
    <%if(request.getParameter("did")==null){ %>
	<form action="../Add_Driver" method="post">
	
    <table class="table table-responsive">
    	<tr>
        	<th height="40">Name</th>
            <td><input type="text" required class="form-control" name="name" /></td>
        </tr>
       
         <tr>
        	<th height="40">Street</th>
            <td><input type="text" class="form-control" name="street" /></td>
        </tr>
        <tr>
        	<th height="40">Location</th>
            <td><input type="text" class="form-control" name="location" /></td>
        </tr>
        <tr>
        	<th height="40">State</th>
            <td><input type="text" required class="form-control" name="state" /></td>
        </tr>
        <tr>
        	<th height="40">City</th>
            <td><input type="text" class="form-control" name="city" /></td>
        </tr>
        <tr>
        	<th height="40">Pincode</th>
            <td><input type="text" required class="form-control" name="pincode" /></td>
        </tr>
        <tr>
        	<th height="40">Mobile No</th>
            <td><input type="text" required class="form-control" name="mobile" /></td>
        </tr>
        <tr>
        	<th height="40">Email</th>
            <td><input type="email" required class="form-control" name="email" /></td>
        </tr>
        
        <tr>
        	<th height="40">License No</th>
            <td><input type="text" required class="form-control" name="licenseno" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="btn-lg btn-success" name="send" value="SEND" /></td>
        </tr>
    </table>
    </form>
     <%}
	else{
	ResultSet r=new Dao().viewDriver(request.getParameter("did"));
	if(r!=null){
		
	r.next();
	%>
	<form action="../Modify_Driver" method="post">
	<input type="hidden" value="<%=r.getString("driverid") %>" name="driverid"/>
    <table class="table table-responsive">
    	<tr>
        	<th height="40">Name</th>
            <td><input type="text" required class="form-control" name="name" value="<%=r.getString("name") %>" /></td>
        </tr>
       
         <tr>
        	<th height="40">Street</th>
            <td><input type="text" class="form-control" name="street" value="<%=r.getString("street") %>"/></td>
        </tr>
        <tr>
        	<th height="40">Location</th>
            <td><input type="text" class="form-control" name="location" value="<%=r.getString("location") %>" /></td>
        </tr>
        <tr>
        	<th height="40">State</th>
            <td><input type="text" required class="form-control" name="state" value="<%=r.getString("state") %>"/></td>
        </tr>
        <tr>
        	<th height="40">City</th>
            <td><input type="text" class="form-control" name="city" value="<%=r.getString("city") %>"/></td>
        </tr>
        <tr>
        	<th height="40">Pincode</th>
            <td><input type="text" required class="form-control" name="pincode" value="<%=r.getString("pincode") %>"/></td>
        </tr>
        <tr>
        	<th height="40">Mobile No</th>
            <td><input type="text" required class="form-control" name="mobile" value="<%=r.getString("mobileno") %>"/></td>
        </tr>
        <tr>
        	<th height="40">Email</th>
            <td><input type="email" required class="form-control" name="email" value="<%=r.getString("email") %>"/></td>
        </tr>
        
        <tr>
        	<th height="40">License No</th>
            <td><input type="text" required class="form-control" name="licenseno" value="<%=r.getString("licenseno") %>"/></td>
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
  <br><br>
<jsp:include page="view_driver.jsp"/>
<jsp:include page="footer.jsp"/>

</body>
</html>