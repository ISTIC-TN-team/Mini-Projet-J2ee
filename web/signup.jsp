<!--**
 **@Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** @Date :2018 - 2019
 **/ -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!--Include the above in your HEAD tag -->

<div class="view full-page-intro" style="background-image: url('https://www.google.com.np/imgres?imgurl=https%3A%2F%2Fwww.w3schools.com%2Fw3css%2Fimg_lights.jpg&imgrefurl=https%3A%2F%2Fwww.w3schools.com%2Fw3css%2Fw3css_images.asp&docid=R0KnAtfyBDsyiM&tbnid=kwgHAQqTiLQXLM%3A&vet=10ahUKEwj5z9nr277bAhWBbX0KHZzyAS8QMwitASgBMAE..i&w=600&h=400&bih=702&biw=1366&q=image&ved=0ahUKEwj5z9nr277bAhWBbX0KHZzyAS8QMwitASgBMAE&iact=mrc&uact=8'); background-repeat: no-repeat; background-size: cover;">
        <div class="mask rgba-black-light d-flex justify-content-center align-items-center">
          <div class="container">
            <div class="row wow fadeIn">
              <div class="col-md-6 mb-4 white-text text-center text-md-left">
                <h1 class="display-4 font-weight-bold">Sign UP</h1>
                <hr class="hr-light">
                <p>
                  <strong>For the more information</strong>
                </p>
                <p class="mb-4 d-none d-md-block">
                  <strong>Quickly get information from new leads and customers by signing up .WIth their information, you can funnel them into new accounts in an instant.Follow us on FACEBOOK</strong>
                </p>
                <a href="http:/www.facebook.com" target="_blank"  class="btn btn-indigo btn-lg">Facebook
                  <i class="fa fa-facebook ml-2"></i>
                </a>
              </div>
              <div class="col-md-6 col-xl-5 mb-4">
                <div class="card">
                  <div class="card-body">
                      <form action="signup" method="post">
                      <p class="h4 text-center mb-4">Sign up</p>
                      <div class="md-form">
                         <i class="fa fa-user prefix grey-text"></i>
                                                  <label for="materialFormRegisterNameEx">Your first name</label>
                         <input type="text" id="materialFormRegisterNameEx" class="form-control" name="name">
                      </div>
                      <div class="md-form">
                         <i class="fa fa-user prefix grey-text"></i>
                                                  <label for="materialFormRegisterNameEx">Your last name</label>
                         <input type="text" id="materialFormRegisterNameEx" class="form-control" name="lastname">
                      </div>
                      <div class="md-form">
                         <i class="fa fa-envelope prefix grey-text"></i>
                                                  <label for="materialFormRegisterEmailEx">Your email</label>
                         <input type="email" id="materialFormRegisterEmailEx" class="form-control" name="email">
                      </div>
                      <div class="md-form">
                         <i class="fa fa-exclamation-triangle prefix grey-text"></i>
                                                  <label for="materialFormRegisterConfirmEx">Confirm your email</label>
                         <input type="email" id="materialFormRegisterConfirmEx" class="form-control" name="confirm_email">
                      </div>
                      <div class="md-form">
                        <i class="fa fa-lock prefix grey-text"></i>
                                                <label for="materialFormRegisterPasswordEx" >Your password</label>
                        <input type="password" id="materialFormRegisterPasswordEx" name="password" class="form-control">
                      </div>
                      <div class="md-form">
                            <i class="fa fa-exclamation-triangle prefix grey-text"></i>
                                                        <label for="materialFormRegisterPasswordEx" name="confirm_password">Confirm Your password</label>
                            <input type="password" id="materialFormRegisterConfirmEx" name="password" class="form-control">
                      </div>
                      <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="defaultCheck12">
                            <label for="defaultCheck12" class="grey-text">Accept the
                                <a href="#" class="blue-text"> Terms and Conditions</a>
                            </label>
                        </div>
                      <div class="text-center mt-4">
                           <% if(request.getParameter("msg")!=null){ %>
        <div class="alert alert-danger" role="alert">
            <strong><%= request.getParameter("msg") %> </strong>
        </div>
        <% }%> 
                       <button class="btn btn-primary" type="submit" data-toggle="modal" data-target="#myModal">Register</button>
                      
                   </form> 
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
   
