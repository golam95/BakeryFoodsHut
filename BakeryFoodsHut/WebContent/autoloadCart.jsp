
<%@page import="com.bakeryfoodshut.model.Cart"%>
<%@page import="com.bakeryfoodshut.serviceImpl.CartServiceImpl"%>
<%
	CartServiceImpl cartservice = new CartServiceImpl();
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
	int countCart = 0;
	for (Cart cart : cartservice.getCartListInfo(username)) {
		countCart += 1;
	}
%>
<span style="font-size: 16px;color:#FFFFFF;" class="glyphicon glyphicon-shopping-cart"></span>
<span
	style="font-size: 9px; padding: 5px; background: orange;color:#FFFFFF; border-radius: 10px;margin-bottom: 10px;"><%=countCart%></span>
