<%@include file="template/header.jsp"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageprofileInfoServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.ManageprofileInfo"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageStaticesServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.HomemadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.BakerymadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PaidpackageServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.ReviewServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Homemade"%>
<%@page import="com.bakeryfoodshut.model.Bakerymade"%>
<%@page import="com.bakeryfoodshut.model.Paidpackage"%>
<%@page import="com.bakeryfoodshut.model.Review"%>

<%
	ManageprofileInfoServiceImpl manageprofileService = new ManageprofileInfoServiceImpl();
	ManageStaticesServiceImpl managestatistic = new ManageStaticesServiceImpl();
	HomemadeServiceImpl homemade = new HomemadeServiceImpl();
	BakerymadeServiceImpl bakerymade = new BakerymadeServiceImpl();
	PaidpackageServiceImpl paidmade = new PaidpackageServiceImpl();
	ReviewServiceImpl reivewservice = new ReviewServiceImpl();
%>

<section class="Productsection_item">
	<%
		String ownerDetails = "";
		if (request.getParameter("ownerDetails") == null) {
	%>
	<%
		response.sendRedirect("fooditempost.jsp");
	%>
	<%
		} else {

			ownerDetails = (String) request.getParameter("ownerDetails");
			if (ownerDetails.equals("")) {
	%>
	<%
		response.sendRedirect("fooditempost.jsp");
	%>
	<%
		} else {

				if (manageprofileService.checkEmail(ownerDetails) == true) {
					ManageprofileInfo profile = manageprofileService.getManageprofileInfo(ownerDetails);

					Bakerymade bakery = bakerymade.getBakerymadeInfo(ownerDetails);
					Paidpackage paid = paidmade.getPaidpackageInfo(ownerDetails);
					Homemade home = homemade.getHomemadeInfo(ownerDetails);
	%>
	<div class="container">
		<div class="row">
			<div style="min-height: 133px;" class="optionsection">

				<div style="margin-bottom: 30px;" class="col-md-12">
					<div class="col-md-4">
						<%
							if (homemade.checkEmail(ownerDetails) == true) {
						%>
						<h4 style="padding: 10px;">
							<i class="fa fa-building" aria-hidden="true"></i> Homemade
							Bakery, 131 review
						</h4>
						<h4 style="padding: 10px;">
							<i class="fa fa-map-marker" aria-hidden="true"></i> Location,
							<%=home.getHomeAddress()%>
						</h4>
						<%
							} else if (bakerymade.checkEmail(ownerDetails) == true) {
						%>
						<h4 style="padding: 10px;">
							<i class="fa fa-building" aria-hidden="true"></i>
							<%=bakery.getBakeryShopname()%>, 131 review
						</h4>
						<h4 style="padding: 10px;">
							<i class="fa fa-map-marker" aria-hidden="true"></i> Location,
							<%=bakery.getBakeryAddress()%>
						</h4>
						<%
							} else {
						%>
						<h4 style="padding: 10px;">
							<i class="fa fa-building" aria-hidden="true"></i>
							<%=paid.getPaidShopname()%>, 131 review
						</h4>
						<h4 style="padding: 10px;">
							<i class="fa fa-map-marker" aria-hidden="true"></i> Location,
							<%=paid.getPaidShoplocation()%>
						</h4>
						<%
							}
						%>



						<h4 style="padding: 10px;">
							<i class="fa fa-map-marker" aria-hidden="true"></i> Weekend
							Vacation:
							<%=profile.getVacation()%>
						</h4>
					</div>
					<div class="col-md-2">
						<h4 style="margin-top: 30px;">
							<i class="fa fa-pencil-square-o" aria-hidden="true"></i> Total
							Post:
							<%=managestatistic.TotalPost(ownerDetails)%>
						</h4>
					</div>
					<div class="col-md-2">
						<h4 style="margin-top: 30px; margin-left: 3px">
							<a href="<%=profile.getWeblink()%>"><i class="fa fa-rss"
								aria-hidden="true"></i> <%=profile.getWeblink()%></a>
						</h4>
					</div>
					<div class="col-md-4">
						<h4 style="padding: 10px; margin-left: 40px;">
							<i class="fa fa-home" aria-hidden="true"></i> Open shop at:-<%=profile.getOpenshop()%>
						</h4>
						<h4 style="padding: 10px; margin-left: 40px;">
							<i class="fa fa-home" aria-hidden="true"></i> Close shop at:-<%=profile.getCloseshop()%>
						</h4>
						<a
							style="background: #E33F23; width: 222px; color: #FFFFFF; margin-left: 50px; margin-top: 4px; font-weight: bold;"
							href="viewMypostdetails.jsp?mypostDetails=<%=profile.getEmail()%>"
							class="btn">My post</a>
					</div>
				</div>


				<div class="col-md-12 col-sm-12">
					<div class="col-md-3 col-sm-3">
						<div class="section-showproduct-left">


							<img style="margin-left: 40px;"
								src="uploads/profileimg/<%=profile.getImg()%>"
								class="img-circle" alt="Cinque Terre" width="150px"
								height="150px">
							<%
								if (homemade.checkEmail(ownerDetails) == true) {
							%>
							<h4>
								Name:
								<%=home.getHomeName()%></h4>
							<%
								} else if (bakerymade.checkEmail(ownerDetails) == true) {
							%>
							<h4>
								Name:
								<%=bakery.getBakeryName()%></h4>
							<%
								} else {
							%>
							<h4>
								Name:
								<%=paid.getPaidName()%></h4>
							<%
								}
							%>



							<%
								if (homemade.checkEmail(ownerDetails) == true) {
							%>
							<br />
							<%
								} else {
							%>
							<img style="margin-left: 60px;"
								src="<c:url value="/resources/image/shop/logo.PNG" />"
								class="img-circle" alt="Cinque Terre" width="110px"
								height="70px">
							<h6
								style="text-align: center; font-weight: bold; font-size: 18px; margin-bottom: 20px; margin-top: 3px; color: green;">(By
								Approved)</h6>

							<%
								}
							%>
							<h6
								style="margin-left: 15px; margin-bottom: 6px; text-decoration: underline;">
								<i class="fa fa-envelope-o" aria-hidden="true"></i><a href="#">
									Email: <%=profile.getEmail()%></a>
							</h6>



							<%
								if (homemade.checkEmail(ownerDetails) == true) {
							%>
							<h5>
								<i class="fa fa-phone" aria-hidden="true"></i> Phone:
								<%=home.getHomePhone()%>
							</h5>
							<h5>
								<i class="fa fa-map-marker" aria-hidden="true"></i> Address:<%=home.getHomeAddress()%>
							</h5>

							<%
								} else if (bakerymade.checkEmail(ownerDetails) == true) {
							%>
							<h5>
								<i class="fa fa-phone" aria-hidden="true"></i> Phone:
								<%=bakery.getBakeryPhone()%>
							</h5>
							<h5>
								<i class="fa fa-map-marker" aria-hidden="true"></i> Address:
								<%=bakery.getBakeryAddress()%>
							</h5>
							<%
								} else {
							%>
							<h5>
								<i class="fa fa-phone" aria-hidden="true"></i> Phone:
								<%=paid.getPaidPhone()%>
							</h5>
							<h5>
								<i class="fa fa-map-marker" aria-hidden="true"></i> Address:<%=paid.getPaidAddress()%>
							</h5>
							<%
								}
							%>
							<h5>
								<i class="fa fa-users" aria-hidden="true"></i><a href="#"> <%=profile.getWeblink()%></a>
							</h5>
							<div class="form-group">
								<br />
								<button
									style="background: #331A00; width: 222px; color: #FFFFFF;"
									type="submit" class="btn" data-target="#loginModal"
									data-toggle="modal">Send Message</button>
							</div>
						</div>







						<div class="container">
							<div class="row">
								<div class="col-xs-12">
									<div class="modal" id="loginModal" tabindex="-1">
										<div style="width: 500px;" class="modal-dialog">
											<form>
											<div style="margin-top: 140px;" class="modal-content">
												<div
													style="background: #22202E; border-bottom: 5px solid #D3943D;"
													class="modal-header">
													<button style="color: #FFFFFF;" class="close"
														data-dismiss="modal">&times;</button>
													<h4 style="color: #FFFFFF; font-size: 17px;"
														class="modal-title">
														<i style="font-size: 27px;" class="fa fa-comments"
															aria-hidden="true"></i><span style="padding-left: 5px;">Send
															Message</span>
													</h4>
												</div>
												<div class="modal-body">
													
														<div class="form-group">
															<input type="hidden" id="shopkeeperemail"
																value="<%=ownerDetails%>" /> <label for="inputUserName">Email</label>
															<input style="border: 1px solid #331A00;"
																class="form-control" placeholder="Enter your name"
																type="text" id="customeremail" required />
														</div>
														<div class="form-group">
															<label for="inputUserName">Comment</label>
															<textarea
																style="border: 1px solid #331A00; height: 150px;"
																class="form-control rounded-0" id="comment" rows="3" required></textarea>
														</div>
													
												</div>
												<div class="modal-footer">
													<button
														style="background: #331A00; border: 1px solid #331A00;"
														class="btn btn-primary" id="SENDMESSAGE">Send</button>
												</div>
											</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>









					</div>

					<div class="col-md-9 col-sm-9">
						<div style="border: 2px solid #E7EDEE; min-height: 1300px;"
							class="section-showproduct-right">

							<%
								int count_Rev5 = 0;
											int count_Rev4 = 0;
											int count_Rev3 = 0;
											int count_Rev2 = 0;
											int count_Rev1 = 0;
											for (Review review : reivewservice.getreviewListEmail(ownerDetails)) {

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

							<div class="col-md-12 col-sm-12">
								<div class="dashboartitlesegment">
									<h3>Product Review</h3>
								</div>
								<div class="col-md-4">
									<div class="sectionshoplocationdashboardreview">
										<ul>
											<li><a href="#"> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i>
											</a><span class="reviewcount">(<%=count_Rev5%>)
											</span></li>
										</ul>
										<ul>
											<li><a href="#"> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star-o"></i>
											</a><span class="reviewcount">(<%=count_Rev4%>)
											</span></li>
										</ul>
										<ul>
											<li><a href="#"> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
											</a><span class="reviewcount">(<%=count_Rev3%>)
											</span></li>
										</ul>
										<ul>
											<li><a href="#"> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star-o"></i> <i
													class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
											</a><span class="reviewcount">(<%=count_Rev2%>)
											</span></li>
										</ul>
										<ul>
											<li><a href="#"> <i class="fa fa-star"></i> <i
													class="fa fa-star-o"></i> <i class="fa fa-star-o"></i> <i
													class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
											</a><span class="reviewcount">(<%=count_Rev1%>)
											</span></li>
										</ul>
									</div>
								</div>


								<div class="col-md-8">
									<div class="sectionshoplocationdashboardreview">
										<ul>
											<li>
												<div class="progress">
													<div class="progress-bar" role="progressbar"
														aria-valuenow="70" aria-valuemin="0" aria-valuemax="100"
														style="width: <%=count_Rev5%>%"></div>
												</div>
											</li>
										</ul>
										<ul>
											<li>
												<div class="progress">
													<div class="progress-bar" role="progressbar"
														aria-valuenow="10" aria-valuemin="0" aria-valuemax="100"
														style="width: <%=count_Rev4%>%"></div>
												</div>
											</li>
										</ul>
										<ul>
											<li>
												<div class="progress">
													<div class="progress-bar" role="progressbar"
														aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
														style="width: <%=count_Rev3%>%"></div>
												</div>
											</li>
										</ul>
										<ul>
											<li>
												<div class="progress">
													<div class="progress-bar" role="progressbar"
														aria-valuenow="70" aria-valuemin="0" aria-valuemax="100"
														style="width: <%=count_Rev2%>%"></div>
												</div>
											</li>
										</ul>
										<ul>
											<li>
												<div class="progress">
													<div class="progress-bar" role="progressbar"
														aria-valuenow="70" aria-valuemin="0" aria-valuemax="100"
														style="width: <%=count_Rev1%>%"></div>
												</div>
											</li>
										</ul>
									</div>
								</div>
							</div>



							<div class="col-md-12 col-sm-12">
								<div class="dashboartitlesegment">
									<h3 style="margin-top: 40px;">Our policey</h3>
								</div>
								<h5><%=profile.getPolicy()%></h5>
							</div>




							<div class="col-md-12 col-sm-12">
								<div class="dashboartitlesegment">
									<h3 style="margin-top: 50px;">Our Branch</h3>
								</div>
								<div class="col-md-12">
									<div class="sectionshoplocationdashboard">
										<h4>
											<i class="fa fa-map-marker" aria-hidden="true"></i>
										</h4>
										<p>
											<span style="font-weight: bold;">About Us:</span><%=profile.getPolicy()%></p>
										<p>
											<span style="font-weight: bold;">Our Branches:</span>
											<%=profile.getBranch()%></p>

									</div>
								</div>
							</div>




							<div class="col-md-12 col-sm-12">
								<div class="dashboartitlesegment">
									<h3 style="margin-top: 50px;">Our Products</h3>
								</div>
								<div class="col-md-12">
									<div class="sectionshoplocationdashboard">
										<h4>
											<i style="font-size: 46px;" class="fa fa-product-hunt"
												aria-hidden="true"></i>
										</h4>
										<br />

										<p>
											<span style="font-weight: bold;">Our Products:</span>
											<%=profile.getProducts()%></p>

									</div>
								</div>
							</div>






						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%
		} else {
					response.sendRedirect("fooditempost.jsp");
	%>
	<%
		}
	%>
	<%
		}
		}
	%>
</section>
<section style="margin-top: 8px; margin-bottom: 50px;"
	class="confirmpackage_area">
	<div class="container">
		<div class="row"></div>
	</div>
</section>

<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.js" />"></script>
<script type="text/javascript">
	$(document).ready(function() {
		///
		$('#SENDMESSAGE').click(function() {

			var shopkeeperemail = $('#shopkeeperemail').val();
			var customeremail = $('#customeremail').val();
			var comment = $('#comment').val();

			if ($.trim(shopkeeperemail) == '') {

				alert("Sorry,Empty field found!!");

			} else if ($.trim(customeremail) == '') {

				alert("Sorry,Email field must not be empty!!");

			} else if ($.trim(comment) == '') {

				alert("Sorry,Comment field must not be empty!!");

			} else {

				$.ajax({
					method : 'POST',
					data : {
						shopkeeperemail : shopkeeperemail,
						customeremail : customeremail,
						comment : comment,
						action : 'SEND_MESSAGETOSHOPKEEPER'
					},
					url : 'ManageCustomer',
					dataType : "text",
					success : function(result) {
						alert("Successfully, Send your message!!");
					}
				});

				return false;
			}

		});

	});
</script>

<%@include file="template/footer1.jsp"%>