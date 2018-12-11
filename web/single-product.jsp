<!--**
 **@Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** @Date :2018 - 2019
 **/ -->
<%@page import="java.util.Vector"%>
<%@page import="database.ArticleDao"%>
<%@page import="beans.Article"%>
<%@include file="includes/header.jsp" %>
<% 
    int id = -1;
    
    if(request.getParameter("id") != null)
     id = (Integer.parseInt(request.getParameter("id")));
    
    Article article = (new ArticleDao()).getArticle(id);
    
    if(article == null)
        article = new Article(0,"", "",0, "", 0,null);
    
%>
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>Single product</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
            

                <div class="col-md-12">
                    <div class="product-content-right">
                        

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="product-images">
                                    <div class="product-main-img">
                                        <img src="<%= article.getImg()%>" alt="">
                                    </div>

                                </div>
                            </div>

                            <div class="col-sm-6">
                                <div class="product-inner">
                                    <h2 class="product-name"><%= article.getLibelle() %></h2>
                                    <div class="product-inner-price">
                                        <ins>$<%= article.getPrix()%></ins> <del>$100.00</del>
                                    </div>

                                    <div class="cart">
                                        <div class="quantity">
                                            <input type="number" size="4" class="input-text qty text" title="Qty" max="<%= article.getQte()%>" value="1" name="quantity" min="1" step="1">
                                        </div>
                                        <a href="panier?op=add&sender=cart.jsp&id=<%= article.getIdArticle()%>" class="add_to_cart_button" type="submit">Add to cart</a>
                                   </div

                                  

                                    <div role="tabpanel">
                                    
                                        <div class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade in active" id="home">
                                                <h2>Product Description</h2>
                                                <p><%= article.getDesc()%></p>
                                            </div>
                                            
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>


                        <div class="related-products-wrapper">
                            <h2 class="related-products-title">Related Products</h2>
                            <div class="related-products-carousel">
                                        <% ArticleDao a=new ArticleDao();
                           Vector<Article> v=a.getArticle();
                        %>
                        <%      for (int k=0;k<v.size();k++)
          {
          Article current = (Article) v.elementAt(k);%>
                                <div class="single-product">
                             
                                    <div class="product-f-image">
                                        <img src="<%= current.getImg()%>" alt="">
                                        <div class="product-hover">
                                            <a href="panier?op=add&sender=index.jsp&id=<%= current.getIdArticle()%>" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Add to cart</a>
                                            <a href="single-product.jsp?id=<%= current.getIdArticle()%>" class="view-details-link"><i class="fa fa-link"></i> See details</a>
                                        </div>
                                    </div>

                                    <h2><a href="single-product.jsp?id=<%= current.getIdArticle()%>"><%= current.getLibelle() %></a></h2>

                                    <div class="product-carousel-price">
                                        <ins>$<%= current.getPrix()%></ins> <del>$100.00</del>
                                    </div>
                                </div>
                                   <% }%>
                                
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%@include file="includes/footer.jsp" %>