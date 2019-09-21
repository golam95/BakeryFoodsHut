
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.OfflineorderServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.EmployeeServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.OfflineOrder"%>
<%@page import="com.bakeryfoodshut.model.EmployeeInfo"%>
<%
	EmployeeServiceImpl empployeeservice = new EmployeeServiceImpl();
	OfflineorderServiceImpl offlineorder = new OfflineorderServiceImpl();
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

		<%@include
			file="../template/temp_paidshopkeeper/paidpackagesiderbar.jsp"%>
		<div class="container">
			<div class="row col-md-offset-2">
				<h3
					style="text-align: center; font-weight: bold; margin-bottom: 30px;">***Add
					VanDetails***</h3>
				<div class="col-md-3 col-md-offset-9">
					<div class="button_alignment">
						<div style="margin-bottom: 10px;" class="t"></div>
					</div>
				</div>

				<%
					String getId = request.getParameter("productDelivery");
					OfflineOrder order = offlineorder.getOfflineorderInfo(Integer.parseInt(getId));
				%>

				<form action="../ManageShopkeeperPaid" method="POST">
					<input type="hidden" name="action" value="ADDORDERCONFIRM" /> <input
						type="hidden" name="sessionname" value="<%=username%>" /> <input
						type="hidden" name="postId" value="<%=order.getId()%>" />
					<div class="form-group">

						<%
							if (order.getStatus().equals("1")) {
						%>



						<div style="margin-left: 10px;" class="col-sm-11">
							<label for="inputUserName" class="control-label"> Select
								service provider</label> <select
								style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
								class="form-control" name="empdeg" required>
								<%
									for (EmployeeInfo emp : empployeeservice.getEmployeeListexternal("External")) {
								%>
								<option value="<%=emp.getEmpId()%>"><%=emp.getEmpName()%></option>

								<%
									}
								%>
							</select>
						</div>
						<%
							}
						%>
					</div>
					<div class="col-md-4">
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">
									Customer Email</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="licence"
									value="<%=order.getCustomeremail()%>" required />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Order
									Type</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="licence"
									value="<%=order.getOrdertype()%>" required />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Total
									Quantity</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="licence"
									value="<%=order.getTotalquantity()%>" required />
							</div>
						</div>

					</div>


					<div class="col-md-4">
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Pickup
									Location</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="description"
									value="<%=order.getPickuplocation()%>" required />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Pickup
									Date</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="description"
									value="<%=order.getPickupdate()%>" required />
							</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">
									Price(Tk.)</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="price"
									value="<%=order.getTotalprice()%>" required />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Pickup
									Time</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="description"
									value="<%=order.getPickuptime()%>" required />
							</div>
						</div>
					</div>
					<div class="form-group">



						<div style="margin-left: 14px;" class="col-md-11">
							<%
								if (order.getStatus().equals("1")) {
							%>
							<button
								style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
								type="submit" class="btn">Save</button>
							<%
								}
							%>

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