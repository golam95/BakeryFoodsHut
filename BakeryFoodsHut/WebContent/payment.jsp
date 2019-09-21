<%@include file="template/header.jsp"%>

<section class="Productsection_item">
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<div style="height: 550px;" id="map" class="col-md-6 col-sm-6">
					<img style="margin-left: 1px; height: 550px;"
						src="<c:url value="/resources/image/payment.PNG" />"
						class="img-circle" alt="Cinque Terre">
				</div>
				<div class="col-md-4 col-sm-4 col-md-offset-1">
					<div style="margin-top: 50px;" class="section-showproduct-right">
						<div
							style="border: 2px solid #E4E4E4; border-radius: 10px; background: #EEEEEE;"
							class="listlocationbakery">
							<div class="bakerynamesection">
								<img style="height: 80px; width: 150px; margin-left: 90px;"
									src="<c:url value="/resources/image/download.png" />"
									class="img-circle" alt="Cinque Terre">
								<h2
									style="padding: 10px; font-size: 17px; font-weight: bold; text-decoration: underline; text-align: center;">
									<a href="" data-target="#bkash" data-toggle="modal">bKash
										Payment</a>
								</h2>
							</div>
						</div>
					</div>

					<div class="section-showproduct-right">
						<div
							style="border: 2px solid #E4E4E4; border-radius: 10px; background: #EEEEEE;"
							class="listlocationbakery">
							<div class="bakerynamesection">
								<img style="height: 80px; width: 150px; margin-left: 90px;"
									src="<c:url value="/resources/image/dutch.jpg" />"
									class="img-circle" alt="Cinque Terre">
								<h2
									style="padding: 10px; font-size: 17px; font-weight: bold; text-decoration: underline; text-align: center;">
									<a href="" data-target="#dutch" data-toggle="modal">Dutch
										Bangla Rocket Payment</a>
								</h2>
							</div>
						</div>
					</div>


					<div class="section-showproduct-right">
						<div
							style="border: 2px solid #E4E4E4; border-radius: 10px; background: #EEEEEE;"
							class="listlocationbakery">
							<div class="bakerynamesection">
								<img style="height: 80px; width: 150px; margin-left: 90px;"
									src="<c:url value="/resources/image/taka.jpg" />"
									class="img-circle" alt="Cinque Terre">
								<h2
									style="padding: 10px; font-size: 17px; font-weight: bold; text-decoration: underline; text-align: center;">
									<a
										href="<c:url value="/ManageUserpage?action=Offlinepayment" />">Offline
										Order</a>
								</h2>
							</div>
						</div>
					</div>






				</div>


				<div class="container">
					<div class="row">
						<div class="col-xs-12">
							<div class="modal fade" data-keyboard="false"
								data-backdrop="static" id="bkash" tabindex="-1">
								<div class="modal-dialog modal-sm">
									<div class="modal-content">
										<div
											style="background: #22202E; border-bottom: 4px solid #AD5D20;"
											class="modal-header">
											<button style="color: #FFFFFF;" class="close"
												data-dismiss="modal">&times;</button>
											<h4 style="color: #FFFFFF;" class="modal-title">
												<span class="glyphicon glyphicon-ok"></span> bKash payment
											</h4>
										</div>
										<div class="modal-body">
											<form>
												<div class="form-group">
													<label for="inputUserName">Enter bKash number</label> <input
														class="form-control" placeholder="Login Username"
														type="text" id="inputUserName" />
												</div>
												<div class="form-group">
													<label for="inputUserName">Enter bKash transaction
														Id</label> <input class="form-control"
														placeholder="Login Username" type="text"
														id="inputUserName" />
												</div>
											</form>
										</div>
										<div class="modal-footer">
											<button style="background: gray; color: #FFFFFF;" class="btn">Save</button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>



				<div class="container">
					<div class="row">
						<div class="col-xs-12">
							<div class="modal fade" data-keyboard="false"
								data-backdrop="static" id="dutch" tabindex="-1">
								<div class="modal-dialog modal-sm">
									<div class="modal-content">
										<div
											style="background: #22202E; border-bottom: 4px solid #AD5D20;"
											class="modal-header">
											<button style="color: #FFFFFF;" class="close"
												data-dismiss="modal">&times;</button>
											<h4 style="color: #FFFFFF;" class="modal-title">
												<span class="glyphicon glyphicon-ok"></span> Rocket payment
											</h4>
										</div>
										<div class="modal-body">
											<form>
												<div class="form-group">
													<label for="inputUserName">Enter rocket number</label> <input
														class="form-control" placeholder="Login Username"
														type="text" id="inputUserName" />
												</div>
												<div class="form-group">
													<label for="inputUserName">Enter rocket transaction
														Id</label> <input class="form-control"
														placeholder="Login Username" type="text"
														id="inputUserName" />
												</div>
											</form>
										</div>
										<div class="modal-footer">
											<button style="background: gray; color: #FFFFFF;" class="btn">Save</button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>



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
<%@include file="template/footer.jsp"%>
