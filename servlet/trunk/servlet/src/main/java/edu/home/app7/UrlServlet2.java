package edu.home.app7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UrlServlet2 extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uqual = req.getParameter("uqual");
        String udes = req.getParameter("udes");
        
        HttpSession session = req.getSession();
        session.setAttribute("uname", uqual);
        session.setAttribute("udes", udes);
        
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<form method='get' action="+resp.encodeURL("./urlservlet3")+">");
        writer.println("<br>");
        writer.println("User Email:<input type='text' name='email'");
        writer.println("<br>");
        writer.println("User Mobile:<input type='text' name='mobile'");
        writer.println("<br>");
        writer.println("<input type='submit' value='Display'/>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

}
