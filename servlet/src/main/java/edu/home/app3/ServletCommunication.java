package edu.home.app3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCommunication
        extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Float basic = Float.parseFloat(req.getParameter("basic"));
        Float gross = basic + (0.8f * basic);
        req.setAttribute("gross", gross);
        RequestDispatcher dispatcher = req.getRequestDispatcher("./net");
        dispatcher.forward(req, resp);
    }

}
