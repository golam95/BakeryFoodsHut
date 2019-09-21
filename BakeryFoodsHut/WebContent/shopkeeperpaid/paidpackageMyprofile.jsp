
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PaidpackageServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Paidpackage"%>

<%	
PaidpackageServiceImpl paidpackageservice = new PaidpackageServiceImpl();
%>
<div id="body-container">
	<div id="body-content">
		<div class="body-nav body-nav-horizontal body-nav-fixed">
			<%@include
				file="../template/temp_paidshopkeeper/paidpackageoption.jsp"%>
		</div>
		<section
			style="height: 30px; background: #95540B; border-bottom: 2px solid #95540B; margin-top: 24px;"
			class="style-page"></section>
		
		<%@include file="../template/temp_paidshopkeeper/paidpackagesiderbar.jsp"%>

	
			<div class="container">
				<div class="row col-md-offset-2">
					
						<h3
							style="text-align: center; font-weight: bold; margin-bottom: 30px;">***Update
							your profile ***</h3>
						<div class="col-md-3 col-md-offset-9">
							<div class="button_alignment">
								<div style="margin-bottom: 10px;" class="t"></div>
							</div>
						</div>
						<div class="col-md-9 col-md-offset-5">
							<i style="font-size: 76px; margin-left: 40px;" class="icon-user"></i>
						</div>

						<div class="col-md-8 col-md-offset-4">
							<h6 style="margin-bottom: 26px;">
								<span
									style="font-weight: bold; font-size: 15px; margin-left: 50px;">Email:</span>
								<span style="font-weight: bold; font-size: 13px;"><%=username%></span>
							</h6>
						</div>
						<%
							String error = "";
							if (request.getParameter("error") != null) {
								error = request.getParameter("error");
						%>
						<div style="margin-bottom: 32px;" class="danger">
							<h4 style="text-align: center;">
								<span
									style="padding: 16px; background: #F2DEDE; color: #843534; border-radius: 5px; font-size: 16px;"><span
									style="font-weight: bold;">Sorry, </span><%=error%></span>
							</h4>
						</div>
						<%
							}
						%>
						<%
							String success = "";
							if (request.getParameter("success") != null) {
								success = request.getParameter("success");
						%>
						<div style="margin-bottom: 32px;" class="danger">
							<h4 style="text-align: center;">
								<span
									style="padding: 16px; background: #DFF0D8; color: #2B542C; border-radius: 5px; font-size: 16px;"><span
									style="font-weight: bold;">Congrets, </span><%=success%></span>
							</h4>
						</div>
						<%
							}
						%>
						

						<%
							if (paidpackageservice.checkEmail(username) == true) {
								Paidpackage paid = paidpackageservice.getPaidpackageInfo(username);
						%>
						<form action="../ManageShopkeeperPaid" method="POST">
							<div class="col-md-8 col-md-offset-3">
								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">Your
											Name</label> <input type="hidden" name="action"
											value="UPDATE_PROFILEFREE_2"> <input type="hidden"
											name="useremail" value="<%=username%>"> <input
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" type="text" name="username"
											value="<%=paid.getPaidName() %>" required />
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">Your
											password</label> <input
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" type="password" name="userpassword"
											value="<%=paid.getPaidPassowrd() %>" required />
									</div>
								</div>
								<div class="form-group">
									<br />
									<div class="col-md-11">
										<button
											style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
											type="submit" class="btn">Update</button>
										<a href="../ManageShopkeeperpaidpage?action=PAID_DASHBOARD"
											style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
											type="submit" class="btn">Cancel</a>
									</div>
								</div>
							</div>
						</form>
						<%
							}
						%>
					</div>
				</div>
			</div>
	</div>
<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>