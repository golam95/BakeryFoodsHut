package com.bakeryfoodshut.pagecontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ManageUserpage")
public class ManageUserpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManageUserpage() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String action = request.getParameter("action");

			if (action == null) {

				action = "HOMEUSER";
			}
			switch (action) {

			case "CONTACT_USER":
				response.sendRedirect("./contact.jsp");
				break;
			case "USER_LOGIN":
				response.sendRedirect("./login.jsp");
				break;
			case "USER_REG":
				response.sendRedirect("./registration.jsp");
				break;
			case "USER_CANCEL":
				response.sendRedirect("./home.jsp");
				break;
			case "USER_FORGOTPASS":
				response.sendRedirect("./forgotpassword.jsp");
				break;
			case "USER_HOMEMADE":
				response.sendRedirect("./homemade.jsp");
				break;
			case "USER_BAKERYMADE":
				response.sendRedirect("./bakerymade.jsp");
				break;
			case "USER_PAIDPACKAGE":
				response.sendRedirect("./paidpackage.jsp");
				break;
			case "ALL_POSTS":
				response.sendRedirect("./fooditempost.jsp");
				break;
			case "USER_LOCATION":
				response.sendRedirect("./userlocationBakery.jsp");
				break;
			case "RANKING_BAKERY":
				response.sendRedirect("./bakeryRanks.jsp");
				break;
			case "USER_SERVICE":
				response.sendRedirect("./service.jsp");
				break;
			case "USER_CART":
				response.sendRedirect("./cart.jsp");
				break;
			case "USER_PROFILE":
				response.sendRedirect("./profile.jsp");
				break;
			case "USER_STATUS":
				response.sendRedirect("./status.jsp");
				break;
			case "PROFILE_SETTINGS":
				response.sendRedirect("./userprofilesettings.jsp");
				break;
			case "Offlinepayment":
				response.sendRedirect("./checkout.jsp");
				break;
			case "MYORDERLIST":
				response.sendRedirect("./myorderList.jsp");
				break;
			case "OUR_MISSION":
				response.sendRedirect("./mission.jsp");
				break;
				
				
				
				
				
			default:
				response.sendRedirect("./home.jsp");
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
