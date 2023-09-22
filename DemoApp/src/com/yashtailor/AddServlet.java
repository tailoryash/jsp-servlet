package com.yashtailor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

		int k = num1 + num2;

		/*
		 * System.out.print("result is : " + k);
		 * 
		 * PrintWriter out = res.getWriter();
		 * 
		 * out.println("result is : " + k);
		 */

//		List<Integer> arr = new ArrayList();
//		arr.

//		req.setAttribute("sum", k);
//		res.sendRedirect("sq?k=" + k);r̥

//		HttpSession session = req.getSession();
//		session.setAttribute("sum", k);

		Cookie cookie = new Cookie("sum", k + "");
		res.addCookie(cookie);

		res.sendRedirect("sq");
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("sq");
//		requestDispatcher.forward(req, res);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

		int k = num1 + num2;

		System.out.print("result is : " + k);

		PrintWriter out = res.getWriter();

		out.println("result is : " + k);
	}

}
