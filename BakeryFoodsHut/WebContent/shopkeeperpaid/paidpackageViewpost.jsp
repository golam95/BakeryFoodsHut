
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageprofileInfoServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PostServiceImpl"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageStaticesServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Post"%>

<%
	ManageprofileInfoServiceImpl manageprofile = new ManageprofileInfoServiceImpl();
	ManageStaticesServiceImpl managestatistic = new ManageStaticesServiceImpl();
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
					style="text-align: center; font-weight: bold; margin-bottom: 40px;">***View
					all products***</h3>

				<div class="col-md-12">
					<div class="button_alignment">
						<%
							if (manageprofile.checkEmail(username) == true) {
						%>
						<div style="margin-bottom: 20px;" class="">
							<a
								style="padding: 9px; background: #449D44; color: #FFFFFF; border-radius: 5px; font-weight: bold;"
								href="../ManageShopkeeperpaidpage?action=PAID_ADDPOST"><i
								class="icon-plus"></i> Add Post</a>
						</div>
						<%
							}
						%>
					</div>
				</div>
				<div class="col-md-12">
					<table id="myTable" class="table">
						<tr>
							<th style="width: 20%;" class="t-head">Product Name</th>
							<th class="t-head head-it ">Quantity</th>
							<th class="t-head head-it ">Weight Type</th>
							<th class="t-head head-it ">Discount</th>
							<th class="t-head head-it ">Date</th>
							<th class="t-head head-it ">Status</th>
							<th class="t-head head-it ">Action</th>
						</tr>
						<%
							for (Post p : managepost.getPostinfoList(username)) {
						%>
						<tr class="cross">
							<td class="t-data"><%=p.getProductName()%></td>
							<td class="t-data"><%=p.getPostQuantity()%></td>
							<td class="t-data"><%=p.getPostWeight()%></td>
							<td class="t-data"><%=p.getPostDiscount()%></td>
							<td class="t-data"><%=p.getPostDate()%></td>

							<%
								if (p.getPostQuantity() <= managestatistic.RetriveQuantity(username)) {
							%>
							<td class="t-data"><span
								style="color: red; font-weight: bold;">Out of stock</span></td>
							<%
								} else {
							%>
							<td class="t-data"><span
								style="color: green; font-weight: bold;">In a stock</span></td>
							<%
								}
							%>

							<td class="t-data t-w3l"><a
								style="text-decoration: none; color: red; font-size: 22px; font-weight: bold;"
								class="add-1"
								href="../ManageShopkeeperPaid?deletePOST=<%=p.getPostId()%>"
								onclick="if (!(confirm('Are you sure you want to delete this post?'))) return false"><i
									class="icon-remove"></i> </a> <a
								style="text-decoration: none; color: green; font-size: 22px; font-weight: bold;"
								class="add-1"
								href="paidpackageUpdatepost.jsp?updatepost=<%=p.getPostId()%>"><i
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
</div>
<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>