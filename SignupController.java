package com.zensar.bankingsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.bankingsystem.beans.Customer;

import com.zensar.bankingsystem.exception.ServiceNotFoundException;
import com.zensar.bankingsystem.services.ServicesInterface;
import com.zensar.bankingsystem.servicesproviders.BankServicesProvider;


@WebServlet("/SignupController")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServicesInterface ServicesImpl = BankServicesProvider.getServiceProvider();
			PrintWriter out = response.getWriter();
			Customer customer = (Customer) request.getAttribute("customer");
			if (ServicesImpl.signup(customer)) {
				getServletContext().getRequestDispatcher("/login.html").forward(request, response);

			} else {
				getServletContext().getRequestDispatcher("/register.html").include(request, response);
				out.println("User Registration Failed");
			}
		} catch (ServiceNotFoundException e) {
			System.out.println(e);
		}
	}

}
