<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Contact</title>


</head>

<body>

<jsp:include page="header.jsp"/> 

    

    <!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Contact</h1>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
            <!-- Map Column -->
            <div class="col-md-8">
                <!-- Embedded Google Map -->
                
                <iframe src="https://www.google.com/maps/embed?pb=!1m23!1m12!1m3!1d3658.302734397621!2d87.3410495!3d23.5216116!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m8!3e6!4m0!4m5!1s0x39f7704e7c98dd89%3A0x353fcea99cc1ad56!2sBengal+College+Of+Engineering+%26+Technology%2C+Sahid+Sukumar+Banerjee+Sarani%2C+Bidhannagar%2C+Durgapur%2C+West+Bengal+713212!3m2!1d23.5216116!2d87.3410495!5e0!3m2!1sen!2sin!4v1442509071015" width="100%" height="400" frameborder="0" style="border:0" allowfullscreen></iframe>
        <!--   <iframe src="https://www.google.co.in/maps/place/Bengal+College+Of+Engineering+%26+Technology,+Sahid+Sukumar+Banerjee+Sarani,+Bidhannagar,+Durgapur,+West+Bengal+713212/@23.5216116,87.3410495,17z/data=!4m2!3m1!1s0x39f7704e7c98dd89:0x353fcea99cc1ad56" width="100%" height="400" frameborder="0" style="border:0" allowfullscreen></iframe>  -->
            </div>
            <!-- Contact Details Column -->
            <div class="col-md-4">
                <h3>Contact Details</h3>
                <p>
                    3481 Melrose Place<br>Beverly Hills, CA 90210<br>
                </p>
                <p><i class="fa fa-phone"></i> 
                    <abbr title="Phone">P</abbr>: (123) 456-7890</p>
                <p><i class="fa fa-envelope-o"></i> 
                    <abbr title="Email">E</abbr>: <a href="mailto:name@example.com">name@example.com</a>
                </p>
                <p><i class="fa fa-clock-o"></i> 
                    <abbr title="Hours">H</abbr>: Monday - Friday: 9:00 AM to 5:00 PM</p>
                <ul class="list-unstyled list-inline list-social-icons">
                    <li>
                        <a target="_blank" href="https://www.facebook.com/pages/Ankan-Php-Developer/969181853115029?ref=aymt_homepage_panel"><i class="fa fa-facebook-square fa-2x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-google-plus-square fa-2x"></i></a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- /.row -->

        <!-- Contact Form -->
        <!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
        <div class="row">
            <div class="col-md-8">
                <h3>Send us a Message</h3>
                <form action="#" method="post">
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>Full Name:</label>
                            <input type="text" class="form-control" id="name" required="required" name="fname">
                            <p class="help-block"></p>
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>Phone Number:</label>
                            <input type="tel" class="form-control" id="phone" required="required" name="tel">
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>Email Address:</label>
                            <input type="email" class="form-control" required="required" name="email">
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>Message:</label>
                            <textarea rows="10" cols="100" class="form-control" maxlength="999" style="resize:none" name="message"></textarea>
                        </div>
                    </div>
                    <div id="success"></div>
                    <!-- For success/fail messages -->
                    <button type="submit" class="btn btn-primary">Send Message</button>
                </form>
            </div>

        </div>
        </div>
        <!-- /.row -->

	
<jsp:include page="footer.jsp"/>
</body>
</html>
