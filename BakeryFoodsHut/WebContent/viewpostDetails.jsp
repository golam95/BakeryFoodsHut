<%@include file="template/header.jsp"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PostServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.BakerymadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.HomemadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PaidpackageServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.ReviewServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Post"%>
<%@page import="com.bakeryfoodshut.model.Review"%>
<%@page import="java.util.List"%>

<%
	PostServiceImpl postservice = new PostServiceImpl();
	BakerymadeServiceImpl bakerymade = new BakerymadeServiceImpl();
	HomemadeServiceImpl homemade = new HomemadeServiceImpl();
	PaidpackageServiceImpl paidpackage = new PaidpackageServiceImpl();
	ReviewServiceImpl reviewservice = new ReviewServiceImpl();
%>
<section class="Productsection_item">

	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<div class="col-md-4 col-sm-4">
					<div class="section-showproduct-left">
						<img
							src="<c:url value="/resources/image/shop/discountbanner.PNG" />"
							alt="Cinque Terre" width="326" height="382">
					</div>
				</div>
				<div
					style="border: 2px solid #E7EDEE; margin-top: 17px; border-radius: 4px;"
					class="col-md-8 col-sm-8">
					<%
						String viewpostDetails = "";
						if (request.getParameter("viewpostDetails") == null) {
					%>
					<%
						response.sendRedirect("fooditempost.jsp");
					%>
					<%
						} else {

							viewpostDetails = (String) request.getParameter("viewpostDetails");
							if (viewpostDetails.equals("")) {
					%>
					<%
						response.sendRedirect("fooditempost.jsp");
					%>
					<%
						} else {

								if (postservice.checkpost_id(Integer.parseInt(viewpostDetails)) == true) {
									Post post = postservice.getPostInfo(viewpostDetails);
					%>

					<%
						String error = "";
									if (request.getAttribute("error") != null) {
										error = (String) request.getAttribute("error");
					%>
					<div class="alert alert-danger">
						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
						<strong>Sorry!</strong><%=error%>
					</div>
					<%
						}
					%>
					<form>
						<div class="col-md-12">
							<div class="col-md-8">

								<div>
									<h4
										style="font-weight: bold; margin-top: 14px; margin-bottom: 14px; color: #AD610D;">
										<span id="showresult"></span>
									</h4>
								</div>

								<div class="section-showproduct-right">
									<div class="section_image">
										<img src="uploads/post/<%=post.getImg()%>" alt="ICON-PAY"
											width="310" height="170" />
									</div>
									<div class="section_description">
										<input type="hidden" name="action" value="ADD_CART" /> <input
											type="hidden" id="shopkeeperemail"
											value="<%=post.getShopkeeperEmail()%>" /> <input
											type="hidden" id="existingquantity"
											value="<%=post.getPostQuantity()%>" /> <input type="hidden"
											id="customeremail" value="<%=username%>" />
										<h4>
											<span style="font-weight: bold;">Product Name</span>:
											<%=post.getProductName()%>
										</h4>
										<input type="hidden" id="cart_productname"
											value="<%=post.getProductName()%>" />
										<h5>
											<span style="font-weight: bold;">Price</span>:
											<%=post.getPrice()%>Tk.
										</h5>
										<h5>
											<span style="font-weight: bold;">Discount</span>:
											<%=post.getPostDiscount()%>
										</h5>
										<input type="hidden" id="cart_discount"
											value="<%=post.getPostDiscount()%>" /> <input type="hidden"
											id="cart_price" value="<%=post.getPrice()%>" /> <input
											type="hidden" id="cart_weight"
											value="<%=post.getPostWeight()%>" />
										<%
											if (post.getPostQuantity() <= 0) {
										%>
										<h5>
											<span style="font-weight: bold; color: red;">Status</span>: <span
												style="color: green; font-weight: bold;">Out of Stock</span>
										</h5>

										<%
											} else {
										%>
										<h5>
											<span style="font-weight: bold;">Status</span>: <span
												style="color: green; font-weight: bold;">In Stock</span>
										</h5>
										<%
											}
										%>

										<h5>
											<a style="text-decoration: underline;" href="#writereview">Customer
												Review</a><i style="color: #F6D35F;" class="fa fa-star"></i> <i
												style="color: #F6D35F;" class="fa fa-star"></i> <i
												style="color: #F6D35F;" class="fa fa-star"></i> <i
												style="color: #F6D35F;" class="fa fa-star"></i> <i
												style="color: #F6D35F;" class="fa fa-star"></i>
										</h5>
										<h5
											style="font-size: 23px; font-weight: bold; color: #AD610D;"><%=post.getPrice()%>Tk.
										</h5>

										<%
											if (homemade.checkEmail(post.getShopkeeperEmail()) == true
																|| bakerymade.checkEmail(post.getShopkeeperEmail()) == true) {
										%>

										<%
											} else {
										%>
										<h5>
											<input
												style="width: 90px; height: 30px; border: 1px solid #331A00;"
												type="number" id="cartQuantity" value="0" /><span
												style="font-weight: bold; margin-left: 10px;"><%=post.getPostWeight()%></span>
										</h5>
										<%
											}
										%>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="section-showproduct-right">
									<div class="section_description">
										<h5>
											<i class="fa fa-calendar" aria-hidden="true"></i> Date:
											<%=post.getPostDate()%>
										</h5>

										<%
											if (homemade.checkEmail(post.getShopkeeperEmail()) == true
																|| bakerymade.checkEmail(post.getShopkeeperEmail()) == true) {
										%>
										<a
											style="margin-top: 20px; width: 170px; font-weight: bold; color: #FFFFFF; background: #E33F23;"
											href="shopkeeperOwnerprofile.jsp?ownerDetails=<%=post.getShopkeeperEmail()%>"
											class="btn btn-secondary">Contact Me</a>
										<%
											} else {
										%>
										<button
											style="margin-top: 20px; width: 170px; font-weight: bold; color: #FFFFFF; background: #E33F23;"
											class="btn btn-secondary" id="ADD_CART">Order Now</button>
										<%
											}
										%>
									</div>
								</div>
							</div>
						</div>

						<div style="margin-left: 30px;" class="col-md-11">
							<h5
								style="font-weight: bold; border-bottom: 1px solid gray; margin-bottom: 9px; padding: 2px;">Product
								Description:</h5>
							<p><%=post.getPostProductdes()%></p>
							<input type="hidden" id="cart_des"
								value="<%=post.getPostProductdes()%>">
						</div>
					</form>


					<form>
						<div class="col-md-12">
							<div class="reviewformsection" id="writereview">
								<h3>Write a review</h3>
								<div>
									<h4
										style="font-weight: bold; margin-top: 14px; margin-bottom: 14px; color: #AD610D;">
										<span id="showreviewstatus"></span>
									</h4>
								</div>
								<input type="hidden" id="sessionname" value="<%=username%>" />
								<input type="hidden" id="productId"
									value="<%=post.getPostId()%>" />
								<div class="form-group">
									<label for="sel1">Select Star</label> <select
										class="form-control" id="star">
										<option></option>
										<option>1</option>
										<option>2</option>
										<option>3</option>
										<option>4</option>
										<option>5</option>
									</select>
								</div>

								<div class="reviewform">
									<div class="form-group">
										<label style="font-weight: bold;" for="inputUserName">Title</label>
										<input class="form-control" type="text" id="title" required />
									</div>
									<div class="form-group">
										<label style="font-weight: bold;" for="inputUserName">Review</label>
										<textarea class="form-control" rows="5" id="comment" required></textarea>
									</div>
									<%
										if (username != null) {
									%>
									<div class="form-group">
										<button
											style="margin-bottom: 30px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF;"
											type="submit" class="btn" id="MYREVIEW">POST</button>
									</div>
									<%
										}
									%>
								</div>
							</div>
						</div>

					</form>

					<div style="margin-bottom: 50px;" class="col-md-12" id="showReview">
						<div class="viewallreviewsection">
							<%
								int countreview = 0;
											for (Review review : reviewservice.getReviewListInfo(post.getPostId())) {
												countreview += 1;
											}
							%>
							<h3>
								Review (<%=countreview%>)
							</h3>
							<%
								for (Review review : reviewservice.getReviewListInfo(post.getPostId())) {
							%>
							<div style="border-bottom: 1px solid gray;"
								class="Wrapallsection">
								<div class="contentsectionreview">
									<h4>
										<%=review.getRivewShopkeeperemail()%><span
											style="font-size: 13px; padding-left: 7px;"
											data-toggle="tooltip" data-placement="top"
											title="A Verified is a user who has purchased the reviewed through our Bakery Foods Hut">(Verified
											Buyer)</span>
									</h4>
									<h4>
										<i style="color: #22202E;" class="fa fa-star"></i> <i
											style="color: #22202E;" class="fa fa-star"></i> <i
											style="color: #22202E;" class="fa fa-star"></i> <i
											style="color: #22202E;" class="fa fa-star"></i> <i
											style="color: #22202E;" class="fa fa-star"></i>
									</h4>
									<h4><%=review.getTitle()%></h4>
									<p><%=review.getReiveDes()%></p>
									<h5
										style="margin-top: 10px; margin-bottom: 3px; font-weight: bold;">
										Date:<%=review.getRiewDate()%></h5>
								</div>
							</div>
							<%
								}
							%>
						</div>
					</div>


				</div>
				<%
					} else {
								response.sendRedirect("fooditempost.jsp");
				%>
				<%
					}
				%>
				<%
					}
					}
				%>
			</div>
		</div>
	</div>
</section>

<section style="margin-top: 8px; margin-bottom: 50px;"
	class="confirmpackage_area">
	<div class="container">
		<div class="row"></div>
	</div>
</section>


<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.js" />"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$('#MYREVIEW').click(function() {

			var sessionname = $('#sessionname').val();
			var productId = $('#productId').val();
			var star = $('#star').val();
			var title = $('#title').val();
			var comment = $('#comment').val();
			var shopkeeperemail = $('#shopkeeperemail').val();

			if ($.trim(star) == '') {

				alert("Sorry,Select review options!!");

			} else if ($.trim(title) == '') {

				alert("Sorry,Title field must not be empty!!");

			} else if ($.trim(comment) == '') {

				alert("Sorry,Comment field must not be empty!!");

			} else {

				$.ajax({
					method : 'POST',
					data : {
						sessionname : sessionname,
						productId : productId,
						star : star,
						title : title,
						comment : comment,
						shopkeeperemail : shopkeeperemail,
						action : 'ADD_REVIEW'
					},
					url : 'ManageCustomer',
					dataType : "text",
					success : function(result) {
						$('#showreviewstatus').html(result);
						var star = $('#star').val("");
						var title = $('#title').val("");
						var comment = $('#comment').val("");
					}
				});

				return false;
			}

		});
	});
</script>


<script type="text/javascript">
	$(document).ready(function() {

		$('#ADD_CART').click(function() {

			var shopkeeperemail = $('#shopkeeperemail').val();
			var customeremail = $('#customeremail').val();
			var cartQuantity = $('#cartQuantity').val();
			var existingquantity = $('#existingquantity').val();
			var cart_price = $('#cart_price').val();
			var cart_productname = $('#cart_productname').val();
			var cart_des = $('#cart_des').val();
			var cart_weight = $('#cart_weight').val();
			var cart_discount = $('#cart_discount').val();

			$.ajax({
				method : 'POST',
				data : {
					shopkeeperemail : shopkeeperemail,
					customeremail : customeremail,
					cartQuantity : cartQuantity,
					existingquantity : existingquantity,
					cart_price : cart_price,
					cart_productname : cart_productname,
					cart_des : cart_des,
					cart_weight : cart_weight,
					cart_discount : cart_discount,
					action : 'ADD_CART_2'
				},
				url : 'ManageCustomer',
				dataType : "text",
				success : function(result) {
					$('#showresult').html(result);
				}
			});
			return false;
		});
	});
</script>


<%@include file="template/footer1.jsp"%>