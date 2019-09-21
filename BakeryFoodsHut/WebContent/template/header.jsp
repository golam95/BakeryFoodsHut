<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bakeryfoodshut.serviceImpl.RegistrationServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Registration"%>
<%@page import="com.bakeryfoodshut.model.Cart"%>
<%@page import="com.bakeryfoodshut.serviceImpl.CartServiceImpl"%>

<%
	RegistrationServiceImpl registratoinservice = new RegistrationServiceImpl();
	CartServiceImpl cartservice = new CartServiceImpl();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon"
	href="<c:url value="/resources/image/express-favicon.png" />"
	type="image/x-icon" />
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bakery Foods Hat</title>
<!-- Icon css link -->
<link
	href="<c:url value="/resources/vendors/material-icon/css/materialdesignicons.min.css" />"
	rel="stylesheet">

<link href="<c:url value="/resources/css/font-awesome.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/vendors/linears-icon/style.css"/>"
	rel="stylesheet">
<!-- Bootstrap -->
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

<!-- Rev slider css -->
<link
	href="<c:url value="/resources/vendors/revolution/css/settings.css"/>"
	rel="stylesheet">
<link
	href="<c:url value="/resources/vendors/revolution/css/layers.css"/>"
	rel="stylesheet">
<link
	href="<c:url value="/resources/vendors/revolution/css/navigation.css"/>"
	rel="stylesheet">

<!-- Extra plugin css -->
<link
	href="<c:url value="/resources/vendors/bootatrap-date-time/bootstrap-datetimepicker.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/vendors/bootstrap-selector/bootstrap-select.css" />"
	rel="stylesheet">
<link
	href="	<c:url value="/resources/owl-carousel/assets/owl.carousel.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style1.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/responsive.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/design.css" />"
	rel="stylesheet">

</head>

<body>
	<div id="preloader">
		<div class="loader absolute-center">
			<div class="loader__box">
				<b class="top"></b>
			</div>
			<div class="loader__box">
				<b class="top"></b>
			</div>
			<div class="loader__box">
				<b class="top"></b>
			</div>
		</div>
	</div>
	<%
		String username = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("username"))
					username = cookie.getValue();
			}
		}
	%>
	<div class="first_header">
		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<div class="header_contact_details">
						<div class="header_contact_details">
							<a href="#"><span style="font-size: 20px; margin-left: 38px;"
								class=" glyphicon glyphicon-map-marker"></span> 52/B,
								Panthapath, Dhaka 1205</a> <a href="#"><span
								style="font-size: 20px;" class="glyphicon glyphicon-phone-alt"></span>
								+0123456786</a>
						</div>
					</div>
				</div>
				<div class="col-md-1"></div>
				<div class="col-md-6">
					<div class="header_social">
						<ul>
							<li><a href="#"><input
									style="width: 180px; height: 30px; border-bottom: 2px solid #FFFFFF; background: #331A00; border-top: 1px solid #331A00; border-left: 1px solid #331A00; border-right: 1px solid #331A00;"
									type="search" placeholder="search.." /><i
									style="border-bottom: 2px solid #FFFFFF; padding-bottom: 5px;"
									class="fa fa-search"></i> </a></li>

							<li>
								<div style="width: 50px;" class="dropdown">
									<button
										style="background: #331A00; border: 2px solid #331A00; border-radius: 4px; width: 55px; padding-right: 6px;"
										class="dropdown-toggle" type="button" data-toggle="dropdown">
										<p style="font-weight: bold; color: white; font-size: 20px;">
											<i class="fa fa-truck" aria-hidden="true"></i>
										</p>
									</button>

									<ul class="dropdown-menu">
										<%
											if (registratoinservice.checkCustomeremail(username) == true) {
										%>
										<li style="background: #ffffff;"><a
											style="color: gray; font-size: 14px; line-height: 9px; padding: 0px;"
											href="<c:url value="/ManageUserpage?action=MYORDERLIST" />"><span
												class="glyphicon glyphicon-log-in"></span> Order Details</a></li>
										<%
											}
										%>
										<li><a
											style="color: gray; font-size: 14px; line-height: 13px; margin-top: 10px; padding: 0px;"
											href="<c:url value="/ManageUserpage?action=CONTACT_USER" />"><span
												class="glyphicon glyphicon-log-in"></span> Ask question</a></li>
										<li><a
											style="color: gray; font-size: 14px; line-height: 13px; margin-top: 10px; padding: 0px;"
											href="<c:url value="/ManageUserpage?action=USER_SERVICE" />"><span
												class="glyphicon glyphicon-log-in"></span> Help</a></li>
									</ul>
								</div>
							</li>
							<li>
								<div style="width: 50px;" class="dropdown">
									<a
										style="background: #331A00; border: 2px solid #331A00; border-radius: 4px; width: 55px; padding-right: 6px;"
										type="button" id="showCart"
										href="<c:url value="/ManageUserpage?action=USER_CART" />"><p
											style="font-weight: bold; color: white;"></p> </a>
								</div>
							</li>
							<li>
								<div style="width: 50px;" class="dropdown">
									<button
										style="background: #331A00; border: 2px solid #EFCB6C; border-radius: 4px; width: 48px;"
										class="dropdown-toggle" type="button" data-toggle="dropdown">
										<i class="fa fa-user-circle"></i> <span style="color: #FFFFFF"
											class="caret"></span>
									</button>
									<ul class="dropdown-menu">
										<%
											if (registratoinservice.checkCustomeremail(username) == true) {
										%>
										<li><a
											style="color: gray; font-size: 14px; line-height: 13px; margin-top: 10px; padding: 0px;"
											href="<c:url value="/ManageUserpage?action=USER_PROFILE" />"><span
												class="glyphicon glyphicon-log-in"></span> My profile</a></li>
										<li><a
											style="color: gray; font-size: 14px; line-height: 13px; margin-top: 10px; padding: 0px;"
											href="<c:url value="/ManageLogout" />"><span
												class="glyphicon glyphicon-log-in"></span> Logout</a></li>
										<%
											} else {
										%>
										<li><a
											style="color: gray; font-size: 14px; line-height: 9px; padding: 0px;"
											href="<c:url value="/ManageUserpage?action=USER_LOGIN" />"><span
												class="glyphicon glyphicon-log-in"></span> LogIn</a></li>
										<li><a
											style="color: gray; font-size: 14px; line-height: 13px; margin-top: 10px; padding: 0px;"
											href="<c:url value="/ManageUserpage?action=USER_REG" />"><span
												class="glyphicon glyphicon-log-in"></span> Registration</a></li>
										<%
											}
										%>
									</ul>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<header class="main_menu_area">
		<nav class="navbar navbar-default">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a href="<c:url value="/" />">Home</a></li>
						<li><a
							href="<c:url value="/ManageUserpage?action=ALL_POSTS" />">Post</a></li>
						<li><a
							href="<c:url value="/ManageUserpage?action=USER_LOCATION" />">Location</a></li>
						<li><a
							href="<c:url value="/ManageUserpage?action=RANKING_BAKERY" />">All
								Bakery</a></li>
						<a class="navbar-brand"
							href="<c:url value="/ManageUserpage?action=USER_CANCEL"/>"><img
							style="width: 290px; margin-top: 7px; height: 155px;"
							src="<c:url value="/resources/image/bakeryhutslogo.png" />"
							alt=""></a>
						<li><a
							href="<c:url value="ManageUserpage?action=USER_SERVICE" />">Service</a></li>
						<li class="dropdown submenu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false">Foods Menu <i
								class="fa fa-angle-down" aria-hidden="true"></i></a>
							<ul style="width: 800px; border: 2px solid #AD610D;"
								class="dropdown-menu">
								<div class="row">
									<div class="col-md-12">
										<h4
											Style="padding: 5px; font-size: 27px; font-weight: bold; margin-top: 20px; margin-bottom: 10px;">Foods
											Category</h4>
										<div class="col-md-3">

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Bread">Bread</a></li>
											<li><a href="searchfooditempost.jsp?getsearchValue=Cake">Cake</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Cookie">Cookie</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Bread roll">Bread
													roll</a></li>

										</div>
										<div class="col-md-3">

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Dry Cake">Dry
													Cake</a></li>
											<li><a href="searchfooditempost.jsp?getsearchValue=Bun">Bun</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Snacks">Snacks</a></li>

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Biscuit">Biscuit</a></li>
										</div>
										<div class="col-md-3">

											<li><a
												href="searchfooditempost.jsp?getsearchValue=Toast Biscuit">Toast
													Biscuit</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Bakery Sweets">Bakery
													Sweets</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=chanachur">chanachur</a></li>




										</div>
										<div class="col-md-3">
											<li><a href="searchfooditempost.jsp?getsearchValue=pies">pies</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Pastry">Pastry</a></li>
											<li><a
												href="searchfooditempost.jsp?getsearchValue=Shawarma">Shawarma</a></li>
										</div>
									</div>
								</div>
							</ul></li>
						<li class="dropdown submenu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false">About<i
								class="fa fa-angle-down" aria-hidden="true"></i></a>
							<ul class="dropdown-menu">
								<li><a
									href="<c:url value="/ManageUserpage?action=OUR_MISSION" />">Our
										Mission</a></li>
								<li><a
									href="<c:url value="/ManageUserpage?action=OUR_MISSION" />">Our
										Vision</a></li>
							</ul></li>
						<li><a
							href="<c:url value="/ManageUserpage?action=CONTACT_USER" />">Contact
						</a></li>
						<li></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.js" />"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			setInterval(function() {
				$('#showCart').load("autoloadCart.jsp").fadeIn("slow");
			}, 1000);
		});
	</script>
	<!--================End Footer Area =================-->