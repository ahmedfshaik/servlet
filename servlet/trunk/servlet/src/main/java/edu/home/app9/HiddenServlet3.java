package edu.home.app9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenServlet3 extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body bgcolor='lightpink'>");
        writer.println("<br>");
        writer.println("<br>");
        writer.println("<br>");
        writer.println("Student Age is "+req.getParameter("sage"));
        writer.println("<br>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

}
