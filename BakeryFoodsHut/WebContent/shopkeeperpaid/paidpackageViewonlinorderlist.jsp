
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.OfflineorderServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.OfflineOrder"%>

<%
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
					style="text-align: center; font-weight: bold; margin-bottom: 40px;">***
					Van Details***</h3>
				<div class="col-md-12">
					<table id="myTable" class="table">
						<tr>
							<th style="width: 20%;" class="t-head">Customer</th>
							<th class="t-head head-it ">OrderType</th>
							<th class="t-head head-it ">Quantity</th>
							<th class="t-head head-it ">Price</th>
							<th class="t-head head-it ">Location</th>
							<th class="t-head head-it ">Pickupdate</th>
							<th class="t-head head-it ">Pickuptime</th>
							<th class="t-head head-it ">Action</th>
						</tr>
						<%
							for (OfflineOrder offline : offlineorder.getOrderListInfo(username)) {
						%>
						<tr class="cross">
							<td class="t-data"><%=offline.getCustomeremail()%></td>
							<td class="t-data"><%=offline.getOrdertype()%></td>
							<td class="t-data"><%=offline.getTotalquantity()%></td>
							<td class="t-data"><%=offline.getTotalprice()%></td>
							<td class="t-data"><%=offline.getPickuplocation()%></td>
							<td class="t-data"><%=offline.getPickupdate()%></td>
							<td class="t-data"><%=offline.getPickuptime()%></td>

							<td class="t-data t-w3l"><a
								style="text-decoration: none; color: red; font-size: 22px; font-weight: bold;"
								class="add-1"
								href="paidpackageaddDelivery.jsp?productDelivery=<%=offline.getId()%>">
									<%
										if (offline.getStatus().equals("1")) {
									%> 
									<span style="font-size: 8px; font-weight: bold;">New</span>
									<span style="color: green; font-weight: bold; font-size: 16px;">Shift</span></a>
									<%
										}else{
									%> 
									<span style="color: green; font-weight: bold; font-size: 14px;">Performed</span>
									<% } %>
							</td>
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