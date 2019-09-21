
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.LocalStoreServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.LocalStore"%>

<%
	LocalStoreServiceImpl localstoreservice = new LocalStoreServiceImpl();
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
						<div style="margin-bottom: 10px;" mclass="t"></div>
					</div>
				</div>
				

				<%
					String getId = request.getParameter("updatelocalOrder");
					LocalStore local = localstoreservice.getLocalstoreorderInfo(Integer.parseInt(getId));
				%>



				<form action="../ManageShopkeeperPaid" method="POST">
					<input type="hidden" name="action" value="UPDATEOFFLINEORDER" /> <input
						type="hidden" name="sessionname" value="<%=username%>" /> <input
						type="hidden" name="id" value="<%=local.getId()%>" />
					<div class="col-md-4">
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">
									Description</label>
								<textarea
									style="border: 1px solid #39302B; margin-bottom: 18px;"
									class="form-control" rows="6" name="description"
									 required><%=local.getDescription()%></textarea>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Month</label>
								<select
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" name="month" required>
									<option><%=local.getMonth()%></option>
									<option>January</option>
									<option>February</option>
									<option>March</option>
									<option>April</option>
									<option>May</option>
									<option>June</option>
									<option>July</option>
									<option>August</option>
									<option>September</option>
									<option>October</option>
									<option>November</option>
									<option>December</option>

								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label"> Year</label> <select
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" name="year" value="<%=local.getYear()%>"
									required>
									<option><%=local.getYear() %></option>
									<option>2017</option>
									<option>2018</option>
									<option>2019</option>
									<option>2020</option>
									<option>2021</option>
									<option>2022</option>
									<option>2023</option>
									<option>2024</option>
									<option>2025</option>
									<option>2026</option>
									<option>2027</option>
									<option>2028</option>
									<option>2029</option>
									<option>2030</option>
									<option>2031</option>
									<option>2032</option>
								</select>
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
									value="<%=local.getPrice()%>" required />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-10">
								<label for="inputUserName" class="control-label">
									Quantity</label> <input
									style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
									class="form-control" type="text" name="quantity"
									value="<%=local.getTotalquantity()%>" required />
							</div>
						</div>
					</div>
					<div class="form-group">
						<div style="margin-left: 14px;" class="col-md-11">
							<button
								style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
								type="submit" class="btn">Update</button>
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