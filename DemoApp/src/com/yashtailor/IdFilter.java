package com.yashtailor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addDetails")
public class IdFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		System.out.println("In filter");

		PrintWriter out = response.getWriter();

		HttpServletRequest req = (HttpServletRequest) request;
		int number = Integer.parseInt(req.getParameter("number"));
		String name = req.getParameter("name");

		if (number > 1 && name.length() > 3) {
			chain.doFilter(request, response);
		} else {
			out.println("Invalid input");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
