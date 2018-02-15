<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Animation -->
    <link rel="stylesheet" href="css/animate.css">

</head>

<body style="background:url(images/login_background.jpg) no-repeat; background-size:cover;">
	
    <div class="container">
    	<div align="center" style="margin-top:20%; margin-left:20px;">       	
            	<a href="reg_form.jsp"><button style="width:40%;" class="btn-lg btn-info">Sign Up</button></a>
        </div>
        
        <div style="width:50%; margin-left:25%;">
        <form action="Validate" method="post">
        	<label>Email </label>
            <input type="email" name="email_id" class="form-control" placeholder="Enter your email" required>
            <label>Password</label>
            <input type="password" class="form-control" name="pass" placeholder="************" required><br>
            <input type="submit" value="SEND" name="send" class="btn-lg btn-warning" style="width:80%; margin-left:9%;">
        </form>    
        </div>
    </div>

</body>
</html>