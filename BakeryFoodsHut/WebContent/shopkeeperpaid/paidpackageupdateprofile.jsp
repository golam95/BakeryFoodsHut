
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageprofileInfoServiceImpl"%>

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
					style="text-align: center; font-weight: bold; margin-bottom: 30px;">***Update
					your profile Information***</h3>
				<div class="col-md-3 col-md-offset-9">
					<div class="button_alignment">
						<div style="margin-bottom: 10px;" class="t"></div>
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
							style="padding: 16px; background: #F2DEDE; color: #843534; border-radius: 5px; font-size: 16px;"><span
							style="font-weight: bold;">Sorry, </span><%=error%></span>
					</h4>
				</div>
				<%
					}
				%>
				<form action="../ManageShopkeeperPaid" method="POST"
					enctype="multipart/form-data">

					<div class="col-md-4">
						<div class="form-group">
							<div class="col-sm-10">
								<input type="hidden" name="action" value="ADD_PROFILEINFO">
								<input type="hidden" name="useremail" value="<%=username%>">

								<%
									ManageprofileInfoServiceImpl manageprofileinfo = new ManageprofileInfoServiceImpl();
									if (manageprofileinfo.checkweblink("Yes") == true) {
								%>
								<label for="inputUserName" class="control-label">Your
									Shop Website link</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="website" />

								<%
									} else {
								%>
								<input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="website"
									value="Have no website" />
								<%
									}
								%>

							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">Open
									shop</label> <select
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" name="openshop">
									<option></option>
									<option>7:00 AM</option>
									<option>8:00 AM</option>
									<option>9:00 AM</option>
									<option>10:00 AM</option>
									<option>11:00 AM</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">Close
									shop</label> <select
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" name="closeshop">
									<option></option>
									<option>7:00 PM</option>
									<option>8:00 PM</option>
									<option>9:00 PM</option>
									<option>10:00 PM</option>
									<option>11:00 PM</option>
									<option>12:00 AM</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">Name
									all of your products</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="products" />
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="col-sm-10">
							<%
								if (manageprofileinfo.checkbranch("No") == true) {
							%>
							<label for="inputUserName" class="control-label">Branch
								Name</label>
							<textarea
								style="border: 1px solid #39302B; height: 115px; margin-bottom: 18px;"
								class="form-control" name="branch" rows="7"
								value="Have no branch">Have no branch</textarea>
							<%
								}
							%>

							<%
								if (manageprofileinfo.checkbranch("Yes") == true) {
							%>
							<label for="inputUserName" class="control-label">Branch
								Name</label>
							<textarea
								style="border: 1px solid #39302B; height: 115px; margin-bottom: 18px;"
								class="form-control" name="branch" rows="7"></textarea>
							<%
								}
							%>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">Your
									policy</label>
								<textarea
									style="border: 1px solid #39302B; height: 115px; margin-bottom: 18px;"
									class="form-control" name="policy" rows="7"></textarea>
							</div>
						</div>
					</div>


					<div class="col-md-4">
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">Weekend
									Vacation </label> <select
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" name="vacation">
									<option></option>
									<option>Saturday</option>
									<option>Sunday</option>
									<option>Monday</option>
									<option>Tuesday</option>
									<option>Wednesday</option>
									<option>Thursday</option>
									<option>Friday</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">Weekend
									Vacation all of your products</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="file" name="img" />
							</div>
						</div>
					</div>
					<div class="form-group">
						<br />
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