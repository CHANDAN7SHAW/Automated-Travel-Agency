<!doctype html>
<%@page import="dao.Dao"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="utf-8">
<title>Profile</title>
</head>

<body>
<jsp:include page="header.jsp"/>

	
  <div class="container" style="height:1400px; overflow:auto;width:1400px">
	<div class="page-header">
		<h3>Update Profile</h3>
	</div>
    <div class="container">
      <%
    if(session.getAttribute("msg")!=null){
    	%>
    <h4 align="center"><%=(String)session.getAttribute("msg") %></h4>	
    	<%
    session.removeAttribute("msg");
    
    }
    
      
    ResultSet r=new Dao().viewUserProfile((String)session.getAttribute("uid"));
	if(r!=null){
		
	r.next(); %>
	<form action="../UpdateUser" method="post">
	
    <table class="table table-responsive">
    	<tr>
        	<th height="40">First Name</th>
            <td><input type="text" required="required" class="form-control" name="fname" value="<%=r.getString(2) %>" /></td>
        </tr>
        <tr>
        	<th height="40">Last Name</th>
            <td><input type="text" required="required" class="form-control" name="lname" value="<%=r.getString(3) %>"/></td>
        </tr>
        <tr>
        	<th height="40">Gender</th>
            <td><input type="text" required="required" class="form-control" name="gen" value="<%=r.getString(4) %>"/></td>
        </tr>
         <tr>
        	<th height="40">Street</th>
            <td><input type="text" class="form-control" name="street" value="<%=r.getString(5) %>"/></td>
        </tr>
        <tr>
        	<th height="40">Location</th>
            <td><input type="text" class="form-control" name="location" value="<%=r.getString(6) %>"/></td>
        </tr>
        <tr>
        	<th height="40">State</th>
            <td><input type="text" required="required" class="form-control" name="state" value="<%=r.getString(8) %>"/></td>
        </tr>
        <tr>
        	<th height="40">City</th>
            <td><input type="text" class="form-control" name="city" value="<%=r.getString(7) %>"/></td>
        </tr>
        <tr>
        	<th height="40">Pincode</th>
            <td><input type="text" required="required" class="form-control" name="pincode" value="<%=r.getString(9) %>" /></td>
        </tr>
        <tr>
        	<th height="40">Mobile No</th>
            <td><input type="text" required="required" class="form-control" name="mobileno" value="<%=r.getString(10) %>"/></td>
        </tr>
        <tr>
        	<th height="40">Email</th>
            <td><input type="email" required="required" class="form-control" name="email" value="<%=r.getString(11) %>"/></td>
        </tr>
        <tr>
        	<th height="40">Password</th>
            <td><input type="password" required="required" class="form-control" name="password" /></td>
        </tr>
        <tr>
        	<th height="40">Confirm Password</th>
            <td><input type="password" required="required" class="form-control" name="password2" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="btn-lg btn-success" name="send" value="SEND" /></td>
        </tr>
    </table>
    </form>
     <%}%>
	
  
</div>	
  </div>  
  <br><br>

<jsp:include page="footer.jsp"/>

</body>
</html>