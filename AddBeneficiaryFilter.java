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

import com.thegringottsbank.beans.Beneficiary;
import com.thegringottsbank.beans.Customer;

/**
 * Servlet Filter implementation class AddBeneficiaryFilter
 */
@WebFilter("/AddBeneficiaryFilter")
public class AddBeneficiaryFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AddBeneficiaryFilter() {
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
			
			if(request.getParameter("beneficiaryacountnumber").equals("")||request.getParameter("beneficiaryaccounttype").equals("")||request.getParameter("beneficiaryifsccode").equals("")||request.getParameter("beneficiaryname").equals("")||request.getParameter("beneficiaryemailid").equals(""))
				{
						pw.println("all fields are mandatory");
						RequestDispatcher rd=request.getRequestDispatcher("/index.html");
						rd.include(request,response);
				}		
			
			else
			{
				Beneficiary beneficiary=new Beneficiary(Integer.parseInt(request.getParameter("beneficiaryacountnumber")),request.getParameter("beneficiaryaccounttype"),request.getParameter("beneficiaryname"),request.getParameter("beneficiaryemailid"),request.getParameter("beneficiaryifsccode"));
			request.setAttribute("beneficiary", beneficiary);
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
