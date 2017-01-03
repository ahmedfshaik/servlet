package edu.home.app7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UrlServlet1 extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String uage = req.getParameter("uage");
        
        HttpSession session = req.getSession();
        session.setAttribute("uname", uname);
        session.setAttribute("uage", uage);
        
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<form method='get' action="+resp.encodeURL("./urlservlet2")+">");
        writer.println("<br>");
        writer.println("User Qualification:<input type='text' name='uqual'");
        writer.println("<br>");
        writer.println("");
        writer.println("User Designation:<input type='text' name='udes'");
        writer.println("<br>");
        writer.println("<input type='submit' value='next'/>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

}
