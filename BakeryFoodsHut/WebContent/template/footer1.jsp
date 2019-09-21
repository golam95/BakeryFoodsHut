

<section class="finalfootersection">
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<div class="beforefooter">
					<h5>
						<a href="<c:url value="/ManageUserpage?action=USER_LOCATION" />">Location</a>
					</h5>
				</div>
			</div>
			<div class="col-md-3">
				<div class="beforefooter">
					<h5>
						<a href="/ManageUserpage?action=RANKING_BAKERY">All Bakery</a>
					</h5>
				</div>
			</div>
			<div class="col-md-3">
				<div class="beforefooter">
					<h5>
						<a href="<c:url value="/ManageUserpage?action=OUR_MISSION" />">Service</a>
					</h5>
				</div>
			</div>
			<div class="col-md-3">
				<div class="beforefooter">
					<h5>
						<a href="<c:url value="/ManageUserpage?action=OUR_MISSION" />">About Us</a>
					</h5>
				</div>
			</div>
		</div>
	</div>
</section>
<!--================End Recent Blog Area =================-->
<footer class="footer_area">
	<div class="footer_widget_area">
		<div class="container">
			<div class="row">
				<div class="col-md-3">
					<aside class="f_widget about_widget">
						<div class="f_w_title">
							<h4>Our Mission/Vision</h4>
						</div>
						<p>
							<a href="<c:url value="/ManageUserpage?action=USER_CANCEL" />"><img
								style="width: 240px;"
								src="<c:url value="/resources/image/title.png" />" alt=""></a>
						</p>
						<ul>
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
							<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
						</ul>
					</aside>
				</div>
				<div class="col-md-3">
					<aside class="f_widget contact_widget">
						<div class="f_w_title">
							<h4>CONTACT US</h4>
						</div>
						<p>Have questions, comments or just want to say hello:</p>
						<ul>
							<li><a href="#"><i class="fa fa-envelope"></i>bakeryfoodshut@gmail.com</a></li>
							<li><a href="#"><i class="fa fa-phone"></i>+88 09876543234
									378</a></li>
							<li><a href="#"><i class="fa fa-map-marker"></i> 52/B, Panthapath, Dhaka 1205<br /></a></li>
						</ul>
					</aside>
				</div>
				<div class="col-md-3">
					<aside class="f_widget twitter_widget">
						<div class="f_w_title">
							<h4>Join Us</h4>
						</div>
						<ul>
							<li><a href="#">bakeryfoodshut@gmail.com</a></li>
							<li><a href="#">golamnobi@gmail.com</a> </li>
						</ul>
					</aside>
				</div>
				<div class="col-md-3">
					<aside class="f_widget twitter_widget">
						<div class="f_w_title">
							<h4>Our Service</h4>
						</div>
						<ul>
							<li><img style="height: 190px; height: 200px;"
								src="<c:url value="/resources/image/service-icon/6.png" />"
								alt=""></li>
						</ul>
					</aside>
				</div>
			</div>
		</div>
	</div>
	<div class="copy_right_area">
		<div class="container">
			<div class="pull-left">
				<h5>
					<p>
						Copyright &copy; All rights reserved | by <a
							style="color: #FFFFFF;" href="#">Bakery foods Hat</a>
					</p>
				</h5>
			</div>
		</div>
	</div>
</footer>

<div class="back-to-top"></div>
<!--================End Recent Blog Area =================-->

<script src="<c:url value="/resources/js/jquery.js" />"></script>
<script>
	$(window).scroll(function() {
		if ($(this).scrollTop() > 500) {
			$(".back-to-top").fadeIn();
		} else {
			$(".back-to-top").fadeOut();
		}
	});
	$(".back-to-top").click(function() {
		$("html, body").animate({
			scrollTop : 0
		}, 700);
	});

	$(window).scroll(function() {
		if ($(this).scrollTop() > 630) {
			$(".feedback-to-top").fadeIn();
		} else {
			$(".feedback-to-top").fadeOut();
		}
	});

	$(window).scroll(function() {
		if ($(this).scrollTop() > 680) {
			$(".question-to-top").fadeIn();
		} else {
			$(".question-to-top").fadeOut();
		}
	});
</script>
<script src="<c:url value="/resources/js/jquery-2.1.4.min.js" />"></script>

<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script
	src="<c:url value="/resources/vendors/revolution/js/jquery.themepunch.tools.min.js" />"></script>
<script
	src="
<c:url value="/resources/vendors/revolution/js/jquery.themepunch.revolution.min.js" />"></script>
<script
	src="<c:url value="/resources/vendors/revolution/js/extensions/revolution.extension.video.min.js" />"></script>
<script
	src="<c:url value="/resources/vendors/revolution/js/extensions/revolution.extension.slideanims.min.js" />"></script>

<script
	src="<c:url
		value="/resources/vendors/bootatrap-date-time/bootstrap-datetimepicker.min.js" />"></script>
<script
	src="<c:url
		value="/resources/vendors/bootstrap-selector/bootstrap-select.js" />"></script>
<script
	src="<c:url
		value="/resources/vendors/revolution/js/extensions/revolution.extension.parallax.min.js" />"></script>
<!-- Extra plugin js -->
<script
	src="<c:url
		value="/resources/vendors/revolution/js/extensions/revolution.extension.navigation.min.js" />"></script>
<script
	src="	<c:url
		value="/resources/vendors/revolution/js/extensions/revolution.extension.layeranimation.min.js" />

	"></script>

<script
	src="<c:url value="/resources/vendors/owl-carousel/owl.carousel.min.js" />"></script>
<script
	src="<c:url value="/resources/vendors/isotope/imagesloaded.pkgd.min.js" />"></script>
<script
	src="<c:url value="/resources/vendors/isotope/isotope.pkgd.min.js" />"></script>
<script
	src="<c:url value="/resources/vendors/countdown/jquery.countdown.js" />"></script>
<script
	src="<c:url value="/resources/vendors/js-calender/zabuto_calendar.min.js" />"></script>
<script src="<c:url value="/resources/js/theme.js" />"></script>

</body>
</html>