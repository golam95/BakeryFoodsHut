<%@include file="template/header.jsp"%>

<section class="banner_area">
	<div class="container">
		<div class="banner_content">
			<h4>Password Assistant</h4>
		</div>
	</div>
</section>
<section style="margin-bottom: 60px; margin-top: 8px;"
	class="confirmpackage_area">
	<div class="container">
		<div class="row">
			<div class="col-xs-11 col-md-11 col-md-offset-1">
				<h2>Need a New Password?</h2>
				<div class="selectoption">
					<p>
						<i style="font-size: 30px; margin-right: 10px;" class="fa fa-info"></i>
						If you have already registered with us and you need to reset your
						password, we can send the link to reset your password.Enter your
						E-mail Address below, and click "Send". You should receive an
						e-mail with the link to reset your password in 1 to 2 minutes.
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
						<input type="hidden" name="action" value="SEND_EMAIL">
						<div class="form-group">
							<label style="font-weight: bold;" for="inputUserName">Email</label>
							<input class="form-control" placeholder="Enter phone number"
								type="email" name="email" />
						</div>
						<p>To ensure you receive the e-mail containing your password,
							Also be sure to check your "spam" folder.</p>
						<button
							style="margin-bottom: 130px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF; margin-top: 12px; width: 150px; margin-right: 8px;"
							type="submit" class="btn">Send</button>
						<a href="<c:url value="/ManageUserpage?action=USER_CANCEL" />"
							style="margin-bottom: 130px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF; margin-top: 12px; width: 150px;"
							type="submit" class="btn">Cancel</a>
					</form>
				</div>
				<div class="col-xs-6 col-md-6">
					<div class="form-group">
						<label style="font-weight: bold;" for="inputPassword"></label>
						<h4 style="font-weight: bold;">Bakery foods Hat</h4>
						<p style="padding: 2px;">Please visit our Bakery foods Hat and
							buy bakery healthy food.
						<p>
							<a href="<c:url value="/ManageUserpage?action" />"
								style="margin-bottom: 70px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF; margin-top: 10px; width: 200px;"
								type="submit" class="btn">Home</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<%@include file="template/footer.jsp"%>