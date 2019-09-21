
<%@include file="template/header.jsp"%>

<section
	style="background: url(resources/image/osthirbanner.png) no-repeat scroll center center; height: 500px;"
	class="slider_area">
	<div class="leftbannersection">
		<div class="caption">
			<h3>Best platform for all the bakery's</h3>
			<h4>Bakery Food's Hat</h4>
		</div>
		<div class="caption_description">
			<p>Bakery Foods Hut a biggest onine platform for all bakery shops
				in Bangladesh.That helps to ensure healthy and quality bakery foods
				for the general people of Bangladesh.User able to find out nearest
				Bakery shop.</p>
			<img style="width: 290px; height: 55px;"
				src="resources/image/signature.PNG" alt="Not found">
		</div>
		<div class="chooseoption col-sm-12 col-md-12">
			<div class="freeoption col-sm-6 col-md-6">
				<a href="#Takepackage">Free pacakage</a>
			</div>
			<div class="paidoption col-sm-6 col-md-6">
				<a href="#Takepackage">Paid package</a>
			</div>
		</div>
	</div>
</section>


<section style="background: #BD803D;" class="readcarefully">
	<div class="container">
		<marquee>
			<span
				style="padding: 3px; font-weight: bold; color: white; font-size: 16px;">**We
				are honored by Health Ministry**</span>
		</marquee>
		<div class="row">

			<div class="col-md-4">
				<div style="margin-top: 20px;" class="beforefooter1">
					<div class="row">
						<div class="col-md-2">
							<i style="color: #E7EAED; font-size: 47px; margin-right: 16px;"
								class="fa fa-map-marker" aria-hidden="true"></i>
						</div>
						<div class="col-md-8">
							<h3 style="color: #E7EAED;">Identify Location</h3>
							<h5 style="color: #E7EAED; font-weight: bold;">Explore your
								nearest bakery shop</h5>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div style="margin-top: 20px;" class="beforefooter1">
					<div class="row">
						<div class="col-md-2">
							<i style="color: #E7EAED; font-size: 47px; margin-right: 16px;"
								class="fa fa-check-circle-o" aria-hidden="true"></i>
						</div>
						<div class="col-md-8">
							<h3 style="color: #E7EAED;">BSTI Approved</h3>
							<h5 style="color: #E7EAED; font-weight: bold;">Explore BSTI
								approved bakery</h5>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div style="margin-top: 20px;" class="beforefooter1">
					<div class="row">
						<div class="col-md-2">
							<i style="color: #E7EAED; font-size: 47px; margin-right: 16px;"
								class="fa fa-user-circle" aria-hidden="true"></i>
						</div>
						<div class="col-md-8">
							<h3 style="color: #E7EAED;">About Us</h3>
							<h5
								style="color: #E7EAED; font-weight: bold; margin-bottom: 20px;">Known
								our mission and vision</h5>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!--================Strart paid option Area =================-->

<section id="Takepackage" class="package_area">
	<div class="container">
		<div class="s_black_titleone">
			<h3>Take a</h3>
			<h2>Package</h2>
		</div>
		<div class="row">
			<div class="col-md-6 col-sm-6">
				<div style="border: 2px solid gray;" class="service_item">
					<img src="img/service-icon/paid.PNG" alt="">
					<h3>Free Package</h3>
					<h2 style="font-size: 18px; font-weight: bold;">(0 Tk.)
						Monthly</h2>


					<p style="padding: 10px; margin-bottom: 37px;">Those who want
						to produce healthy food at home/ who have a bakery shop and want
						to advertisment their home made/Bakery house product, by getting
						this free package they can easily doing their task.</p>
					<a class="read_mor_btn" href="#" data-target="#selectpackagetype"
						data-toggle="modal">Take Free</a>
				</div>
			</div>
			<div class="col-md-6 col-sm-6">
				<div style="border: 2px solid gray; height: 344px;"
					class="service_item">
					<img src="img/service-icon/paid.PNG" alt="">
					<h3>Paid Package</h3>
					<h2 style="font-size: 18px; font-weight: bold;">(500 Tk.)
						Monthly</h2>
					<p>Those who have a bakery shop and want to manage the bakery
						shop they can getting the paid package by getting this paid
						package they can easily manage their task.</p>
					<br /> <a class="read_mor_btn"
						href="<c:url value="/ManageUserpage?action=USER_PAIDPACKAGE" />">Take
						Paid</a>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="modal" id="selectpackagetype" tabindex="-1">
					<div style="width: 500px; margin-top: 50px;" class="modal-dialog">
						<div class="modal-content">
							<div
								style="background: #22202E; border-bottom: 5px solid #D3943D;"
								class="modal-header">
								<button style="color: #FFFFFF;" class="close"
									data-dismiss="modal">&times;</button>
								<h4 style="color: #FFFFFF; font-size: 17px;" class="modal-title">
									<i style="font-size: 27px;" class="fa fa-check"
										aria-hidden="true"></i><span style="padding-left: 5px;">Choose
										options</span>
								</h4>
							</div>
							<div class="modal-body">
								<h4 style="font-size: 19px;">Please select option:</h4>
								<div class="col-md-12">
									<br /> <br />
									<div class="col-md-4 col-md-offset-2">
										<div class="item_food">
											<div style="width: 105px; height: 105px;" class="round-area">
												<img
													style="height: 75px; margin-left: 8px; margin-top: 10px;"
													src="<c:url value="/resources/image/shop/selectpackage.PNG" />"
													class="img-circle" alt="Cinque Terre" width="80"
													height="30">
											</div>
											<div style="padding: 4px;" class="title_name">
												<a
													style="color: white; margin-left: 1px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
													href="<c:url value="/ManageUserpage?action=USER_HOMEMADE" />">Home
													made</a>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="item_food">
											<div style="width: 105px; height: 105px;" class="round-area">
												<img
													style="height: 75px; margin-left: 8px; margin-top: 10px;"
													src="<c:url value="/resources/image/shop/selectpackage.PNG" />"
													class="img-circle" alt="Cinque Terre">
											</div>
											<div style="padding: 4px;" class="title_name">
												<a
													style="color: white; margin-left: 5px; font-style: bold; color: #331A00; font-weight: bold; text-decoration: underline;"
													href="<c:url value="/ManageUserpage?action=USER_BAKERYMADE" />">Bakery
													Shop</a>
											</div>
										</div>
										<br />
									</div>
								</div>
							</div>
							<div class="modal-footer">
								<button
									style="background: #AD610D; border: 2px solid #EFAA31; width: 470px;"
									class="btn btn-primary" data-dismiss="modal">Cancel</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>















</section>

<section class="whycomehere_area">
	<div class="container">
		<div class="s_black_titlewhy">
			<h3>Why</h3>
			<h2>Bakery food's Hat</h2>
		</div>
		<div class="row">
			<div class="col-md-4 col-sm-6">
				<div
					style="border: 5px solid #FFFFFF; background-color: #E8E8FF; border-radius: 15px;"
					class="service_item">
					<img src="<c:url value="/resources/image/service-icon/r_6.PNG" />"
						alt="Paid Icon">
					<h3>Healthy Food's</h3>
					<p>BFH helps the customer to make ensure which bakery is BSTI
						approved and which are not</p>
				</div>
			</div>

			<div class="col-md-4 col-sm-6">
				<div
					style="border: 5px solid #FFFFFF; background-color: #E8E8FF; border-radius: 15px;"
					class="service_item">
					<img src="<c:url value="/resources/image/service-icon/r_1.PNG" />"
						alt="">

					<h3>Track Location</h3>
					<p>User can easily find the bakery location from their own
						loaction</p>
				</div>
			</div>

			<div class="col-md-4 col-sm-6">
				<div
					style="border: 5px solid #FFFFFF; background-color: #E8E8FF; border-radius: 15px;"
					class="service_item">
					<img src="<c:url value="/resources/image/service-icon/r_2.PNG" />"
						alt="">
					<h3>Compare price</h3>
					<p>User can easily compare the price also compare lowest price
						and higest price</p>
				</div>
			</div>


			<div style="margin-top: 70px;" class="col-md-4 col-sm-6">
				<div
					style="border: 5px solid #FFFFFF; background-color: #E8E8FF; border-radius: 15px;"
					class="service_item">
					<img src="<c:url value="/resources/image/service-icon/r_3.PNG" />"
						alt="">
					<h3>Free package</h3>
					<p>By getting the free package bakery shopkeeper post their
						foods item</p>
				</div>
			</div>

			<div style="margin-top: 70px;" class="col-md-4 col-sm-6">
				<div
					style="border: 5px solid #FFFFFF; background-color: #E8E8FF; border-radius: 15px;"
					class="service_item">
					<img src="<c:url value="/resources/image/service-icon/r_4.PNG" />"
						alt="">
					<h3>Paid Package</h3>
					<p>By getting paid package the shopkeeper manage their whole
						bakery system</p>
				</div>
			</div>

			<div style="margin-top: 70px;" class="col-md-4 col-sm-6">
				<div
					style="border: 5px solid #FFFFFF; background-color: #E8E8FF; border-radius: 15px; margin-bottom: 40px;"
					class="service_item">
					<img src="<c:url value="/resources/image/service-icon/r_5.PNG" />"
						alt="">
					<h3>Healthy Food's</h3>
					<p>Those who have a bakery shop and want to manage the bakery
						shop they can getting the.</p>
				</div>
			</div>

		</div>
	</div>
</section>

<!--================End whycome option Area =================-->
<section class="booking_table_area">
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img style="height: 450px; margin-left: 90px;"
					src="<c:url value="/resources/image/service-icon/6.png" />" alt="">

			</div>
			<div class="col-md-7">
				<div class="meet-section">
					<h3>Meet Bakery foods Hat</h3>
					<p>Bakery Foods Hut a biggest onine platform for all bakery
						shops in Bangladesh.That helps to ensure healthy and quality
						bakery foods for the general people of Bangladesh.User able to
						find out nearest Bakery shop.</p>
					<a href="<c:url value="/ManageUserpage?action=OUR_MISSION" />">More
						Details</a>

				</div>
			</div>
		</div>
	</div>
	</div>
</section>

<!--========================How it will work =========================-->

<section class="howitwork_area">
	<div class="container">
		<div class="s_black_titletwo">
			<h3>How Bakery foods Hat</h3>
			<h2>Works</h2>
		</div>
		<div class="row">
			<div class="col-md-4 col-sm-6">
				<div style="border: 5px solid #FFFFFF;" class="service_item">
					<img src="<c:url value="/resources/image/service-icon/paid.PNG" />"
						alt="">
					<h3>Regstration process</h3>
					<h5
						style="font-size: 30px; padding: 5px; background: #ffffff; margin-top: 20px; border-radius: 5px; color: #280901; margin-bottom: 50px; border: 3px solid #EFCB6C;">
						Step:1 <span
							style="color: #AA5508; font-size: 35px; margin-left: 20px;"
							class="glyphicon glyphicon-ok"></span>
					</h5>
				</div>
			</div>
			<div class="col-md-4 col-sm-6">
				<div style="border: 5px solid #FFFFFF;" class="service_item">
					<img src="<c:url value="/resources/image/service-icon/paid.PNG" />"
						alt="">
					<h3>Authentication</h3>
					<h5
						style="font-size: 30px; padding: 5px; background: #ffffff; margin-top: 20px; border-radius: 5px; color: #280901; margin-bottom: 100px; border: 3px solid #EFCB6C;">
						Step:2 <span
							style="color: #AA5508; font-size: 35px; margin-left: 20px;"
							class="glyphicon glyphicon-ok"></span>
					</h5>
				</div>
			</div>
			<div class="col-md-4 col-sm-6">
				<div style="border: 5px solid #FFFFFF;" class="service_item">
					<img src="<c:url value="/resources/image/service-icon/paid.PNG" />"
						alt="">
					<h3>Doing your activities</h3>
					<h5
						style="font-size: 30px; padding: 5px; background: #ffffff; margin-top: 20px; border-radius: 5px; color: #280901; margin-bottom: 50px; border: 3px solid #EFCB6C;">
						<span style="color: #AA5508; font-size: 35px; margin-left: 20px;"
							class="glyphicon glyphicon-ok"></span> Step:3
					</h5>
				</div>
			</div>
		</div>
	</div>
</section>

<!-- ==========================End how it will work ===================-->

<!--================Booking Table Area =================-->



<!--================End Booking Table Area =================-->


<!--================End Slider Area =================-->

<!--================Service Area =================-->

<!--================End Service Area =================-->


<section class="howtoenroll_area">
	<div class="container">
		<div class="row">
			<div class="col-md-9">
				<div class="meet-section_enroll">
					<h3>How to enroll Bakery foods Hat</h3>
					<p>Bakery Foods Hut offer two package.One is paid and another
						is free.Those who want to produce healthy food at home/ who have a
						bakery shop and want to advertisment their home made/Bakery house
						product, by getting this free package they can easily doing their
						task.Those who have a bakery shop and want to manage the bakery
						shop they can getting the paid package by getting this paid
						package they can easily manage their task.</p>
				</div>
			</div>
			<div class="col-md-3">
				<div style="margin-top: 48px;" class="meet-section">
					<a href="<c:url value="/ManageUserpage?action=USER_LOGIN" />">Enroll
						Now</a>
				</div>
			</div>
		</div>
	</div>
	</div>
</section>

<section class="downloadsection">
	<div class="container">
		<div class="s_black_titledownload">
			<h3>Download Our</h3>
			<h2>Apps</h2>
		</div>
		<div class="row">
			<div class="col-md-8">
				<div class="dowonloadapp_subsection">
					<h5>Lorem Ipsum is simply dummy text of the printing and
						typesetting industry. Lorem Ipsum has been the industry's standard
						dummy text ever since the 1500s, when an unknown printer took a
						galley of type and scrambled it to make a type specimen book. It
						has survived not only five centuries, but also the leap into
						electronic typesetting, remaining essentially unchanged. It was
						popularised in the 1960s with the release of Letraset sheets
						containing Lorem Ipsum passages, and more recently with desktop
						publishing software like Aldus PageMaker including versions of
						Lorem Ipsum.</h5>
				</div>
			</div>
			<div class="col-md-4">
				<div class="dowonloadapp_subsection">
					<img
						src="<c:url value="/resources/image/service-icon/playstore.png" />"
						alt="">
				</div>
			</div>
		</div>
	</div>
</section>



<section style="background: #181620;" class="countclients_area">
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<h3>
					<span class="glyphicon glyphicon-user"></span>
				</h3>
				<h4>Total Clients</h4>
				<h5>1000</h5>
			</div>
			<div class="col-md-4">
				<h3>
					<span class="glyphicon glyphicon-leaf"></span>
				</h3>
				<h4>Total Clients</h4>
				<h5>1000</h5>
			</div>
			<div class="col-md-4">
				<h3>
					<span class="glyphicon glyphicon-dashboard"></span></span>
				</h3>
				<h4>Total Clients</h4>
				<h5>1000</h5>
			</div>
		</div>
	</div>
</section>


<!--================End Our Chefs Area =================-->
<section class="next_event_area">
	<div class="container">
		<div class="row">

			<div class="col-md-12">
				<div class="contact-section_enroll">
					<h3>Please Contact Bakery foods Hat</h3>
					<h4>My project is aimed at providing quality and healthy food
						service.My project will be benefited not only the general
						people,but everyone will benefit likes as bakery owner because my
						propose system have two package one is paid and another is
						free.Those who want to produce healthy food at home and want to
						trade, they can easily doing their business through this
						application by getting free package.Those who have a bakery shop
						and want to manage the bakery shop they can getting the paid
						package.To visiting my application people can easily understand
						which bakery shop is valid or getting permission from Bangladesh
						Standards and Testing Institution(BSTI).If all the bakery who
						getting permission from Bangladesh Standards and Testing 4
						Institution (BSTI) coming in the same platfrom Goverment can
						easily monitor all these of bakery house.Our main focus is the
						food quality not brand value.This project started with the desktop
						application now we are currently working on web application and
						Android Apps.A lot of functionality included in our project like
						google mapping,voice recognized,customer review,post,comment,share
						etc.Even those non-technical using voice recognized system they
						can easily find their bakery house their specific area.So that
						they can buy their healthy food from their favorite bakery house.
					</h4>
					<p>If you are getting or face any problem.Please..</p>
					<p>
						<a
							style="background: #FFFFFF; color: #22202E; border: 4px solid #975309;"
							href="<c:url value="/ManageUserpage?action=CONTACT_USER" />">Contact
							Us</a>
					</p>
				</div>
			</div>

		</div>
	</div>
</section>
<%@include file="template/footer.jsp"%>
