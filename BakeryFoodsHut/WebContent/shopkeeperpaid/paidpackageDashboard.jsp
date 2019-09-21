<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>

<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageprofileInfoServiceImpl"%>
<%
	ManageprofileInfoServiceImpl manageprofile = new ManageprofileInfoServiceImpl();
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


		<br />
		<div class="container">
			<div class="row col-md-offset-2">

				<%
					if (manageprofile.checkEmail(username) == true && statisticeService.checkQuantity(username) == true) {
				%>
				<div style="widht: 300px;" class="alert alert-success">
					<p style="text-align: center;">
						<span style="font-weight: bold;"><span
							class="glyphicon glyphicon-ok"></span> Your profile is 100%
							completed!!! </span>
					</p>
				</div>
				<%
					} else if (statisticeService.checkQuantity(username) == false) {
				%>
				<div style="widht: 300px;" class="alert alert-danger">
					<p>
						<strong style="font-size: 20px;">Alert!</strong><span
							style="font-weight: bold;">Your profile is 90%
							completed.So please update your product quantity information<a
							style="border-radius: 4px; padding: 4px; border: 4px solid #4E2614; background: #E8EAED; color: black;"
							href="../ManageShopkeeperpaidpage?action=PAID_QUANTITYSETTING">Update
								quantity</a>
						</span>
					</p>
				</div>
				<%
					} else {
				%>
				<div style="widht: 300px;" class="alert alert-danger">
					<strong style="font-size: 20px;">Alert!</strong><span
						style="font-weight: bold;">Please update your
						information Otherwise BakeryfoodsHut does not allow you to perform
						your task!!!<a
						style="border-radius: 4px; padding: 4px; border: 4px solid #4E2614; background: #E8EAED; color: black;"
						href="../ManageShopkeeperpaidpage?action=PAID_UPDATEPROFILEINFO">Update
							</a>
					</span>
				</div>
				<%
					}
				%>
				<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
				<div class="col-md-offset-4">
					 <a
						style="background: #4E2614; color: #FFFFFF; border: 8px solid #DAB776; margin-right: 25px;"
						class="btn" href="../ManageShopkeeperpaidpage?action=PAID_BARCHART"><i style="font-size: 32px;"
						class="icon-bar-chart"></i><br />Barchart Report</a> <a
						style="background: #4E2614; color: #FFFFFF; border: 8px solid #DAB776; margin-right: 25px;"
						class="btn" href="../ManageShopkeeperpaidpage?action=PAID_PIECHART"><i style="font-size: 32px;"
						class="icon-bar-chart"></i><br />PieChart Report</a>

				</div>
				<div></div>
				<div style="margin-left: 900px;">
					<div class="#">
						<a
							style="padding: 20px; background: #22202E; width: 60px; height: 60px; border-radius: 40px; color: #FFFFFF; border: 4px solid gray;"
							href="../ManageShopkeeperpaidpage?action=PAID_HELP"><i
							style="color: #FFFFFF; font-weight: bold; font-size: 20px; text-decoration: none;"
							class="icon-question-sign"></i></a>
					</div>
				</div>
				<div style="margin-top: 50px; margin-left: 900px;">
					<div class="#">
						<a
							style="padding: 20px; background: #22202E; width: 60px; height: 60px; border-radius: 40px; border: 4px solid gray; color: #FFFFFF;"
							href="../ManageShopkeeperpaidpage?action=PAID_SENDMESSAGETOBFH"
							data-target="#loginModal" data-toggle="modal"><i
							style="color: #FFFFFF; font-weight: bold; font-size: 20px; text-decoration: none;"
							class="icon-comments-alt"></i></a>
					</div>
				</div>



			</div>
		</div>
	</div>
</div>

<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>