package com.yashtailor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servletcontext and servletConfig
public class ServletConfigAndContextExample extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		/*
		 * out.print("Hello Your email is : "); ServletContext ctx =
		 * getServletContext(); String email = ctx.getInitParameter("email");
		 */
//		out.println(email);

		ServletConfig cg = getServletConfig();
		String firstname = cg.getInitParameter("firstname");
		out.println(firstname);
	}

}
