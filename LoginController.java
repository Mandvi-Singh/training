package com.zensar.bankingsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.bankingsystem.beans.Login;
import com.zensar.bankingsystem.exception.ServiceNotFoundException;
import com.zensar.bankingsystem.services.ServicesInterface;

import com.zensar.bankingsystem.servicesproviders.BankServicesProvider;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ServicesInterface ServicesImpl = BankServicesProvider.getServiceProvider();
			PrintWriter out = response.getWriter();
			Login user = (Login) request.getAttribute("login");
			if (ServicesImpl.login(user)) {
				getServletContext().getRequestDispatcher("/userhome.html").forward(request, response);

			} else {
				getServletContext().getRequestDispatcher("/login.html").include(request, response);
				out.println("Invalid username and Password...!");
			}
		} catch (ServiceNotFoundException e) {
			System.out.println(e);
		}

	}

}
