package edu.home.app5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFilter extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String userName = req.getParameter("uname");
		String userAge =  req.getParameter("uage");
		String userAddress = req.getParameter("uaddress");
		
		PrintWriter writer = resp.getWriter();
		writer.println("****Your Registration is Success****");
		writer.println("<br>");
		writer.println("UserName:"+userName);
		writer.println("<br>");
		writer.println("UserAge:"+userAge);
		writer.println("<br>");
		writer.println("UserAddress:"+userAddress);
		writer.println("<br>");
		writer.println("User Registration Id is 12345");
		writer.close();
		
	}

}
