<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>header</title>
 <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/modern-business.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    <!-- Animation -->
    <link rel="stylesheet" href="css/animate.css">
</head>

<body>
 <!-- Navigation Start -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.php">Admin Panel</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav pull-right">
                	<li>
                        <a href="pendings.jsp">Pending Bookings</a>
                    </li>
                	<li>
                        <a href="bookings.jsp">Confirm Bookings</a>
                    </li>
                    <li>
                        <a href="add_driver.jsp">Manage Driver</a>
                    </li>
                   
                    <li>
                        <a href="manage_vehicle.jsp">Manage Vehicle</a>
                    </li>
                    <li>
                        <a href="add_route.jsp">Manage Route</a>
                    </li>
                    
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <b class="glyphicon glyphicon-cog"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="../index.jsp">Logout</a>
                            </li>
                            
                        </ul>
                    </li>
                </ul>
                   		
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <!-- End navigation -->
    
    
    
     <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Script to Activate the Carousel -->
    <script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
    </script>

</body>
</html>
