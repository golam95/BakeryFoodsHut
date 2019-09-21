<%@include file="template/header.jsp"%>

<section class="banner_area">
	<div class="container">
		<div class="banner_content">
			<h4>Free package</h4>
		</div>
	</div>
</section>
<section class="confirmpackage_area">
	<div class="container">
		<div class="row">
			<div class="col-xs-11 col-md-11 col-md-offset-1">
				<h2>Create Your Account</h2>
				<div class="selectoption">
					<h4>
						<i class="fa fa-check"></i> You have selected Free package
						(Produce food from home )
					</h4>
				</div>
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
					<input type="hidden" name="action" value="USER_HOMEMADE" />
					<div class="col-md-12">
						<div class="col-md-6">
							<h3 style="margin-bottom: 25px;">
								<i class="fa fa-user-circle" aria-hidden="true"></i> Personal
								Information:
							</h3>
							<div class="form-group">
								<label style="font-weight: bold;" for="inputUserName">Name</label>
								<input class="form-control" placeholder="Enter your name"
									type="text" name="hname" required />
							</div>
							
							


							<div class="form-group">
								<label style="font-weight: bold;" for="inputUserName">Email</label>
								<input class="form-control" placeholder="Enter email address"
									type="email" name="hemail" required />
							</div>


							<div class="form-group">
								<label style="font-weight: bold;" for="inputUserName">Contact
									No</label> <input class="form-control" placeholder="Enter contact no"
									type="text" name="hphone" required />
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
								<label style="font-weight: bold;" for="inputUserName">Address</label>
								<input class="form-control" placeholder="Enter your address"
									type="text" name="haddress" required />
							</div>
							<div class="form-group">
								<label style="font-weight: bold;" for="inputPassword">Select
									Gender</label> <select class="form-control" name="rgender" required>
									<option></option>
									<option>Male</option>
									<option>Female</option>
								</select>
							</div>
							<div class="form-group">
								<label style="font-weight: bold;" for="inputUserName">Password</label>
								<input class="form-control" placeholder="Enter your password"
									type="password" name="hpassword" required /><span
									style="font-size: 13px; color: red;">*Password must be 8
									character long</span>
							</div>

						</div>
						<div class="col-md-6">
							<h3 style="margin-bottom: 25px;">
								<i class="fa fa-shopping-basket" aria-hidden="true"></i> Others
								Information:
							</h3>

							<div class="form-group">
								<label style="font-weight: bold;" for="inputUserName">When
									you start your business?</label>
								<div class="input-append date form_datetime">
									<input style="height: 30px; border-radius: 5px;" size="35"
										type="text" name="businesstime" required /> <span
										class="add-on"><i class="fa fa-calendar"
										aria-hidden="true"></i></span>
								</div>
							</div>


							<div class="form-group">
								<label for="sel1">Do you have any branch?</label> <select
									class="form-control" name="branch" required>
									<option></option>
									<option>Yes</option>
									<option>No</option>
								</select>
							</div>
							<div class="form-group">
								<label for="sel1">Do you have any website?</label> <select
									class="form-control" name="website" required>
									<option></option>
									<option>Yes</option>
									<option>No</option>
								</select>
							</div>
						</div>
					</div>
					<br /> <br />

					<div class="form-group">
						<p>
							<input type="checkbox" value="" required /> Before creating an
							account, please read our terms and conditions carefully <a
								style="color: #0366D6;" data-target="#loginModal2"
								data-toggle="modal" href="">Condition </a> and <a
								style="color: #0366D6;" data-target="#loginModal3"
								data-toggle="modal" href="">Rules</a>.We will send you all the
							registration information through email
						</p>
					</div>
					<button
						style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF;"
						type="submit" class="btn">Save</button>
					<a href="<c:url value="/ManageUserpage?action=USER_CANCEL" />"
						style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF;"
						type="submit" class="btn">Cancel</a>
				</form>
			</div>
		</div>
	</div>
</section>

<%@include file="template/footer1.jsp"%>