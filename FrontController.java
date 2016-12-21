package com.zensar.bankingsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("Id").equals("1")) {
			getServletContext().getRequestDispatcher("/LoginController").forward(request, response);
		}
		if (request.getParameter("Id").equals("2")) {
			getServletContext().getRequestDispatcher("/SingupController").forward(request, response);
		}
		if (request.getParameter("Id").equals("3")) {
			getServletContext().getRequestDispatcher("/AddBeneficiaryController").forward(request, response);
		}
		if (request.getParameter("Id").equals("4")) {
			getServletContext().getRequestDispatcher("/FixedDepositController").forward(request, response);
		}
	}

}
