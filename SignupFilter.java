package com.thegringottsbank.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.thegringottsbank.beans.Customer;

/**
 * Servlet Filter implementation class SignupFilter
 */
@WebFilter("/SignupFilter")
public class SignupFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SignupFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
			
			if(request.getParameter("customername").equals("")||request.getParameter("customerid").equals("")||request.getParameter("accountnumber").equals("")||request.getParameter("mobilenumber").equals("")||request.getParameter("password").equals(""))
				{
						pw.println("all fields are mandatory");
						RequestDispatcher rd=request.getRequestDispatcher("/index.html");
						rd.include(request,response);
				}		
			
			else
			{
				Customer customer=new Customer(request.getParameter("customername"),Integer.parseInt(request.getParameter("customerid")),Integer.parseInt(request.getParameter("accountnumber")),request.getParameter("mobilenumber"),request.getParameter("password"));
			request.setAttribute("customer", customer);
				chain.doFilter(request,response);
			}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
