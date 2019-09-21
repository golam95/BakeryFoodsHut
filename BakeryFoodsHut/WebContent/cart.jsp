<%@include file="template/header.jsp"%>

<div class="section-showproduct">
	<div class="container">
		<div class="row">
			<h2
				style="margin-top: 9px; margin-left: 490px; margin-bottom: 20px; font-size: 30px; color: #331A00; font-weight: bold;">Your
				Cart</h2>
			<div class="content">
				<div class="cart-items">
					<div class="container">
						<table class="table ">
							<tr>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th><a
									style="padding: 5px; text-decoration: none; font-weight: bold; font-size: 18px; background-color: #975309; color: white; border-radius: 5px;"
									href="payment.jsp"><i
										class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></i>
										Check Out</a></th>
							</tr>
							<tr>
								<th class="t-head head-it">SL</th>
								<th style="width: 20%;" class="t-head">Product Name</th>
								<th class="t-head head-it ">Price</th>
								<th class="t-head head-it ">Quantity</th>
								<th class="t-head head-it ">Action</th>
							</tr>
							<%
								int countSL = 0;
								double totalprice = 0;
								for (Cart cart : cartservice.getCartListInfo(username)) {
									totalprice += Double.parseDouble(cart.getPrice());
									countSL++;
							%>
							<tr class="cross">
								<td class="t-data"><%=countSL%></td>
								<td class="t-data"><%=cart.getProductName()%></td>
								<td class="t-data"><%=cart.getPrice()%></td>
								<td class="t-data"><%=cart.getQuantity()%></td>
								<td class="t-data t-w3l"><a
									style="text-decoration: none; font-size: 17px; font-weight: bold;"
									href="ManageCustomer?deleteCart=<%=cart.getCartId()%>"
									onclick="if (!(confirm('Are you sure you want to delete this cart?'))) return false"><span
										class="glyphicon glyphicon-remove"></span> </a></td>
							</tr>
							<%
								}
							%>
						</table>
						<table
							style="margin-left: 740px; text-align: left; margin-bottom: 2px;"
							width="40%">
							<tr>
								<th style="color: #975309;">Total :</th>
								<td style="font-weight: bold;"><%=totalprice%>Tk.</td>
							</tr>
						</table>
					</div>
					<br /> <br /> <br />
					<div class="shopping">
						<div class="shopleft">
							<a href="<c:url value="/ManageUserpage?action=ALL_POSTS" />">
								<img src="resources/image/continue.png" alt="" />
							</a>
						</div>
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
