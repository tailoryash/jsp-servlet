package com.yashtailor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("userName");
		String password = req.getParameter("pwd");

		if (username.equals("yash") && password.equals("123")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			resp.sendRedirect("welcome.jsp");
		} else {
			resp.sendRedirect("login.jsp");
		}
	}

}
