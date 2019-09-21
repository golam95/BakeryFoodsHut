<%@include file="template/header.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.RegistrationServiceImpl"%>
<%
	RegistrationServiceImpl regimpl = new RegistrationServiceImpl();
%>

<section class="Productsection_item">
	<%
		if (username == null) {
			response.sendRedirect("home.jsp");
		}
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<div class="col-md-4 col-sm-4">
					<div style="background: #E8EAED;" class="section-showproduct-left">
						<h4>
							<a style="color: black;"
								href="<c:url value="/ManageUserpage?action=USER_PROFILE" />">
								<i class="fa fa-user-o" aria-hidden="true"></i> Account Info
							</a>
						</h4>
						<h4>
							<a style="color: black;"
								href="<c:url value="/ManageUserpage?action=USER_STATUS" />"><i
								class="fa fa-cogs" aria-hidden="true"></i> User Status</a>
						</h4>
						<h4>
							<a style="color: black;"
								href="<c:url value="/ManageUserpage?action=PROFILE_SETTINGS" />"><i
								class="fa fa-cogs" aria-hidden="true"></i> Profile Settings</a>
						</h4>
					</div>
				</div>
				<div
					style="border: 2px solid #E7EDEE; margin-top: 17px; border-radius: 4px; margin-bottom: 30px;"
					class="col-md-8 col-sm-8">
					<div class="col-md-12">
						<div class="sectionproductdetails">

							<h3>
								<i class="fa fa-cogs" aria-hidden="true"></i> Account Settings
							</h3>
							<%
								for (Registration reg : regimpl.getcustomerListInfo(username)) {
							%>

							<h5 style="text-align: center;">
								<i style="font-size: 110px; color: gray;" class="fa fa-user"
									aria-hidden="true"></i>
							</h5>
							<h6
								style="margin-bottom: 36px; text-align: center; font-size: 17px;">
								<span style="font-weight: bold;">Email:</span> <span><%=reg.getReguserEmail()%></span>
							</h6>
							<div id="accordion" class="panel-group">
								<div class="panel">
									<div
										style="background: #E7EAED; height: 40px; border: border:1px solid #E7EAED;"
										class="panel-heading">
										<h4 class="panel-title">
											<a href="#panelBodyOne" data-toggle="collapse"
												data-parent="#accordion"> <span
												style="color: gray; font-weight: bold;"
												class="glyphicon glyphicon glyphicon-pencil">Details</span>
											</a>
										</h4>
									</div>
									<div style="background: #FFFFFF; border: 1px solid #E8EAED;"
										id="panelBodyOne" class="panel-collapse collapse">
										<div class="panel-body">
											<form class="form_design">
												<div class="form-group">
													<input type="hidden" id="sessionname" value="<%=username%>" />
													<h4 style="text-align: center; font-weight: bold;">Your
														District</h4>
													<p style="text-align: center;"><%=reg.getRegdistrict()%></p>
												</div>
												<div class="form-group">

													<input
														style="width: 250px; margin-left: 200px; margin-top: 15px; border: 1px solid #E7EAED;"
														class="form-control" placeholder="Enter your name"
														type="text" value="<%=reg.getRegusername()%>"
														id="username" required /> <input
														style="width: 250px; margin-left: 200px; margin-top: 15px; border: 1px solid #E7EAED;"
														class="form-control" placeholder="Enter your password"
														type="text" value="<%=reg.getReguserPassword()%>"
														id="password" required /> <input
														style="width: 250px; margin-left: 200px; margin-top: 15px; border: 1px solid #E7EAED;"
														class="form-control" placeholder="Enter your address"
														type="text" value="<%=reg.getRegaddress()%>" id="address"
														required />
												</div>
												<button
													style="background: #AD610D; color: #FFFFFF; border: 2px solid #F5D25C; padding: 5px; border-radius: 3px; margin-bottom: 10px; margin-left: 285px;"
													type="submit" class="custombutton" id="UPDATE_USERNAME">
													<span class="glyphicon glyphicon-ok"></span> Save
												</button>
											</form>
										</div>
									</div>
								</div>
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


<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.js" />"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$('#UPDATE_USERNAME').click(function() {

			var sessionname = $('#sessionname').val();
			var name = $('#username').val();
			var password = $('#password').val();
			var address = $('#address').val();

			if ($.trim(name) == '') {
				alert("Sorry,Name field must not be empty!!");

			} else if ($.trim(password) == '') {
				alert("Sorry,Password field must not be empty!!");

			} else if ($.trim(address) == '') {
				alert("Sorry,Address field must not be empty!!");

			} else {

				$.ajax({
					method : 'POST',
					data : {
						sessionname : sessionname,
						name : name,
						password : password,
						address : address,
						action : 'UPDATE_USERNAME'
					},
					url : 'ManageCustomer',
					dataType : "text",
					success : function(result) {
						alert("Successfully, Update your username!!");
					}
				});

				return false;
			}

		});

	});
</script>

<%@include file="template/footer1.jsp"%>
