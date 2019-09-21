<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.bakeryfoodshut.serviceImpl.LoginServiceImpl"%>
<%@page
	import="com.bakeryfoodshut.serviceImpl.ManageStaticesServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PostServiceImpl"%>
<%@page import="com.bakeryfoodshut.model.Post"%>

<%
	ManageStaticesServiceImpl statisticeService = new ManageStaticesServiceImpl();
	PostServiceImpl managepost = new PostServiceImpl();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Bakery Foods Hut</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="layout" content="main" />
<script src="<c:url value="/resources/js/jquery-2.1.4.min.js"/>"
	type="text/javascript"></script>

<link href="<c:url value="/resources/css/customize-template.css"/>"
	type="text/css" media="screen, projection" rel="stylesheet" />
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	type="text/css" rel="stylesheet" />
<link href="<c:url value="/resources/css/customize.css"/>"
	type="text/css" rel="stylesheet" />
<link href="<c:url value="/resources/css/fontawesome.min.css"/>"
	type="text/css" rel="stylesheet" />
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">

				<%@include file="/template/temp_session/filteruser.jsp"%>

				<button class="btn btn-navbar" data-toggle="collapse"
					data-target="#app-nav-top-bar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

				<a href="dashboard.html" class="brand"><img
					style="height: 70px;" src="<c:url value="/resources/image/6.png"/>"
					alt="Not Found"><span
					style="font-size: 22px; font-weight: bold;"> Bakery Foods
						Hat</span></a>
				<div id="app-nav-top-bar" class="nav-collapse">
					<ul class="nav pull-right">
						<%
							int stockcount = 0;
							for (Post p : managepost.getPostinfoList(username)) {
								if (p.getPostQuantity() <= statisticeService.RetriveQuantity(username)) {
									stockcount += 1;
								}
							}
						%>
						<li><a href="#"><i class="icon-bell"></i> Stock
								Notification <span style="background: red;" class="badge"><%=stockcount%></span></a></li>
						<li><a href="#"><i class="icon-truck"></i> Customer Order
								<span style="background: #FFFFFFF;" class="badge">5</span></a></li>
						<li><a href="#"><i class="icon-bell"></i> Expire Date <span
								style="background: red;" class="badge">5</span> </a></li>
						<li><a href="#"><i class="icon-envelope"></i> Message <span
								style="background: orange;" class="badge"><%=statisticeService.TotalMessage(username)%></span>
						</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"><i class="icon-user"></i> Md. Golam
								Nobi <b style="margin-bottom: 10px;" class="caret hidden-phone"></b>
						</a>
							<ul class="dropdown-menu hoversection">
								<%
									LoginServiceImpl shopservice = new LoginServiceImpl();
									if (shopservice.checkprofilemanage(username)) {
								%>
								<li><a
									href="../ManageShopkeeperpaidpage?action=PAID_POFILE"><i
										class="icon-user"></i> Profile</a></li>
								<li><a
									href="../ManageShopkeeperpaidpage?action=PAID_PROFILESETTING"><i
										class="icon-cogs"></i>Profile Settings</a></li>
								<li><a
									href="../ManageShopkeeperpaidpage?action=PAID_QUANTITYSETTING"><i
										class="icon-cogs"></i>Quantity Settings</a></li>
								<li><a href="../ManageLogout"><i class="icon-signin"></i>Logout</a></li>
							</ul></li>
						<%
							} else {
						%>
						<li><a href="../ManageLogout"><i class="icon-signin"></i>Logout</a></li>
						<%
							}
						%>
					</ul>
				</div>
			</div>
		</div>
	</div>