<!--**
 **@Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** @Date :2018 - 2019
 **/ -->
<%@page import="beans.Article"%>
<%@page import="java.util.Vector"%>
<%@page import="database.ArticleDao"%>
<%@include file="includes/header.jsp" %>

            <div class="product-big-title-area">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="product-bit-title text-center">
                                <h2>Shop</h2>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <div class="single-product-area">
                <div class="zigzag-bottom"></div>
                <div class="container">
                    
                    
                    <!-- affichage des prods  -->
                    
                    <div class="row">
                        <% ArticleDao a=new ArticleDao();
                           Vector<Article> v=a.getArticle();
                        %>
                        <%      for (int k=0;k<v.size();k++)
          {
          Article current = (Article) v.elementAt(k);%>
         
                           <div class="col-md-4 col-sm-6 col-xs-6">
                            <div class="single-shop-product">
                                <div class="product-upper">
                                    <img src="<%= current.getImg()%>" alt="">
                                </div>
                                <h2><a><%= current.getLibelle() %> </a></h2>
                                <div class="product-carousel-price">
                                    <ins>$<%= current.getPrix()%></ins> <del>$999.00</del>
                                </div>

                                <div class="product-option-shop">
                                    <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="single-product.jsp?id=<%= current.getIdArticle()%>">Add to cart</a>
                                </div>
                            </div>
                        </div>
                                <% } %>
                    </div>
                    
                    
                    <div class="row">
                        <div class="col-md-12">
                            <div class="product-pagination text-center">
                                <nav>
                                    <ul class="pagination">
                                        <li>
                                            <a href="#" aria-label="Previous">
                                                <span aria-hidden="true">&laquo;</span>
                                            </a>
                                        </li>
                                        <li><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li>
                                            <a href="#" aria-label="Next">
                                                <span aria-hidden="true">&raquo;</span>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                     
            </div>


         <%@include file="includes/footer.jsp" %>