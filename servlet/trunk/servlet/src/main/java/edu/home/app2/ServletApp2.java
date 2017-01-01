package edu.home.app2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletApp2
        extends GenericServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest arg0, ServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body bgcolor='yellow'>");
        printWriter.println("<marquee><h1>Welcome To Servlet Technologies...</h1></marquee>");
        printWriter.println("</body>");
        printWriter.println("</html>");
        printWriter.close();
    }

}
