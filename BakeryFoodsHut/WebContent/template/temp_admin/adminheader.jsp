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


<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Bakery Foods Hut</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="bakery foods hut">


<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.css" />">
<link rel="stylesheet"
	href="<c:url value="/resources/css/font-awesome.css" />">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"
	type="text/javascript"></script>
<script src="<c:url value="/resources/js/bootstrap.js" />"
	type="text/javascript"></script>
<script src="<c:url value="/resources/js/jquery.knob.js" />"
	type="text/javascript"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/theme.css" />">
<link rel="stylesheet" type="text/css"
	href="
<c:url value="/resources/css/elements.css" />">
</head>
<body style="overflow-y: scroll;" class="theme-blue">
	<div class="navbar navbar-default" role="navigation">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="" href="index.html"><span class="navbar-brand"><span><img
						src="<c:url value="/resources/image/6.png" />" alt="Not Found"
						width="40px" height="40px;" /></span>Bakery<br />Foods Hat</span></a>

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
		<%
			if (username == null) {
				response.sendRedirect("../home.jsp");
			}
		%>
		<div class="navbar-collapse collapse" style="height: 1px;">

			<%
				if (username != null) {
			%>

			<ul id="main-menu" class="nav navbar-nav navbar-right">
				<li class="dropdown hidden-xs"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"> <span
						class="glyphicon glyphicon-user padding-right-small"
						style="position: relative; top: 3px;"></span> <%=username%> <i
						class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#">My Account</a></li>
						<li class="divider"></li>
						<li><a tabindex="-1" href="../ManageLogout">Logout</a></li>
					</ul></li>
			</ul>

			<%
				}
			%>
		</div>
	</div>
	<section style="height: 50px; background: #95540B;"
		class="optionsection">
		<div class="row">
			<div style="margin-left: 310px;" class="col-md-11 col-md-offset-1">
				<a
					style="background: #4E2614; padding: 10px; color: white; text-decoration: none; border-radius: 10px; font-weight: bold; margin-left: 60px; border: 4px solid #DAB776;"
					href="feedback.html"><span
					class="glyphicon glyphicon glyphicon-bell"></span>Customer Feedback<span
					class="badge"> 6</span></a> <a
					style="background: #4E2614; padding: 10px; color: white; text-decoration: none; border-radius: 10px; font-weight: bold; margin-left: 40px; border: 4px solid #DAB776;"
					href="onlineorder.html"><span
					class="glyphicon glyphicon glyphicon-bell"></span>Shopkeeper Message<span
					class="badge"> 8</span></a> <a
					style="background: #4E2614; padding: 10px; color: white; text-decoration: none; border-radius: 10px; font-weight: bold; margin-left: 40px; border: 4px solid #DAB776;"
					href="stocknotification.html"><span
					class="glyphicon glyphicon glyphicon-bell"></span>Contact Information
					<span class="badge"> 1</span></a> 
			</div>
		</div>
	</section>