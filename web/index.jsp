<%@page import="java.util.Random"%>
<!--**
 **@Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** @Date :2018 - 2019
 **/ -->
<%@page import="java.util.Vector"%>
<%@page import="beans.Article"%>
<%@page import="database.ArticleDao"%>
<%@include file="includes/header.jsp" %>
   <div class="product-big-title-area">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="product-bit-title text-center">
                                <h2>Home</h2>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    <div class="slider-area">
        	<!-- Slider -->
			<div class="block-slider block-slider4">
				<ul class="" id="bxslider-home4">
				
				  <% ArticleDao s=new ArticleDao();
                           Vector<Article> m=s.getArticles(5);
                        %>
                        <%      for (int k=0;k<m.size();k++)
          {Article promo = (Article) m.elementAt(k);
          %>	<li><img src="img/<%= promo.getImg()%>" alt="Slide">
						<div class="caption-group">
                                                    <h2 class="caption title">get one <%= promo.getLibelle()  %><br> <span class="primary"><% Random r = new Random();
int low = 10;
int high = 100;
int result = r.nextInt(high-low) + low; %> <strong>off</strong></span>
							
							<h5 class="caption subtitle"><%= promo.getQte()%> left</h5>
							<a class="caption button-radius" href="single-product.jsp?id=<%= promo.getIdArticle()%>"><span class="icon"></span>Shop now</a>
						</div><% } %>
					</li>
					<li>
				</ul>
			</div>
			<!-- ./Slider -->
    </div> <!-- End slider area -->

    <div class="promo-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
          
            <div class="row">   
                <div class="col-md-3 col-sm-6">
                    <div class="single-promo promo1">
                        <i class="fa fa-refresh"></i>
                        <p>30 Days return</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-promo promo2">
                        <i class="fa fa-truck"></i>
                        <p>Free shipping</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-promo promo3">
                        <i class="fa fa-lock"></i>
                        <p>Secure payments</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-promo promo4">
                        <i class="fa fa-gift"></i>
                        <p>New products</p>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End promo area -->

    <div class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title">Latest Products</h2>
                        <div class="product-carousel">
                                      <% ArticleDao p=new ArticleDao();
                           Vector<Article> v=p.getArticle();
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
    </div> <!-- End main content area -->

    <div class="brands-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="brand-wrapper">
                        <div class="brand-list">
                            <img src="img/brand1.png" alt="">
                            <img src="img/brand2.png" alt="">
                            <img src="img/brand3.png" alt="">
                            <img src="img/brand4.png" alt="">
                            <img src="img/brand5.png" alt="">
                            <img src="img/brand6.png" alt="">
                            <img src="img/brand1.png" alt="">
                            <img src="img/brand2.png" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End brands area -->

    <div class="product-widget-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                     <div class="single-product-widget">
                        <h2 class="product-wid-title">Top Sellers</h2>
                        <a href="shop.jsp" class="wid-view-more">View All</a>
                        <% ArticleDao menubot=new ArticleDao();
                           Vector<Article> vectorbot=menubot.getArticles(6);
                        %>
                           <%      for (int k=0;k<vectorbot.size();k++)
          {
          Article current = (Article) vectorbot.elementAt(k);%>
            <div class="col-md-4">
                        <div class="single-wid-product">
                            <a href="single-product.jsp?id=<%= current.getIdArticle()%>"><img src="<%= current.getImg()%>"class="product-thumb" alt=""></a>
                            <h2><a href="single-product.jsp?id=<%= current.getIdArticle()%>"><%= current.getLibelle() %></a></h2>
                            <div class="product-wid-rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                            <div class="product-wid-price">
                                 <ins>$<%= current.getPrix()%></ins> <del>$100.00</del>                           
                            </div>
                        </div>
                         </div>
                         <% }%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End product widget area -->
<%@include file="includes/footer.jsp" %>