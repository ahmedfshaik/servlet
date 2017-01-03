package edu.home.app7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UrlServlet3 extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        
        HttpSession session = req.getSession();
        
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<br>");
        writer.println("User Name:"+session.getAttribute("uname"));
        writer.println("<br>");
        writer.println("User Age:"+session.getAttribute("uage"));
        writer.println("<br>");
        writer.println("User Qualification:"+session.getAttribute("uqual"));
        writer.println("<br>");
        writer.println("User Designation:"+session.getAttribute("udes"));
        writer.println("<br>");
        writer.println("User Email:"+email);
        writer.println("<br>");
        writer.println("User Mobile:"+mobile);
       
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

}
