package edu.home.app6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2 extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession session = req.getSession();
        session.setAttribute("uqual",  req.getParameter("uqual"));
        session.setAttribute("udes", req.getParameter("udes"));
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("sessionform3.html");
        dispatcher.forward(req, resp);
    
    }

}
