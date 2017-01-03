package edu.home.app8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie cookie1 = new Cookie("uname", req.getParameter("uname"));
		Cookie cookie2 = new Cookie("uage", req.getParameter("uage"));
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		RequestDispatcher dispatcher = req.getRequestDispatcher("cookieform2.html");
		dispatcher.forward(req, resp);

	}

}
