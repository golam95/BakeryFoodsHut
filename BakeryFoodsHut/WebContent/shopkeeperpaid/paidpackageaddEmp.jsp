
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>

<div id="body-container">
	<div id="body-content">
		<div class="body-nav body-nav-horizontal body-nav-fixed">
			<%@include
				file="../template/temp_paidshopkeeper/paidpackageoption.jsp"%>
		</div>
		<section
			style="height: 30px; background: #95540B; border-bottom: 2px solid #95540B; margin-top: 24px;"
			class="style-page"></section>

		<%@include
			file="../template/temp_paidshopkeeper/paidpackagesiderbar.jsp"%>
		<div class="container">
			<div class="row col-md-offset-2">
				<h3
					style="text-align: center; font-weight: bold; margin-bottom: 30px;">***Add
					EmployeeInfo***</h3>
				<div class="col-md-3 col-md-offset-9">
					<div class="button_alignment">
						<div style="margin-bottom: 10px;" mclass="t"></div>
					</div>
				</div>
				<%
					String error = "";
					if (request.getParameter("error") != null) {
						error = request.getParameter("error");
				%>
				<div style="margin-bottom: 32px;" class="danger">
					<h4 style="text-align: center;">
						<span
							style="padding: 16px; background: #F2DEDE; color: #943534; border-radius: 5px; font-size: 16px;"><span
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
							style="padding: 16px; background: #DFF0D8; color: #50542C; border-radius: 5px; font-size: 16px;"><span
							style="font-weight: bold;">Congrets, </span><%=success%></span>
					</h4>
				</div>

				<%
					}
				%>
				<form action="../ManageShopkeeperPaid" method="POST">
					<input type="hidden" name="action" value="ADDEMP" /> <input
						type="hidden" name="sessionname" value="<%=username%>" />

					<div class="col-md-4">


						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Name</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="empname" required />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">
									Designation</label> <select
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" name="empdeg" required>
									<option></option>
									<option>Internal</option>
									<option>External</option>

								</select>
							</div>
						</div>
					</div>
					<div class="col-md-4">

						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">
									Address</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="empaddress" required />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Gender</label>
								<select
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" name="gender" required>
									<option></option>
									<option>Male</option>
									<option>Female</option>
								</select>
							</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> NID</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="empnid" required />
							</div>
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">
									ContactNo</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="empcontact" required />
							</div>
						</div>
					</div>

					<div class="form-group">
						<div style="margin-left: 14px;" class="col-md-11">
							<button
								style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
								type="submit" class="btn">Save</button>
							<a href="../ManageShopkeeperpaidpage?action=PAID_DASHBOARD"
								style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
								type="submit" class="btn">Cancel</a>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>