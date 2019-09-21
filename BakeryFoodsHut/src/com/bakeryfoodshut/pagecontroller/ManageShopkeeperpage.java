package com.bakeryfoodshut.pagecontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ManageShopkeeperpage")
public class ManageShopkeeperpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManageShopkeeperpage() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String action = request.getParameter("action");

			if (action == null) {
				action = "DASHBOARD";
			}
			switch (action) {

			case "DASHBOARD":
				response.sendRedirect("./shopkeeperfree/freepackagedashboard.jsp");
				break;
			case "VIEWPOST":
				response.sendRedirect("./shopkeeperfree/freepackageViewpost.jsp");
				break;
			case "VIEWMESSAGE":
				response.sendRedirect("./shopkeeperfree/freepackageViewmessage.jsp");
				break;
			case "ADDPOST":
				response.sendRedirect("./shopkeeperfree/freepackageAddpost.jsp");
				break;
			case "UPDATEPROFILEINFO":
				response.sendRedirect("./shopkeeperfree/updateprofileInfo.jsp");
				break;
			case "CANCELSHOPKEEPER":
				response.sendRedirect("./shopkeeperfree/freepackagedashboard.jsp");
				break;
			case "Help":
				response.sendRedirect("./admin/admindashboard.jsp");
				break;
			case "FREE_POFILE":
				response.sendRedirect("./shopkeeperfree/profileupdate.jsp");
				break;
			case "FREE_QUANTITYSETTING":
				response.sendRedirect("./shopkeeperfree/freepackageaddQuantity.jsp");
				break;
			case "FREE_PROFILESETTING":
				response.sendRedirect("./shopkeeperfree/freepackageProfilesettings.jsp");
				break;
			case "FREE_VIEWQUANTITY":
				response.sendRedirect("./shopkeeperfree/freepackageViewquantity.jsp");
				break;
			case "FREE_HELP":
				response.sendRedirect("./shopkeeperfree/freepackageHelp.jsp");
				break;
			case "FREE_SENDMESSAGETOBFH":
				response.sendRedirect("./shopkeeperfree/freepackageChat.jsp");
				break;
			default:
				response.sendRedirect("./shopkeeperfree/freepackagedashboard.jsp");
				break;
			}
		} catch (Exception exc) {
			throw new ServletException(exc);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
