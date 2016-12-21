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

import com.thegringottsbank.beans.Login;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
     
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
			
			
			if(request.getParameter("username").equals("")||request.getParameter("password").equals(""))
				{
						pw.println("all fields are mandatory");
						RequestDispatcher rd=request.getRequestDispatcher("/index.html");
						rd.include(request,response);
				}		
			
			else
			{
				Login login=new Login(request.getParameter("username"),request.getParameter("password"));
				request.setAttribute("login", login);
			chain.doFilter(request,response);
			}

		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
