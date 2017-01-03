package edu.home.app9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HiddenServlet1 extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sname = req.getParameter("sname");
        String sid = req.getParameter("sid");
        String saddress = req.getParameter("saddress");
        
        
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body bgcolor='lightyellow'>");
        writer.println("<form method='post' action='./hiddenservlet2'>");
        writer.println("<input type='hidden' name='sname' value="+sname+">");
        writer.println("<input type='hidden' name='sid' value="+sid+">");
        writer.println("<input type='hidden' name='saddress' value="+saddress+">");
        writer.println("<br><br>");
        writer.println("Student Age:<input type='text' name='sage'>");
        writer.println("<br><br>");
        writer.println("<input type='submit' value='Submit'/>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

}
