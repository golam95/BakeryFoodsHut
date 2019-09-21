<%@include file="template/header.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.OfflineorderServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.OfflineOrder"%>

<%
	OfflineorderServiceImpl offlineorder = new OfflineorderServiceImpl();
%>
<div class="section-showproduct">
	<div class="container">
		<div class="row">
			<h2
				style="margin-top: 9px; margin-left: 490px; margin-bottom: 20px; font-size: 30px; color: #331A00; font-weight: bold;">Your
				Order list</h2>
			<div class="content">
				<div class="cart-items">
					<div class="container">
						<table class="table ">
							<tr>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
							</tr>
							<tr>
								<th class="t-head head-it">SL</th>
								<th style="width: 20%;" class="t-head">Quantity</th>
								<th class="t-head head-it ">Price</th>
								<th class="t-head head-it ">PickupLocation</th>
								<th class="t-head head-it ">PickupDate</th>
								<th class="t-head head-it ">PickupTime</th>
								<th class="t-head head-it ">Date</th>
								<th class="t-head head-it ">Action</th>
							</tr>
							<%
								int countSL = 0;
								for (OfflineOrder order : offlineorder.getOrderListInfo(username)) {
									countSL += 1;
							%>
							<tr class="cross">
								<td class="t-data"><%=countSL%></td>
								<td class="t-data"><%=order.getTotalquantity()%></td>
								<td class="t-data"><%=order.getTotalprice()%></td>
								<td class="t-data"><%=order.getPickuplocation()%></td>
								<td class="t-data"><%=order.getPickupdate()%></td>
								<td class="t-data"><%=order.getPickuptime()%></td>
								<td class="t-data"><%=order.getDate()%></td>
								<td class="t-data t-w3l"><a
									style="text-decoration: none; font-size: 17px; font-weight: bold;"
									href="ManageCustomer?deletemyorderlist=<%=order.getId()%>"
									onclick="if (!(confirm('Are you sure you want to delete your Orderlist?'))) return false"><span
										class="glyphicon glyphicon-remove"></span> </a></td>
							</tr>
							<%
								}
							%>
						</table>
						<br/><br/><br/><br/><br/><br/>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<section style="margin-top: 8px; margin-bottom: 50px;"
	class="confirmpackage_area">
	<div class="container">
		<div class="row"></div>
	</div>
</section>

<%@include file="template/footer1.jsp"%>
