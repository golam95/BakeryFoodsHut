
<%@include file="template/header.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.BakerymadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.ReviewServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PaidpackageServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.HomemadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Bakerymade"%>
<%@page import="com.bakeryfoodshut.model.Homemade"%>
<%@page import="com.bakeryfoodshut.model.Paidpackage"%>
<%@page import="com.bakeryfoodshut.model.Review"%>

<%
	ReviewServiceImpl reivewservice = new ReviewServiceImpl();
	BakerymadeServiceImpl bakerymadeservice = new BakerymadeServiceImpl();
	PaidpackageServiceImpl paidservice = new PaidpackageServiceImpl();
	HomemadeServiceImpl homemadeservice = new HomemadeServiceImpl();
%>

<section class="Productsection_item">
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<div class="col-md-3 col-sm-3">
					<div class="section-showproduct-left">
						<img src="resources/image/shop/discountbanner.PNG"
							alt="Cinque Terre" width="240" height="382">
					</div>
				</div>
				<div class="col-md-9 col-sm-9">
					<div class="section-showproduct-right">
						<%
							for (Bakerymade bakerymade : bakerymadeservice.getBakeryMadeInfo()) {
						%>

						<div style="border: 2px solid #F0F0F0; margin-bottom: 20px;"
							class="col-md-12">
							<div class="col-md-4">
								<div class="bakerynamesection">
									<h2
										style="font-size: 17px; font-weight: bold; padding-top: 9px; margin-bottom: 28px;">
										<a
											href="shopkeeperOwnerprofile.jsp?ownerDetails=<%=bakerymade.getBakeryEmail()%>"><i
											style="margin-right: 10px;" class="fa fa-shopping-basket"
											aria-hidden="true"></i><%=bakerymade.getBakeryShopname()%></a>
									</h2>
									<h5
										style="font-weight: bold; padding-bottom: 15px; font-size: 13px;">
										Location:
										<%=bakerymade.getBakeryShoplocation()%></h5>
									<h5
										style="font-weight: bold; padding-bottom: 6px; font-size: 13px;">
										Email:
										<%=bakerymade.getBakeryEmail()%></h5>
								</div>
							</div>
							<div class="col-md-3 col-md-offset-1">
								<div style="margin-top: 46px;" class="bakerynamesection">
									<h5
										style="font-weight: bold; font-size: 17px; color: green; text-align: center;">Approved
										by BSTI</h5>
								</div>
							</div>
							<%
								int count_Rev5 = 0;
									int count_Rev4 = 0;
									int count_Rev3 = 0;
									int count_Rev2 = 0;
									int count_Rev1 = 0;
									for (Review review : reivewservice.getreviewListEmail(bakerymade.getBakeryEmail())) {

										if (review.getRievewStar() == 5) {
											count_Rev5 += 1;
										} else if (review.getRievewStar() == 4) {
											count_Rev4 += 1;
										} else if (review.getRievewStar() == 3) {
											count_Rev3 += 1;
										} else if (review.getRievewStar() == 2) {
											count_Rev2 += 1;
										} else if (review.getRievewStar() == 1) {
											count_Rev1 += 1;
										}
									}
							%>
							<div class="col-md-3 col-md-offset-1">
								<ul>

									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i>
									</a><span>(<%=count_Rev5%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev4%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev3%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star-o"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev2%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev1%>)
									</span></li>
								</ul>
							</div>
						</div>

						<%
							}
						%>


					</div>


					<div class="section-showproduct-right">
						<%
							for (Paidpackage paidpackage : paidservice.getPaidpackageInfo()) {
						%>

						<div style="border: 2px solid #F0F0F0; margin-bottom: 20px;"
							class="col-md-12">
							<div class="col-md-4">
								<div class="bakerynamesection">
									<h2
										style="font-size: 17px; font-weight: bold; padding-top: 9px; margin-bottom: 28px;">
										<a
											href="shopkeeperOwnerprofile.jsp?ownerDetails=<%=paidpackage.getPaidEmail()%>"><i
											style="margin-right: 10px;" class="fa fa-shopping-basket"
											aria-hidden="true"></i><%=paidpackage.getPaidShopname()%></a>
									</h2>
									<h5
										style="font-weight: bold; padding-bottom: 15px; font-size: 13px;">
										Location:
										<%=paidpackage.getPaidShoplocation()%></h5>
									<h5
										style="font-weight: bold; padding-bottom: 6px; font-size: 13px;">
										Email:
										<%=paidpackage.getPaidEmail()%></h5>
								</div>
							</div>
							<div class="col-md-3 col-md-offset-1">
								<div style="margin-top: 46px;" class="bakerynamesection">
									<h5
										style="font-weight: bold; font-size: 17px; color: green; text-align: center;">Approved
										by BSTI</h5>
								</div>
							</div>
							<%
								int count_Rev5 = 0;
									int count_Rev4 = 0;
									int count_Rev3 = 0;
									int count_Rev2 = 0;
									int count_Rev1 = 0;
									for (Review review : reivewservice.getreviewListEmail(paidpackage.getPaidEmail())) {

										if (review.getRievewStar() == 5) {
											count_Rev5 += 1;
										} else if (review.getRievewStar() == 4) {
											count_Rev4 += 1;
										} else if (review.getRievewStar() == 3) {
											count_Rev3 += 1;
										} else if (review.getRievewStar() == 2) {
											count_Rev2 += 1;
										} else if (review.getRievewStar() == 1) {
											count_Rev1 += 1;
										}
									}
							%>
							<div class="col-md-3 col-md-offset-1">
								<ul>

									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i>
									</a><span>(<%=count_Rev5%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev4%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev3%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star-o"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev2%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev1%>)
									</span></li>
								</ul>
							</div>
						</div>

						<%
							}
						%>


					</div>


					<div class="section-showproduct-right">
						<%
							for (Homemade homemade : homemadeservice.getHomemadeageInfo()) {
						%>

						<div style="border: 2px solid #F0F0F0; margin-bottom: 20px;"
							class="col-md-12">
							<div class="col-md-4">
								<div class="bakerynamesection">
									<h2
										style="font-size: 17px; font-weight: bold; padding-top: 9px; margin-bottom: 28px;">
										<a
											href="shopkeeperOwnerprofile.jsp?ownerDetails=<%=homemade.getHomeEmail()%>"><i
											style="margin-right: 10px;" class="fa fa-shopping-basket"
											aria-hidden="true"></i>Home made</a>
									</h2>
									<h5
										style="font-weight: bold; padding-bottom: 15px; font-size: 13px;">
										Location:
										<%=homemade.getHomeAddress()%></h5>
									<h5
										style="font-weight: bold; padding-bottom: 6px; font-size: 13px;">
										Email:
										<%=homemade.getHomeEmail()%></h5>
								</div>
							</div>
							<div class="col-md-3 col-md-offset-1">
								<div style="margin-top: 46px;" class="bakerynamesection">
									<h5
										style="font-weight: bold; font-size: 17px; color: red; text-align: center;">Not
										Approved by BSTI</h5>
								</div>
							</div>
							<%
								int count_Rev5 = 0;
									int count_Rev4 = 0;
									int count_Rev3 = 0;
									int count_Rev2 = 0;
									int count_Rev1 = 0;
									for (Review review : reivewservice.getreviewListEmail(homemade.getHomeEmail())) {

										if (review.getRievewStar() == 5) {
											count_Rev5 += 1;
										} else if (review.getRievewStar() == 4) {
											count_Rev4 += 1;
										} else if (review.getRievewStar() == 3) {
											count_Rev3 += 1;
										} else if (review.getRievewStar() == 2) {
											count_Rev2 += 1;
										} else if (review.getRievewStar() == 1) {
											count_Rev1 += 1;
										}
									}
							%>
							<div class="col-md-3 col-md-offset-1">
								<ul>

									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i>
									</a><span>(<%=count_Rev5%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev4%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev3%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star-o"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev2%>)
									</span></li>
								</ul>
								<ul>
									<li><a href="#"> <i class="fa fa-star"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</a><span>(<%=count_Rev1%>)
									</span></li>
								</ul>
							</div>
						</div>

						<%
							}
						%>


					</div>





				</div>
			</div>
		</div>
	</div>
</section>

<section style="margin-top: 8px; margin-bottom: 50px;"
	class="confirmpackage_area">
	<div class="container">
		<div class="row"></div>
	</div>
</section>

<%@include file="template/footer.jsp"%>