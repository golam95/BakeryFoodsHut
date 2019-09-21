
<%@include file="../template/temp_shopkeeper/freepackageheader.jsp"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageStaticesServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.ManageQuantity"%>

<div id="body-container">
	<div id="body-content">
		<div class="body-nav body-nav-horizontal body-nav-fixed"></div>
		<section
			style="height: 30px; background: #95540B; border-bottom: 2px solid #95540B; margin-top: 24px;"
			class="style-page"></section>

		<%@include file="../template/temp_shopkeeper/freepackagesidebar.jsp"%>

		<div class="container">
			<div class="row col-md-offset-2">

				<h3
					style="text-align: center; font-weight: bold; margin-bottom: 40px;">***View
					Quantity***</h3>
				<div class="col-md-12">
					<div class="button_alignment"></div>
				</div>

				<table class="table">
					<tr>
						<th style="width: 20%;" class="t-head">Quantity</th>
						<th class="t-head head-it ">Date</th>
						<th class="t-head head-it ">Action</th>
					</tr>
					<%
						ManageStaticesServiceImpl managestatistic = new ManageStaticesServiceImpl();
						for (ManageQuantity m : managestatistic.getManageQuantityInfolist(username)) {
					%>
					<tr class="cross">
						<td class="t-data"><%=m.getQuantity()%></td>
						<td class="t-data"><%=m.getDate()%></td>
						<td class="t-data t-w3l"><a
							style="text-decoration: none; color: green; font-size: 22px; font-weight: bold;"
							class="add-1"
							href="freepackageUpdatequantity.jsp?updatequantity=<%=m.getId()%>"><i
								class="icon-pencil"></i></a></td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
		</div>
	</div>
</div>
<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>