package edu.home.app3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletNetSalary extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Float gross = (Float)req.getAttribute("gross");
        Float net   = gross - (0.8f*gross);
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body bgcolor='yellow'>");
        printWriter.println("<h1> Take Home Salary is Rs:"+net+"</h1>");
        printWriter.println("<body>");
        printWriter.println("</html>");
        printWriter.close();
    }

}
