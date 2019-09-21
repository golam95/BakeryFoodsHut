
<%@include file="../template/temp_paidshopkeeper/paidpackageheader.jsp"%>

<%@page import="com.bakeryfoodshut.serviceImpl.PostServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Post"%>
<%
	PostServiceImpl postservice = new PostServiceImpl();
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

		<%@include file="../template/temp_paidshopkeeper/paidpackagesiderbar.jsp"%>

			<div class="container">
				<div class="row col-md-offset-2">
						<h3
							style="text-align: center; font-weight: bold; margin-bottom: 30px;">***Update
							your post***</h3>
						<div class="col-md-3 col-md-offset-9">
							<div class="button_alignment">
								<div style="margin-bottom: 10px;" mclass="t"></div>
							</div>
						</div>
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

						<%
							String id = request.getParameter("updatepost");
							Post post = postservice.getPostInfo(id);
						%>

						<form>
							<div class="col-md-4">
								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">
											Select District</label> <input type="hidden" name="action"
											value="UPDATE_POST"> <input type="hidden"
											id="useremail" value="<%=id%>"> <select
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" id="district" required>
											<option><%=post.getPostDistrict()%></option>
											<option>Barguna</option>
											<option>Barisal</option>
											<option>Comilla</option>
											<option>Bhola</option>
											<option>Jhalokati</option>
											<option>Patuakhali</option>
											<option>Gazipur</option>
											<option>Dhaka</option>
											<option>Jhalokati</option>
											<option>Jhalokati</option>
											<option>Jhalokati</option>
											<option>Rajshai</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">
											Select Area</label> <select
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" id="selectarea" required>
											<option><%=post.getPostArea()%></option>
											<option>Belkuchi</option>
											<option>Shen Vangabari</option>
										</select>
									</div>
								</div>

								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">
											Select Consumer</label> <select
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" id="consumer" required>
											<option><%=post.getPostAge()%></option>
											<option>All</option>
											<option>Children</option>
											<option>Middle-Aged</option>
											<option>Adult</option>
											<option>Diabetes patients</option>
										</select>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">Your
											Product Name</label> <input
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" type="text" id="productname"
											value="<%=post.getProductName()%>" required />
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">
											Quantity</label> <input
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" type="text" id="productquantity"
											value="<%=post.getPostQuantity()%>" required />
									</div>
								</div>


								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">Product
											Prices </label> <input
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" type="text" id="productprice"
											value="<%=post.getPrice()%>" required />
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									<div class="col-sm-10">
										<label for="inputUserName" class="control-label">
											Discount</label> <select
											style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
											class="form-control" id="discount" required>
											<option><%=post.getPostDiscount()%></option>
											<option>0</option>
											<option>10%</option>
											<option>20%</option>
											<option>30%</option>
											<option>40%</option>
											<option>50%</option>
										</select>
									</div>
								</div>

								<div class="col-sm-10">
									<label for="inputUserName" class="control-label">
										Weight Type</label> <select
										style="border: 1px solid #39302B; height: 35px; margin-bottom: 18px;"
										class="form-control" id="weighttype" required>
										<option><%=post.getPostWeight()%></option>
										<option>KG</option>
										<option>Piece</option>
										<option>Packet</option>
									</select>
								</div>
								<div class="col-sm-10">
									<label for="inputUserName" class="control-label">Product
										Description </label>
									<textarea
										style="border: 1px solid #39302B; height: 140px; margin-bottom: 18px;"
										class="form-control" rows="7" id="description" required><%=post.getPostProductdes()%></textarea>
								</div>
							</div>


							<div class="form-group">
								<br />
								<div style="margin-left: 14px;" class="col-md-11">
									<button
										style="background: #22202E; border: 2px solid #22202E; color: #FFFFFF;"
										type="submit" class="btn" id="UPDATE_POSTS">Update</button>
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
<script type="text/javascript"
	src="<c:url value="../resources/js/jquery.js" />"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$('#UPDATE_POSTS').click(function() {
			var useremail = $('#useremail').val();
			var productname = $('#productname').val();
			var productquantity = $('#productquantity').val();
			var weighttype = $('#weighttype').val();
			var discount = $('#discount').val();
			var description = $('#description').val();
			var consumer = $('#consumer').val();
			var district = $('#district').val();
			var selectarea = $('#selectarea').val();
			var productprice = $('#productprice').val();

			$.ajax({
				method : 'POST',
				data : {
					useremail : useremail,
					productname : productname,
					productquantity : productquantity,
					weighttype : weighttype,
					discount : discount,
					description : description,
					consumer : consumer,
					district : district,
					selectarea : selectarea,
					productprice : productprice,
					action : 'UPDATE_POST'
				},
				url : '../ManageShopkeeperPaid',
				dataType : "text",
				success : function(result) {
					alert("Successfully, Update your post!!");
				}
			});
			return false;
		});

	});
</script>
<%@include file="../template/temp_shopkeeper/freepackagefooter.jsp"%>