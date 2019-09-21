
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageprofileInfoServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.WarehouseServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Storehouse"%>


<%
	ManageprofileInfoServiceImpl manageprofile = new ManageprofileInfoServiceImpl();
	WarehouseServiceImpl warehouseservice = new WarehouseServiceImpl();
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
					style="text-align: center; font-weight: bold; margin-bottom: 40px;">***
					View warehouse details***</h3>

				<div class="col-md-12">
					<div class="button_alignment">
						<%
							if (manageprofile.checkEmail(username) == true) {
						%>
						<div style="margin-bottom: 20px;" class="">
							<a
								style="padding: 9px; background: #449D44; color: #FFFFFF; border-radius: 5px; font-weight: bold;"
								href="../ManageShopkeeperpaidpage?action=PAID_ADDWAREHOUSE"><i
								class="icon-plus"></i> Warehouse Details</a>
						</div>
						<%
							}
						%>
					</div>
				</div>
				<div class="col-md-12">
					<table id="myTable" class="table">
						<tr>
							<th style="width: 20%;" class="t-head">Description</th>
							<th class="t-head head-it ">Month</th>
							<th class="t-head head-it ">Year</th>
							<th class="t-head head-it ">Price</th>
							<th class="t-head head-it ">Action</th>
						</tr>

						<%
							for (Storehouse storehouse : warehouseservice.getWarehouseListInfo(username)) {
						%>
						<tr class="cross">
							<td class="t-data"><%=storehouse.getWareDescription()%></td>
							<td class="t-data"><%=storehouse.getMonth()%></td>
							<td class="t-data"><%=storehouse.getYear()%></td>
							<td class="t-data"><%=storehouse.getPrice()%></td>
							<td class="t-data t-w3l"><a
								style="text-decoration: none; color: red; font-size: 22px; font-weight: bold;"
								class="add-1"
								href="../ManageShopkeeperPaid?deleteWarehousePOST=<%=storehouse.getWarehouseId()%>"
								onclick="if (!(confirm('Are you sure you want to delete this Info?'))) return false"><i
									class="icon-remove"></i> </a></td>
						</tr>

						<%
							}
						%>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>