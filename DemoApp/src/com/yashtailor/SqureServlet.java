package com.yashtailor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqureServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();

//		int square = (int) req.getAttribute("sum");
//		int square = Integer.parseInt(req.getParameter("k"));

//		HttpSession session = req.getSession();
//		session.removeAttribute("sum");
//		int square = (int) session.getAttribute("sum");
		int square = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("sum")) {
				square = Integer.parseInt(c.getValue());
			}
		}
		square = square * square;
		out.println("Hello to sq : " + square);
		System.out.println("sq called");
	}

}
