package edu.home.app5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements javax.servlet.Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		int age = Integer.parseInt(request.getParameter("uage"));

		if (age > 20) {
			chain.doFilter(request, response);
		} else {
			PrintWriter writer = response.getWriter();
			writer.println("Your not eligible for marriage, your age is below 20 years");
			request.getRequestDispatcher("Form.html").include(request, response);
		}
	}

	@Override
	public void destroy() {

	}

}
