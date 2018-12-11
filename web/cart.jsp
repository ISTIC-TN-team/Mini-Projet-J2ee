<!--**
 **@Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** @Date :2018 - 2019
 **/ -->
    <%@page import="java.util.ArrayList"%>
<%@page import="panier.LignePanier"%>
<%@page import="panier.Panier"%>
<%@include file="includes/header.jsp" %>
<div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>Shopping Cart</h2>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End Page title area -->


    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
     
                </div>

                <div class="col-md-12">
                    <div class="product-content-right">
                        <div class="woocommerce">
                            <form method="post" action="#">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        
                                        <tr>
                                       
                                            <th class="product-name" colspan="3">Product</th>
                                            <th class="product-price">Price</th>
                                            <th class="product-quantity">Quantity</th>
                                            <th class="product-subtotal">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
<% if(session.getAttribute("client") != null ){ Panier p = (Panier)request.getSession().getAttribute("panier");
     ArrayList<LignePanier> prod=p.getLignesPanier();
     if(prod.size()>0)
     {     double total=0;
     for(int i = 0 ; i < prod.size(); i++){
         total+=prod.get(i).getArticle().getPrix()*prod.get(i).getQuantite();
%>
                               <tr class="cart_item">
                                            <td class="product-remove">
                                                <a title="Remove this item" class="remove" href="panier?op=rem&sender=cart.jsp&id=<%= prod.get(i).getArticle().getIdArticle() %>">×</a>
                                            </td>

                                            <td class="product-thumbnail">
                                                <a href="single-product.jsp?id=<%= prod.get(i).getArticle().getIdArticle() %>"><img width="145" height="145" alt="poster_1_up" class="shop_thumbnail" src="<%= prod.get(i).getArticle().getImg()%>"></a>
                                            </td>

                                            <td class="product-name">
                                                <a href="single-product.jsp?id=<%= prod.get(i).getArticle().getIdArticle() %>">
                                                    <%= prod.get(i).getArticle().getLibelle() %>
                                                     <%=  prod.size()%>
                                                    
                                                    
                                                </a>
                                            </td>

                                            <td class="product-price">
                                                <span class="amount">$<%= prod.get(i).getArticle().getPrix()%></span>
                                            </td>

                                            <td class="product-quantity">
                                                <div class="quantity buttons_added">
                                                   <%= prod.get(i).getQuantite() %>
                                                </div>
                                            </td>

                                            <td class="product-subtotal">
                                                <span class="amount">$<%=  prod.get(i).getArticle().getPrix()*prod.get(i).getQuantite() %></span>
                                            </td>
                                        <tr><% } %>
                                            <td class="actions" colspan="6">
                                                <div class="coupon">
                                                    <label for="coupon_code">TOTAL :</label>
                                                               <%= total %> 
                                                </div>
                                                <a href="checkout.jsp" class=" btn btn-info">Buy</a>
                                                <a href="cart.jsp?total=<% %>" value="Checkout" name="proceed" class="checkout-button button alt wc-forward"><a>
                                            </td>
                                        </tr>
                                    </tbody><% }else{ %>
                                    <tr class="cart_item">
                                            <td class="product-remove">
                                            </td>

                                            <td class="product-thumbnail">
                                            </td>

                                            <td class="product-name">
                                        
                                            </td>

                                            <td class="product-price">
                                            </td>

                                            <td class="product-quantity">
                                              
                                            </td>

                                            <td class="product-subtotal">
                                                
                                            </td>
                                        <tr>
                                             <tr>
                                            <td class="actions" colspan="6">
                                                <div class="coupon">
                                                    <label for="coupon_code">TOTAL :</label>
                                                               $0
                                                </div>
                                                <a href="checkout.jsp" class=" btn btn-info" disabled="disabled"
                                                   accesskey="">Buy</a>
                                                <a href="cart.jsp?total=<% %>" value="Checkout" name="proceed" class="checkout-button button alt wc-forward"><a>
                                            </td>
                                        </tr>
                                    </tbody>
                                    <% }}else{  response.sendRedirect("login.jsp");  }   %>
                                </table>
                            </form>

                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%@include file="includes/footer.jsp" %>