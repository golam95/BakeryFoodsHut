package com.bakeryfoodshut.pagecontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ManageAdminpage")
public class ManageAdminpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManageAdminpage() {
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

			case "ADMINDASHBOARD":
				response.sendRedirect("./admin/admindashboard.jsp");
				break;
				
			case "VIEWUHOMEDETAILS":
				response.sendRedirect("./admin/adminViewhomemadedetails.jsp");
				break;
				

			case "VIEWUSERDETAILS":
				response.sendRedirect("./admin/adminViewuserdetails.jsp");
				break;
			case "VIEWUSTATISTICES":
				response.sendRedirect("./admin/adminViewstatistices.jsp");
				break;
				
				
				

			case "Help":
				response.sendRedirect("./admin/admindashboard.jsp");
				break;
			default:
				response.sendRedirect("./admin/admindashboard.jsp");
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
