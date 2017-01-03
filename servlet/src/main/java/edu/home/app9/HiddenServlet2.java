package edu.home.app9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HiddenServlet2 extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sname = req.getParameter("sname");
        String sid = req.getParameter("sid");
        String saddress = req.getParameter("saddress");
        String sage = req.getParameter("sage");
     
        
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body bgcolor='lightyellow'>");
        writer.println("<form method='get' action='./hiddenservlet3'>");
        writer.println("<br><br><br>");
        writer.println("Student Details are..");
        writer.println("<br><br>");
        writer.println("Student Name:"+sname);
        writer.println("<br><br>");
        writer.println("Student Id:"+sid);
        writer.println("<br><br>");
        writer.println("Student Address:"+saddress);
        writer.println("<br><br>");
        writer.println("<a href='/servlet/hiddenservlet3?sage="+sage+"'>Show Student Age</a>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

}
