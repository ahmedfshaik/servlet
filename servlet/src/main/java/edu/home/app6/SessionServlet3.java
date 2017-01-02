package edu.home.app6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet3 extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession session = req.getSession();
        
        resp.setContentType("text/html");
        
        PrintWriter writer = resp.getWriter();
        writer.println("*******Complete Details******");
        writer.println("<br>");
        writer.println("User Name:"+session.getAttribute("uname"));
        writer.println("<br>");
        writer.println("User Age:"+session.getAttribute("uage"));
        writer.println("<br>");
        writer.println("User Qualificaton:"+session.getAttribute("uqual"));
        writer.println("<br>");
        writer.println("User Designation:"+session.getAttribute("udes"));
        writer.println("<br>");
        writer.println("User Mobile:"+req.getParameter("email"));
        writer.println("<br>");
        writer.println("User Email:"+req.getParameter("mobile"));
        writer.println("<br>");
        writer.close();
    
    }

}
