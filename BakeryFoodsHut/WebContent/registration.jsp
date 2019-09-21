<%@include file="template/header.jsp"%>

<section class="banner_area">
	<div class="container">
		<div class="banner_content">
			<h4>Registration</h4>
		</div>
	</div>
</section>

<section class="confirmpackage_area">
	<div class="container">
		<div class="row">
			<div class="col-xs-11 col-md-11 col-md-offset-1">
				<h2>Hurry up!Create an account</h2>
				<div class="selectoption">
					<p>
						<i style="font-size: 30px; margin-right: 10px;" class="fa fa-info"></i>
						Please note: You must be 18 years of age or older to create an
						account. Your privacy is important to us.
					</p>
				</div>

				<div style="border-right: 2px solid #DDDDDD;"
					class="col-xs-6 col-md-6">

					<%
						String error = "";
						if (request.getAttribute("error") != null) {
							error = (String) request.getAttribute("error");
					%>
					<div class="alert alert-danger">
						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
						<strong>Sorry!</strong><%=error%>
					</div>
					<%
						}
					%>

					<%
						String success = "";
						if (request.getAttribute("success") != null) {
							success = (String) request.getAttribute("success");
					%>

					<div class="alert alert-success">
						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
						<strong>Success!</strong><%=success%>
					</div>
					<%
						}
					%>

					<form action="ManageCustomer" method="POST">
						<input type="hidden" name="action" value="GET_REGISTRATION" />

						<div class="form-group">
							<label style="font-weight: bold;" for="inputUserName">Name</label>
							<input class="form-control" type="text" name="rname" required />
						</div>

						<div class="form-group">
							<label style="font-weight: bold;" for="inputUserName">Email</label>
							<input class="form-control" type="text" name="remail" required />
						</div>


						<div class="form-group">
							<label for="inputUserName" class="control-label"> Select
								District</label> <input type="hidden" name="action" value="ADD_POST">
							<select style="height: 35px; margin-bottom: 18px;"
								class="form-control" name="district" required>
								<option></option>

								<option>Bogra</option>
								<option>Barguna</option>
								<option>Barisal</option>
								<option>Bhola</option>
								<option>Bandarban</option>
								<option>Brahmanbaria</option>
								<option>Bagerhat</option>
								<option>Chuadanga</option>
								<option>Chandpur</option>
								<option>Chittagong</option>
								<option>Comilla</option>
								<option>Cox's Bazar</option>
								<option>Dhaka</option>
								<option>Dinajpur</option>
								<option>Faridpur</option>
								<option>Feni</option>
								<option>Gazipur</option>
								<option>Gopalganj</option>
								<option>Gaibandha</option>
								<option>Habiganj</option>
								<option>Joypurhat</option>
								<option>Jamalpur</option>
								<option>Jessore</option>
								<option>Jhenaida</option>
								<option>Jhalokati</option>
								<option>Kishoreganj</option>
								<option>Khagrachhari</option>
								<option>Khulna</option>
								<option>Kushtia</option>
								<option>Kurigram</option>
								<option>Lakshmipur</option>
								<option>Lalmonirhat</option>
								<option>Madaripur</option>
								<option>Manikganj</option>
								<option>Munshiganj</option>
								<option>Mymensingh</option>
								<option>Magura</option>
								<option>Meherpur</option>
								<option>Moulvibazar</option>
								<option>Narsingdi</option>
								<option>Narail</option>
								<option>Narayanganj</option>
								<option>Netrokona</option>
								<option>Noakhali</option>
								<option>Naogaon</option>
								<option>Natore</option>
								<option>Nawabganj</option>
								<option>Nilphamari</option>
								<option>Pabna</option>
								<option>Panchagarh</option>
								<option>Rangamati</option>
								<option>Rajbari</option>
								<option>Rangpur</option>
								<option>Rajshahi</option>
								<option>Shariatpur</option>
								<option>Sherpur</option>
								<option>Satkhira</option>
								<option>Sunamganj</option>
								<option>Sylhet</option>
								<option>Sirajganj</option>
								<option>Tangail</option>
								<option>Thakurgaon</option>
							</select>
						</div>
						<div class="form-group">
							<label style="font-weight: bold;" for="inputPassword">Address</label>
							<input class="form-control" type="text" name="address"
								required />
						</div>


						<div class="form-group">
							<label style="font-weight: bold;" for="inputPassword">Password</label>
							<input class="form-control" type="password" name="rpassword"
								required />
						</div>

						<div class="form-group">
							<label style="font-weight: bold;" for="inputPassword">Select
								Gender</label> <select class="form-control" name="rgender">
								<option>--/--</option>
								<option>Male</option>
								<option>Female</option>
							</select>
						</div>
						<div class="form-group">
							<label><input type="checkbox" value="" required /><span>
									Please send me e-mails about special offers, new products and
									promotions from bakeryfoodshat.com<a
									style="color: #0366D6; text-decoration: underline;" href=""
									data-target="#loginModal" data-toggle="modal">(See our
										Privacy Policy)</a>
							</span></label>

						</div>

						<button
							style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF;"
							type="submit" class="btn">Submit</button>
						<a href="<c:url value="/ManageUserpage?action=USER_CANCEL" />"
							style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF;"
							type="submit" class="btn">Cancel</a>
					</form>
				</div>



				<div class="col-xs-6 col-md-6">

					<div class="form-group">
						<label style="font-weight: bold;" for="inputPassword"></label>
						<h4 style="font-weight: bold;">Already have an account</h4>
						<p style="padding: 2px;">If you have an account.please login
							and buy healthy bakery food.
						<p>
							<a href="<c:url value="/ManageUserpage?action=USER_LOGIN" />"
								style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF; margin-top: 10px; width: 200px;"
								type="submit" class="btn">LogIn</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<div class="modal" id="loginModal" tabindex="-1">
				<div style="width: 500px;" class="modal-dialog">
					<div class="modal-content">
						<div
							style="background: #22202E; border-bottom: 5px solid #D3943D;"
							class="modal-header">
							<button style="color: #FFFFFF;" class="close"
								data-dismiss="modal">&times;</button>
							<h4 style="color: #FFFFFF; font-size: 17px;" class="modal-title">
								<i style="font-size: 27px;" class="fa fa-lock"
									aria-hidden="true"></i><span style="padding-left: 5px;">Privacy</span>
							</h4>
						</div>
						<div class="modal-body">
							<h3>See our privacy and policy</h3>
							<p>We are highly values the urgency of your orders. We
								endeavor to make sure that your ordered products reach your door
								in the fastest possible time. Once your order is confirmed, you
								will receive a confirmation mail from our Customer Services
								Department.</p>
							<br />
							<p>Your ordered products will be sent to your given address
								in 2 to 4 business days for anywhere in Bangladesh. The shipping
								will be completely FREE.</p>
							<br />
							<p>We start the shipping process within 24 hours. So, if you
								want to cancel or modify any order, please inform our Customer
								Services Department at your earliest.</p>
							<br />
							<p>After you receive the shipment, our delivery team will
								wait for 10 minutes to let you try on the product. If you have
								any issue with the product you can contact our Customer Services
								Department and return the product instantly.</p>

							<h3 style="margin-top: 15px;">
								<i class="fa fa-exclamation-circle" aria-hidden="true"></i>
								Rules and Regulation
							</h3>
							<p>We are highly values the urgency of your orders. We
								endeavor to make sure that your ordered products reach your door
								in the fastest possible time. Once your order is confirmed, you
								will receive a confirmation mail from our Customer Services
								Department.</p>
							<br />
							<p>Your ordered products will be sent to your given address
								in 2 to 4 business days for anywhere in Bangladesh. The shipping
								will be completely FREE.</p>
							<br />
							<p>We start the shipping process within 24 hours. So, if you
								want to cancel or modify any order, please inform our Customer
								Services Department at your earliest.</p>
							<br />
							<p>After you receive the shipment, our delivery team will
								wait for 10 minutes to let you try on the product. If you have
								any issue with the product you can contact our Customer Services
								Department and return the product instantly.</p>

							<h3 style="margin-top: 15px;">
								<i class="fa fa-exclamation-circle" aria-hidden="true"></i>
								Rules and Regulation
							</h3>
							<p>We are highly values the urgency of your orders. We
								endeavor to make sure that your ordered products reach your door
								in the fastest possible time. Once your order is confirmed, you
								will receive a confirmation mail from our Customer Services
								Department.</p>
							<br />
							<p>Your ordered products will be sent to your given address
								in 2 to 4 business days for anywhere in Bangladesh. The shipping
								will be completely FREE.</p>
							<br />
							<p>We start the shipping process within 24 hours. So, if you
								want to cancel or modify any order, please inform our Customer
								Services Department at your earliest.</p>
							<br />
							<p>After you receive the shipment, our delivery team will
								wait for 10 minutes to let you try on the product. If you have
								any issue with the product you can contact our Customer Services
								Department and return the product instantly.</p>


							<h3 style="margin-top: 15px;">
								<i class="fa fa-exclamation-circle" aria-hidden="true"></i>
								Rules and Regulation
							</h3>
							<p>We are highly values the urgency of your orders. We
								endeavor to make sure that your ordered products reach your door
								in the fastest possible time. Once your order is confirmed, you
								will receive a confirmation mail from our Customer Services
								Department.</p>
							<br />
							<p>Your ordered products will be sent to your given address
								in 2 to 4 business days for anywhere in Bangladesh. The shipping
								will be completely FREE.</p>
							<br />
							<p>We start the shipping process within 24 hours. So, if you
								want to cancel or modify any order, please inform our Customer
								Services Department at your earliest.</p>
							<br />
							<p>After you receive the shipment, our delivery team will
								wait for 10 minutes to let you try on the product. If you have
								any issue with the product you can contact our Customer Services
								Department and return the product instantly.</p>
						</div>

						<div class="modal-footer">
							<button
								style="background: #AD610D; border: 2px solid #EFAA31; width: 470px;"
								class="btn btn-primary" data-dismiss="modal">Cancel</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<%@include file="template/footer1.jsp"%>
