
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ShopkeeperMessageServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.ShopkeeperMessage"%>




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
					style="text-align: center; font-weight: bold; margin-bottom: 40px;">***View
					all message***</h3>
				<div class="col-md-12">
					<div class="button_alignment"></div>
				</div>

				<table id="myTable" class="table">
					<tr>
						<th style="width: 20%;" class="t-head">Customer Email</th>
						<th class="t-head head-it ">Comment</th>
						<th class="t-head head-it ">Date</th>
						<th class="t-head head-it ">Action</th>
					</tr>
					<%
						ShopkeeperMessageServiceImpl shopkeepermessage = new ShopkeeperMessageServiceImpl();
						for (ShopkeeperMessage s : shopkeepermessage.getShopkeeperinfoList(username)) {
					%>
					<tr class="cross">
						<td class="ring-in t-data"><%=s.getCustomerEmail()%></td>
						<td class="t-data"><%=s.getComment()%></td>
						<td class="t-data"><%=s.getMessageDate()%></td>
						<td class="t-data t-w3l"><a
							style="text-decoration: none; color: red; font-size: 22px; font-weight: bold;"
							class="add-1"
							href="../ManageShopkeeperPaid?deleteMessage=<%=s.getMessageId()%>"
							onclick="if (!(confirm('Are you sure you want to delete this message?'))) return false"><i
								class="icon-remove"></i> </a> <a
							style="text-decoration: none; color: #9D261D; font-size: 22px; font-weight: bold;"
							class="add-1"
							href="../ManageShopkeeperPaid?changemessagerole=<%=s.getMessageId()%>"><i
								class="icon-eye-open"></i> </a> <a
							style="text-decoration: none; color: green; font-size: 22px; font-weight: bold;"
							class="add-1"
							href="paidpackageSendmessage.jsp?sendmessage=<%=s.getMessageId()%>"><i
								class="icon-share-alt"></i> </a></td>
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
