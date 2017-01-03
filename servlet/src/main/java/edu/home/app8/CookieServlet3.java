package edu.home.app8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet3 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();
		Cookie[] cookies = req.getCookies();
		writer.println("*******Complete Details******");
		writer.println("<br>");
		writer.println("User Name:" + cookies[0].getValue());
		writer.println("<br>");
		writer.println("User Age:" + cookies[1].getValue());
		writer.println("<br>");
		writer.println("User Qualificaton:" + cookies[2].getValue());
		writer.println("<br>");
		writer.println("User Designation:" + cookies[3].getValue());
		writer.println("<br>");
		writer.println("User Mobile:" + req.getParameter("email"));
		writer.println("<br>");
		writer.println("User Email:" + req.getParameter("mobile"));
		writer.println("<br>");
		writer.close();

	}

}
