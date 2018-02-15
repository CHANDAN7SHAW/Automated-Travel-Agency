<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Registration</title>
</head>

<body>
<jsp:include page="header.jsp"/>

<div class="container">
<div class="page-header">
	<h3>Registration Form</h3>
</div>	

<div class="container">
	<form action="Register" method="post">
    <table class="table table-responsive">
    	<tr>
        	<th height="40">First Name</th>
            <td><input type="text" required="required" class="form-control" name="fname" /></td>
        </tr>
        <tr>
        	<th height="40">Last Name</th>
            <td><input type="text" required="required" class="form-control" name="lname" /></td>
        </tr>
        <tr>
        	<th height="40">Gender</th>
            <td>
            	Male:<input type="radio" required="required" name="gen" value="Male"/>	
                Female:<input type="radio" required="required" name="gen" value="Female"/>
            </td>
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
            <td><input type="text" required="required" class="form-control" name="state" /></td>
        </tr>
        <tr>
        	<th height="40">City</th>
            <td><input type="text" class="form-control" name="city" /></td>
        </tr>
        <tr>
        	<th height="40">Pincode</th>
            <td><input type="text" required="required" class="form-control" name="pincode" /></td>
        </tr>
        <tr>
        	<th height="40">Mobile No</th>
            <td><input type="text" required="required" class="form-control" name="mobileno" /></td>
        </tr>
        <tr>
        	<th height="40">Email</th>
            <td><input type="email" required="required" class="form-control" name="email" /></td>
        </tr>
        <tr>
        	<th height="40">Password</th>
            <td><input type="password" required="required" class="form-control" name="password" pattern=".{6,}"   required title="6 characters minimum"/></td>
        </tr>
        <tr>
        	<th height="40">Confirm Password</th>
            <td><input type="password" required="required" class="form-control" name="password2" /></td>
            <td><input type="hidden" name="utype" value="u"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="btn-lg btn-success" name="send" value="SEND" /></td>
        </tr>
    </table>
    </form>
</div>
</div><!-- End container -->

<jsp:include page="footer.jsp"/>

</body>
</html>