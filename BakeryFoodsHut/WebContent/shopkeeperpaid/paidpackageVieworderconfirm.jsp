

<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.OrderconfirmServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Orderconfirm"%>

<%
	OrderconfirmServiceImpl orderconfirm = new OrderconfirmServiceImpl();
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
				</div>
				<div class="col-md-12">
					<table id="myTable" class="table">
						<tr>
							<th style="width: 20%;" class="t-head">OrderId</th>
							<th class="t-head head-it ">ServiceproviderId</th>
							<th class="t-head head-it ">Date</th>
							<th class="t-head head-it ">Action</th>
						</tr>
						<%
							for (Orderconfirm order : orderconfirm.getOrderconfirmListInfo(username)) {
						%>
						<tr class="cross">
							<td class="t-data"><%=order.getOrderid()%></td>
							<td class="t-data"><%=order.getServiceproviderId()%></td>
							<td class="t-data"><%=order.getDate()%></td>
							<td class="t-data t-w3l">
								<%
									if (order.getStatus().equals("active")) {
								%> <a
								style="text-decoration: none; color: red; font-size: 22px; font-weight: bold;"
								class="add-1"
								href="../ManageShopkeeperPaid?Updateorderconfirm=<%=order.getId()%>"><span
									style="font-weight: bold; color: red; font-size: 14px;">Confirm</span></a>

								<%
									} else {
								%> <a
								style="text-decoration: none; color: red; font-size: 22px; font-weight: bold;"
								class="add-1"
								href="../ManageShopkeeperPaid?deleteorderconfirm=<%=order.getId()%>"><span
									style="font-weight: bold; color: red; font-size: 14px;">Delete</span></a>

								<%
									}
								%>
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


