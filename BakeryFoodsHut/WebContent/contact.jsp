<%@include file="template/header.jsp"%>


<section class="banner_area">
	<div class="container">
		<div class="banner_content">
			<h4>Contact Us</h4>
		</div>
	</div>
</section>
<section style="margin-top: 8px;" class="confirmpackage_area">
	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-md-12">
				<section style="margin-top: 120px;"
					class="page__contact bg--white pb--150 pt--180">
					<div class="container">
						<div class="row">
							<!-- Start Single Address -->
							<div class="col-md-6 col-sm-6 col-12 col-lg-4">
								<div class="address location">
									<div class="ct__icon">
										<i class="fa fa-home"></i>
									</div>
									<div class="address__inner">
										<h2>Our Location</h2>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit, sed do eiusmod temporquaerat voluptatem.</p>
										<ul>
											<li>Uttara, Zamzam Tower <br> Road # 12, Sec #13,
												5th Floor
											</li>
										</ul>
									</div>
								</div>
							</div>
							<!-- End Single Address -->
							<!-- Start Single Address -->
							<div class="col-md-6 col-sm-6 col-12 col-lg-4 xs-mt-60">
								<div class="address phone">
									<div class="ct__icon">
										<i class="fa fa-phone"></i>
									</div>
									<div class="address__inner">
										<h2>Phone Number</h2>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit, sed do eiusmod temporquaerat voluptatem.</p>
										<ul>
											<li><a href="tell:+08097-654321">+08097-654321</a></li>
											<li><a href="tell:+08097-654321">+08097-654321</a></li>
										</ul>
									</div>
								</div>
							</div>
							<!-- End Single Address -->
							<!-- Start Single Address -->
							<div class="col-md-6 col-sm-6 col-12 col-lg-4 md-mt-60 sm-mt-60">
								<div class="address email">
									<div class="ct__icon">
										<i class="fa fa-envelope"></i>
									</div>
									<div class="address__inner">
										<h2>E-mail Address</h2>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit, sed do eiusmod temporquaerat voluptatem.</p>
										<ul>
											<li><a href="mailto:+08097-654321">juniorhomeschool.@email.com</a></li>
											<li><a href="mailto:+08097-654321">Kidscareschool.@yahoo.com</a></li>
										</ul>
									</div>
								</div>
							</div>
							<!-- End Single Address -->
						</div>
					</div>
				</section>
				<div class="contactus_grid">
					<div class="map-w3">
						<iframe
							src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d673607.6340751307!2d-104.44001811743372!3d48.738351336759585!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x5321f600f5170943%3A0x94f2e8e71e1dfc7a!2sE+Comertown+Rd%2C+Westby%2C+MT+59275%2C+USA!5e0!3m2!1sen!2sin!4v1467080368135"
							allowfullscreen></iframe>
					</div>

					<div class="mail-bottom">
						<h4>Get In Touch With Us</h4>

						<form>

							<div class="form-group">
								<input style="margin-bottom: 20px; width: 560px; height: 35px;"
									class="form-control" placeholder="Name" type="text" id="name"
									required="1" />
							</div>
							<div class="form-group">
								<input style="margin-bottom: 20px; width: 560px;"
									class="form-control" placeholder="Email" type="text" id="email"
									required="1" />
							</div>
							<div class="form-group">
								<textarea class="form-control" rows="5"
									placeholder="Description" id="description" required="1"></textarea>
							</div>
							<button
								style="margin-bottom: 30px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF;"
								type="submit" class="btn" id="CUSTOMER_CONTACT">Submit</button>
							<a href="<c:url value="/ManageUserpage?action=USER_CANCEL" />"
								style="margin-bottom: 30px; background: #AD610D; border: 3px solid #EFAA31; font-weight: bold; color: #FFFFFF;"
								type="submit" class="btn">Cancel</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>


<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.js" />"></script>
<script type="text/javascript">
	$(document)
			.ready(
					function() {

						$('#CUSTOMER_CONTACT')
								.click(
										function() {

											var contactName = $('#name').val();
											var contactEmail = $('#email')
													.val();
											var contactDescription = $(
													'#description').val();

											if ($.trim(contactName) == '') {

												alert("Sorry,Name field must not be empty!!");

											} else if ($.trim(contactEmail) == '') {
												alert("Sorry,Email field must not be empty!!");

											} else if ($
													.trim(contactDescription) == '') {

												alert("Sorry,Description field must not be empty!!");

											} else {

												$
														.ajax({
															method : 'POST',
															data : {
																contactName : contactName,
																contactEmail : contactEmail,
																contactDescription : contactDescription,
																action : 'CONTACT'
															},
															url : 'ManageCustomer',
															dataType : "text",
															success : function(
																	result) {
																alert("Successfully, We will contact with you as soon as possible!!");
															}
														});

												return false;
											}

										});

					});
</script>

<%@include file="template/footer1.jsp"%>
