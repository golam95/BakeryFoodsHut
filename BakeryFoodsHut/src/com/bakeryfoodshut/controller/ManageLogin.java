package com.bakeryfoodshut.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bakeryfoodshut.serviceImpl.LoginServiceImpl;

@WebServlet("/ManageLogin")
public class ManageLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginServiceImpl loginservice = new LoginServiceImpl();

	public ManageLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain");
		String url = "";
		String error = "";
		String loginEmail = request.getParameter("username");
		String loginpassword = request.getParameter("userpassword");

		if (loginEmail.equals("") || loginpassword.equals("")) {

			error += "Field must not be empty!!";

		} else {

			HttpSession session = request.getSession();
			session.setAttribute("username", loginEmail);
			Cookie loginCookie = new Cookie("username", loginEmail);
			loginCookie.setMaxAge(60 * 60);
			response.addCookie(loginCookie);

			if (loginservice.loginAdmin(loginEmail, loginpassword, "admin")) {

				response.sendRedirect("./admin/admindashboard.jsp");

			} else if (loginservice.loginCustomer(loginEmail, loginpassword, "unblock")) {

				response.sendRedirect("home.jsp");

			} else if (loginservice.loginHomemade(loginEmail, loginpassword, "h_unblock")) {

				response.sendRedirect("./shopkeeperfree/freepackagedashboard.jsp");

			} else if (loginservice.loginBakery(loginEmail, loginpassword, "b_unblock")) {

				response.sendRedirect("./shopkeeperfree/freepackagedashboard.jsp");

			} else if (loginservice.loginPaidpackage(loginEmail, loginpassword, "p_unblock")) {

				response.sendRedirect("./shopkeeperpaid/paidpackageDashboard.jsp");

			} else {
				error += "Sorry,Invalid Username or password!!";
			}

		}
		if (error.length() > 0) {
			url = "/login.jsp";
			request.setAttribute("error", error);
			RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
			rd.forward(request, response);
		}
	}

}
