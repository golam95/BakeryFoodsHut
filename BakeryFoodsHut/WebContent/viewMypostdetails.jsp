
<%@include file="template/header.jsp"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageprofileInfoServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.ManageprofileInfo"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageStaticesServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.HomemadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.BakerymadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PostServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PaidpackageServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Homemade"%>
<%@page import="com.bakeryfoodshut.model.Bakerymade"%>
<%@page import="com.bakeryfoodshut.model.Paidpackage"%>
<%@page import="com.bakeryfoodshut.model.Post"%>


<%
	ManageprofileInfoServiceImpl manageprofileService = new ManageprofileInfoServiceImpl();
	ManageStaticesServiceImpl managestatistic = new ManageStaticesServiceImpl();
	HomemadeServiceImpl homemade = new HomemadeServiceImpl();
	BakerymadeServiceImpl bakerymade = new BakerymadeServiceImpl();
	PaidpackageServiceImpl paidmade = new PaidpackageServiceImpl();
%>

<section class="Productsection_item">

	<%
		String mypostDetails = "";
		if (request.getParameter("mypostDetails") == null) {
	%>
	<%
		response.sendRedirect("fooditempost.jsp");
	%>
	<%
		} else {
			mypostDetails = (String) request.getParameter("mypostDetails");
			if (mypostDetails.equals("")) {
	%>
	<%
		response.sendRedirect("fooditempost.jsp");
	%>
	<%
		} else {

				if (manageprofileService.checkEmail(mypostDetails) == true) {

					ManageprofileInfo profile = manageprofileService.getManageprofileInfo(mypostDetails);
					Homemade home = homemade.getHomemadeInfo(mypostDetails);
					Bakerymade bakery = bakerymade.getBakerymadeInfo(mypostDetails);
					Paidpackage paid = paidmade.getPaidpackageInfo(mypostDetails);
	%>
	<div class="container">
		<div class="row">
			<div style="min-height: 133px;" class="optionsection">
				<div style="margin-bottom: 30px;" class="col-md-12">
					<div class="col-md-4">
						<%
							if (homemade.checkEmail(mypostDetails) == true) {
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
							} else if (bakerymade.checkEmail(mypostDetails) == true) {
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
							<%=managestatistic.TotalPost(mypostDetails)%>
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
								if (homemade.checkEmail(mypostDetails) == true) {
							%>
							<h4>
								Name:
								<%=home.getHomeName()%></h4>
							<%
								} else if (bakerymade.checkEmail(mypostDetails) == true) {
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
								if (homemade.checkEmail(mypostDetails) == true) {
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
								if (homemade.checkEmail(mypostDetails) == true) {
							%>
							<h5>
								<i class="fa fa-phone" aria-hidden="true"></i> Phone:
								<%=home.getHomePhone()%>
							</h5>
							<h5>
								<i class="fa fa-map-marker" aria-hidden="true"></i> Address:<%=home.getHomeAddress()%>
							</h5>

							<%
								} else if (bakerymade.checkEmail(mypostDetails) == true) {
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


						<div class="section-showproduct-left">
							<div id="accordion" class="panel-group">
								<div class="panel panel-default">
									<div
										style="background: #E4E4E4; border: 1px solid #FFFFFF; height: 45px;"
										class="myheader">
										<span
											style="margin-left: 8px; font-size: 15px; font-weight: bold;">Owner
											product category</span> <a href="#pane_1" data-toggle="collapse"
											data-parent="#accordion"> <span
											style="padding-top: 7px; margin-left: 125px; color: #AD610D; font-size: 20px;">
										</span></a>
									</div>

									<div id="pane_1" class="panel-collapse collapse in">
										<div style="border: 1px solid #FFFFFF;" class="panel-body">
											<ul>
												<%
													int checklength = profile.getProducts().length();
																String[] spiltthestring = profile.getProducts().split(",", 5);
																for (String a : spiltthestring) {
												%>
												<li><p style="color: #1296DB;">
														<span class="glyphicon glyphicon-ok-sign"></span>
														<%=a%></p></li>
												<%
													}
												%>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>



						<div class="container">
							<div class="row">
								<div class="col-xs-12">
									<div class="modal" id="loginModal" tabindex="-1">
										<div style="width: 500px;" class="modal-dialog">
											<div style="margin-top: 140px;" class="modal-content">
												<div style="background: #22202E;" class="modal-header">
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
													<form>
														<div class="form-group">
															<label for="inputUserName">Email</label> <input
																style="border: 1px solid #331A00;" class="form-control"
																placeholder="Enter your name" type="text"
																id="inputUserName" />
														</div>
														<div class="form-group">
															<label for="inputUserName">Comment</label>
															<textarea
																style="border: 1px solid #331A00; height: 150px;"
																class="form-control rounded-0"
																id="exampleFormControlTextarea2" rows="3"></textarea>
														</div>
													</form>
												</div>
												<div class="modal-footer">
													<button
														style="background: #AD610D; border: 1px solid #AD610D"
														class="btn btn-primary">Send</button>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>




					<div class="col-md-9 col-sm-9">
						<%
							PostServiceImpl retrivepost = new PostServiceImpl();
										String mypost = "";
										int coutsearchProduct = 0;
										if (request.getParameter("mypostDetails") != null) {
											mypost = (String) request.getParameter("mypostDetails");
										}
										for (Post p : retrivepost.searchListPost(mypost)) {
											coutsearchProduct += 1;
						%>
						<div class="section-showproduct-right">
							<div class="section-element">
								<div class="col-md-3 col-sm-3">
									<img src="uploads/post/<%=p.getImg()%>" alt="<%=p.getImg()%>"
										width=200 height=100 />
								</div>
								<div class="col-md-4 col-sm-4">
									<h4>
										Product Name: <span><%=p.getProductName()%></span>
									</h4>
									<h5 style="font-weight: bold;">
										Email: <span><%=p.getShopkeeperEmail()%></span>
									</h5>
									<h5 style="margin-bottom: 12px; font-weight: bold;">
										Shop Location: <span><%=p.getPostArea()%></span>
									</h5>
									<h5>
										Date: <span><%=p.getPostDate()%></span>
									</h5>
								</div>
								<div class="col-md-2 col-sm-2">
									<h5
										style="margin-top: 15px; font-size: 15px; margin-bottom: 16px;">Quantity</h5>
									<h2
										style="font-size: 14px; font-weight: bold; margin-top: 5px; margin-bottom: 27px; margin-left: 5px;"><%=p.getPostQuantity()%>
										<%=p.getPostWeight()%>.
									</h2>

									<%
										if (p.getPostQuantity() <= 0) {
									%>
									<h5 style="color: red;">Not Available</h5>

									<%
										} else {
									%>
									<h5 style="color: green;">Available</h5>
									<%
										}
									%>
								</div>
								<div class="col-md-3 col-sm-3">
									<h4 style="margin-left: 39px; margin-bottom: 4px;">
										<a
											style="font-size: 14px; padding: 4px; border: 1px solid #AD610D; color: #AD610D; border-radius: 2px;"
											href="shopkeeperOwnerprofile.jsp?ownerDetails=<%=p.getShopkeeperEmail()%>">Contact
											Me</a>
									</h4>
									<h5 style="margin-left: 40px; color: #211D31;">
										(<%=p.getPrice()%>
										Tk.)
										<%=p.getPostWeight()%></h5>
									<%
										if (p.getPostDiscount().equals("0")) {
									%>
									<br />
									<%
										} else {
									%>

									<%
										if (p.getPostDiscount().equals("10 percent")) {
									%>
									<h6
										style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
										Discount: 10%</h6>
									<%
										} else if (p.getPostDiscount().equals("20 percent")) {
									%>
									<h6
										style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
										Discount: 20%</h6>

									<%
										} else if (p.getPostDiscount().equals("30 percent")) {
									%>
									<h6
										style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
										Discount: 30%</h6>

									<%
										} else if (p.getPostDiscount().equals("40 percent")) {
									%>
									<h6
										style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
										Discount: 40%</h6>
									<%
										} else if (p.getPostDiscount().equals("50 percent")) {
									%>
									<h6
										style="font-weight: bold; margin-top: 5px; text-align: center; color: red; margin-bottom: 9px;">
										Discount: 50%</h6>

									<%
										}
									%>

									<%
										}
									%>
									<%
										if (p.getPostQuantity() <= 0) {
									%>
									<p
										style="background: #331A00; border-radius: 3px; color: #D0DDC2; margin-left: 50px; width: 81px; text-align: center; font-size: 14px;">View
										Details</p>

									<%
										} else {
									%>

									<a
										style="padding: 5px; background: #331A00; border-radius: 3px; color: #D0DDC2; margin-left: 50px;"
										href="viewpostDetails.jsp?viewpostDetails=<%=p.getPostId()%>">View
										Details</a>
									<%
										}
									%>

								</div>
							</div>
						</div>

						<%
							}
						%>

						<%
							if (coutsearchProduct == 0) {
						%>
						<h3
							style="font-weight: bold; padding-top: 18px; padding-left: 200px; font-size: 30px;">Sorry,
							Search item not found!!</h3>
						<%
							}
						%>

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


<%@include file="template/footer1.jsp"%>
