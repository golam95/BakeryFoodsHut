<%@include file="template/header.jsp"%>

<section class="banner_area">
	<div class="container">
		<div class="banner_content">
			<h4>User LogIn</h4>
		</div>
	</div>
</section>
<section style="margin-bottom: 60px; margin-top: 8px;"
	class="confirmpackage_area">
	<div class="container">
		<div class="row">
			<div class="col-xs-11 col-md-11 col-md-offset-1">
				<h2>Returning Customers, Sign In</h2>
				<div class="selectoption">
					<p>
						<i style="font-size: 30px; margin-right: 10px;" class="fa fa-info"></i>
						Welcome back! Sign in for fast and easy checkout.
					</p>
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
				<div style="border-right: 2px solid #DDDDDD;"
					class="col-xs-6 col-md-6">

					<form action="ManageLogin" method="POST">

						<div class="form-group">
							<label style="font-weight: bold;" for="inputUserName">Email</label>
							<input class="form-control" placeholder="Enter phone number"
								type="email" name="username" required/>
						</div>
						<div class="form-group">
							<label style="font-weight: bold;" for="inputUserName">Password</label>
							<input class="form-control" placeholder="Enter phone number"
								type="password" name="userpassword" required/>
						</div>
						<span>Your password must be at least 6 characters and
							contain at least 1 number and 1 letter</span>
						<div class="form-group">
							<a style="color: #0366D6; text-decoration: underline;"
								href="<c:url value="/ManageUserpage?action=USER_FORGOTPASS" />">Forgot
								your password?</a>
						</div>
						<button
							style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF; margin-top: 12px; width: 150px; margin-right: 8px;"
							type="submit" class="btn">LogIn</button>
						<a href="<c:url value="/ManageUserpage?action=USER_CANCEL" />"
							style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF; margin-top: 12px; width: 150px;"
							type="submit" class="btn">Cancel</a>
					</form>
				</div>
				<div class="col-xs-6 col-md-6">
					<div class="form-group">
						<label style="font-weight: bold;" for="inputPassword"></label>
						<h4 style="font-weight: bold;">New Member</h4>
						<p style="padding: 2px;">If you have no account.please sign up
							and buy healthy bakery food.
						<p>
							<a href="<c:url value="/ManageUserpage?action=USER_REG" />"
								style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF; margin-top: 10px; width: 200px;"
								type="submit" class="btn">Register</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>


<%@include file="template/footer1.jsp"%>