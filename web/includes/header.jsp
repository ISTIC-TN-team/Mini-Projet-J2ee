<%@page import="panier.Panier"%>
<%@page import="beans.Client"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>TechShop</title>
        <script src="js/lib/angular.min.js"></script>
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">


    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/responsive.css">


 <!-------------------------------------->
  </head>
  <body>
  
    <div class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="user-menu">
                        <ul>
                           <!-- <li><a href="#"><i class="fa fa-user"></i> My Account</a></li>
                            <li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>-->
                           <%  if(session.getAttribute("client") != null ){  %>   <li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i>My Cart
                                   <%if(request.getSession().getAttribute("panier")!=null)
                                   {Panier p = (Panier)request.getSession().getAttribute("panier");%>(
                                   <%= p.getNumberArticle()%> )<% } %></a></li>
                           <li><a href="DeconnexionServlet"><i class="fa fa-user"></i>Logout</a></li>    <% }else{ %>
                            <li><a href="login.jsp"><i class="fa fa-user"></i> Login</a></li>
                                <li><a href="signup.jsp"><i class="fa fa-plus-circle"></i>Inscription</a></li>
                            <% } %>
                        </ul>
                    </div>
                </div>
                <%  if(session.getAttribute("client") != null ){Client c=(Client) session.getAttribute("client"); %> 
                <div class="col-md-4">
                    <div class="user-menu">
                        <ul>
                            <li> <a><p class="text-light bg-dark"> <%= c.getNom() %></p></a></li>
                            <li> <a><p class="text-light bg-dark">  <%= c.getPrenom()%></p> </a></li>
                        </ul>
                        
                    </div>
                </div>
                             <% } %>
            </div>
        </div>
    </div> <!-- End header area -->
<!-- logo
    <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        <h1><a href="./"><img src="img/logo.png"></a></h1>
                    </div>
                </div>

            </div>
        </div>
    </div> -->
    <!-- End site branding area -->
<br>
    <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="shop.jsp">Shop page</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div> <!-- End mainmenu area -->