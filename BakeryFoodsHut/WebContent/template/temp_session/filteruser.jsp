<%@page import="com.bakeryfoodshut.serviceImpl.BakerymadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.HomemadeServiceImpl"%>
<%@page import="com.bakeryfoodshut.serviceImpl.PaidpackageServiceImpl"%>

<%
	BakerymadeServiceImpl bakerymadeservice = new BakerymadeServiceImpl();
	HomemadeServiceImpl homemadeservice = new HomemadeServiceImpl();
	PaidpackageServiceImpl paidservice = new PaidpackageServiceImpl();
%>

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