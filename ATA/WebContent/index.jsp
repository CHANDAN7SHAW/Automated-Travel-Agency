<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home</title>

</head>

<body>
<jsp:include page="header.jsp"/>

<!-- Header Carousel -->
    <header id="myCarousel" class="carousel slide">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
            <div class="item active">
                <div class="fill" style="background-image:url(images/desktop-india-cars-photos-dowload.jpg);"></div>
                <div class="carousel-caption">
                    <h2></h2>
                </div>
            </div>
            <div class="item">
                <div class="fill" style="background-image:url(images/chevrolet-cruze-wallpaper-7.jpg);"></div>
                <div class="carousel-caption">
                    <h2></h2>
                </div>
            </div>
            <div class="item">
                <div class="fill" style="background-image:url(images/IMG_9400-L.jpg);"></div>
                <div class="carousel-caption">
                    <h2></h2>
                </div>
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="icon-prev"></span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="icon-next"></span>
        </a>
    </header>

    <!-- Page Content -->
    <div class="container">

        <!-- Marketing Icons Section -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header animated bounceInLeft">
                    Welcome to Book My Ride
                </h1>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                   <div class="panel-heading">
                        <h4><i class="fa fa-fw fa-check"></i> Corporate Package </h4>
                    </div>
                    <div class="panel-body">
                        <a href="#">
                    <img class="img-responsive img-portfolio img-hover" src="images/a.jpg" alt="">
                </a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4><i class="fa fa-fw fa-gift"></i> Airport Transfers</h4>
                    </div>
                    <div class="panel-body">
                        <a href="#">
                    <img class="img-responsive img-portfolio img-hover" src="images/b.jpg" alt="">
                </a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4><i class="fa fa-fw fa-compass"></i> Easy to Use</h4>
                    </div>
                    <div class="panel-body">
                         <a href="#">
                    <img class="img-responsive img-portfolio img-hover" src="images/c.jpg" alt="">
                </a>
                    </div>
                </div>
            </div>
        </div>
        <!-- /.row -->  

	 <!-- Portfolio Section 
        <div class="row">
            <div class="col-lg-12">
                <h2 class="page-header">Portfolio Heading</h2>
            </div>
            <div class="col-md-4 col-sm-6">
                <a href="#">
                    <img class="img-responsive img-portfolio img-hover" src="images/a.jpg" alt="">
                </a>
            </div>
            <div class="col-md-4 col-sm-6">
                <a href="#">
                    <img class="img-responsive img-portfolio img-hover" src="images/b.jpg" alt="">
                </a>
            </div>
            <div class="col-md-4 col-sm-6">
                <a href="#">
                    <img class="img-responsive img-portfolio img-hover" src="images/c.jpg" alt="">
                </a>
            </div>
        </div><!-- End row -->
      </div>
      <jsp:include page="footer.jsp"/>
</body>
</html>
