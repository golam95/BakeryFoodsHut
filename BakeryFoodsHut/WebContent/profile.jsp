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
					style="border: 2px solid #E7EDEE; margin-top: 17px; border-radius: 4px;"
					class="col-md-8 col-sm-8">
					<div class="col-md-12">
						<div class="sectionproductdetails">
							<h3>
								<i class="fa fa-user-o" aria-hidden="true"></i> Basic Account
								Information
							</h3>
							<%
								for (Registration reg : regimpl.getcustomerListInfo(username)) {
							%>
							<div class="form-group">
								<label for="inputUserName">User Name</label> <input
									style="border: 1px solid #FFFFFF;" class="form-control"
									type="text" readonly value="<%=reg.getRegusername()%>" />
							</div>
							<div class="form-group">
								<label for="inputUserName">Email</label> <input
									style="border: 1px solid #FFFFFF;" class="form-control"
									type="text" readonly value="<%=reg.getReguserEmail()%>" />
							</div>
							<div class="form-group">
								<label for="inputUserName">Address</label> <input
									style="border: 1px solid #FFFFFF;" class="form-control"
									type="text" readonly value="<%=reg.getRegaddress()%>" />
							</div>
							<div class="form-group">
								<label for="inputUserName">District</label> <input
									style="border: 1px solid #FFFFFF;" class="form-control"
									type="text" readonly value="<%=reg.getRegdistrict()%>" />
							</div>

							<%
								}
							%>

						</div>
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

<%@include file="template/footer1.jsp"%>
