<!doctype html>
<%@page import="dao.Dao"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="utf-8">
<title>Manage Route</title>
</head>

<body>
<jsp:include page="header.jsp"/>
	
  <div class="container">
	<div class="page-header">
		<h3>ADD Route</h3>
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
	<%if(request.getParameter("rid")==null){ %>
	<form action="../Add_Route" method="post">
    <table class="table table-responsive">
    	<tr>
        	<th height="40">Source</th>
            <td><input type="text" required class="form-control" name="source" /></td>
        </tr>
       
         
        <tr>
        	<th height="40">Destination</th>
            <td><input type="text" class="form-control" name="desti" /></td>
        </tr>
        
        
        <tr>
        	<th height="40">Travel Duration</th>
            <td><input type="text" required class="form-control" name="tradu" /></td>
        </tr>
        <tr>
        	<th height="40">Distance</th>
            <td><input type="text" required class="form-control" name="dist" /></td>
        </tr>
         <tr>
        	<th height="40">Total Fare</th>
            <td><input type="text" required class="form-control" name="fare" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="btn-lg btn-success" name="send" value="ADD" /></td>
        </tr>
    </table>
    </form>
    <%}
	else{
	ResultSet r=new Dao().viewRoute(request.getParameter("rid"));
	if(r!=null){
		
	r.next();
	%>
	<form action="../Modify_Route" method="get">
	<input type="hidden" value="<%=r.getString("routeid") %>" name="routeid"/>
    <table class="table table-responsive">
    
    	<tr>
        	<th height="40">Source</th>
            <td><input type="text" required class="form-control" name="source" value="<%=r.getString("source") %>" /></td>
        </tr>
       
         
        <tr>
        	<th height="40">Destination</th>
            <td><input type="text" class="form-control" name="desti"  value="<%=r.getString("destination") %>"/></td>
        </tr>
        
        
        <tr>
        	<th height="40">Travel Duration</th>
            <td><input type="text" required class="form-control" name="tradu" value="<%=r.getString("travelduration")%>" /></td>
        </tr>
        <tr>
        	<th height="40">Distance</th>
            <td><input type="text" required class="form-control" name="dist" value="<%=r.getString("distance")%>" /></td>
        </tr>
        <tr>
        	<th height="40">Total Fare</th>
            <td><input type="text" required class="form-control" name="fare" value="<%=r.getString("fare") %>"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="btn-lg btn-success" name="send" value="UPDATE" /></td>
        </tr>
    </table>
    </form>
	
	<%
	}
	}
	
	%>
</div>	
  </div>  
  
<jsp:include page="view_route.jsp"/>
<jsp:include page="footer.jsp"/>

</body>
</html>