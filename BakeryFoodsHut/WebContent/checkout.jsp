
<%@include file="template/header.jsp"%>

<section class="Productsection_item">
	<%
		if (username == null) {
			response.sendRedirect("login.jsp");
		}
	%>s
	<div class="container">

		<form action="ManageCustomer" method="POST">

			<div class="row">
				<input type="hidden" name="action" value="OfflineOrder" />
				<div style="height: 80px;" class="optionsection">
					<div class="col-md-12">
						<div class="col-md-8 col-md-offset-4">
							<div class="col-md-12">
								<div class="col-md-6">
									<div class="form-group">
										<label for="inputUserName"></label> <span
											style="font-weight: bold; margin-bottom: 20px;">Order
											Type</span> <select class="form-control" name="ordertype">
											<option></option>
											<option>Pick-up In Store</option>
											<option>Local Delivery</option>
										</select>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<span style="font-weight: bold; margin-bottom: 20px;">Do
											you want to track your product?</span> <select class="form-control"
											name="trackproduct">
											<option></option>
											<option>Yes</option>
											<option>No</option>
										</select>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12 col-sm-12">
					<div class="col-md-4 col-sm-4">
						<div class="section-showproduct-left">
							<img src="resources/image/shop/discountbanner.PNG"
								alt="Cinque Terre" width="326" height="382">
						</div>
					</div>
					<div
						style="border: 2px solid #E7EDEE; margin-top: 17px; border-radius: 4px;"
						class="col-md-8 col-sm-8">
						<div class="col-md-6">
							<div class="sectionproductdetails">
								<h3>
									<i class="fa fa-product-hunt" aria-hidden="true"></i> Product
									Details
								</h3>
								<%
									double totalprice = 0;
									int totalquantity = 0;
									for (Cart cart : cartservice.getCartListInfo(username)) {
										totalprice += Double.parseDouble(cart.getPrice());
										totalquantity += cart.getQuantity();
								%>
								<input type="hidden" name="shopkeeperemail"
									value="<%=cart.getShopkeeperEmail()%>">
								<%
									}
								%>
								<div class="form-group">
									<label for="inputUserName">Total Quantity</label> <input
										class="form-control" placeholder="Login Username" type="text"
										name="totalquantity" value="<%=totalquantity%>" />
								</div>
								<div class="form-group">
									<label for="inputUserName">Total Price</label> <input
										class="form-control" placeholder="Login Username" type="text"
										name="totalprice" value="<%=totalprice%>" /><span
										style="font-weight: bold;">Tk.</span>
								</div>

							</div>
						</div>
						<div class="col-md-6">
							<div class="sectionpersonaldetails">
								<h3>
									<i class="fa fa-user-circle-o" aria-hidden="true"></i> Personal
									Details
								</h3>
								<div class="form-group">
									<label for="inputUserName">Your email address</label> <input
										class="form-control" type="text" name="emailaddress"
										value="<%=username%>" />
								</div>
							</div>
						</div>
					</div>
					<div
						style="border: 2px solid #E7EDEE; margin-top: 17px; border-radius: 4px;"
						class="col-md-8 col-sm-8">
						<div class="sectionpickupdetails">
							<h3>
								<i class="fa fa-truck" aria-hidden="true"></i> Pick-up
								Information
							</h3>
							<div class="form-group">
								<label for="inputUserName">Location</label> <input
									class="form-control" type="text" name="location" />
							</div>
							<div class="form-group">
								<label for="inputUserName">Pick on Date</label>
								<div class="date form_datetime">
									<input height: 30px; border-radius: 5px;"
										size="25"
										type="text" name="pickondate" value="" readonly> <span
										class="add-on"><i class="fa fa-calendar"
										aria-hidden="true"></i></span>
								</div>
							</div>
							<div class="form-group">
								<label for="inputUserName">Time at</label>
								<div class="input-append date form_time">
									<input height: 30px; border-radius: 5px;"
										size="25"
										type="text" name="pickuptime" value="" readonly
										placeholder="Select Time"> <span class="add-on"><i
										class="fa fa-calendar" aria-hidden="true"></i></span> <select
										style="font-weight: bold; margin-top: 17px;" name="timetype">
										<option>AM</option>
										<option>PM</option>
									</select>
								</div>
							</div>
							<button
								style="padding: 5px; width: 250px; background: #331A00; color: #FFFFFF; margin-top: 20px; margin-bottom: 40px;"
								type="submit" class="btn custombutton">
								<span class="glyphicon glyphicon-ok"></span> Order Now
							</button>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</section>

<section style="margin-top: 8px; margin-bottom: 50px;"
	class="confirmpackage_area">
	<div class="container">
		<div class="row"></div>
	</div>
</section>

<%@include file="template/footer.jsp"%>