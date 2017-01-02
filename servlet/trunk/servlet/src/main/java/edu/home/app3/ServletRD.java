package edu.home.app3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRD
        extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String unserName = req.getParameter("uname");
        String password = req.getParameter("password");

        if (unserName.equalsIgnoreCase("ahmed") && password.equals("123")) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("success");
            dispatcher.forward(req, resp);

        }
        else {
            resp.setContentType("text/html");
            PrintWriter writer = resp.getWriter();
            writer.print("oops! Sorry username or password error!try again!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
            dispatcher.include(req, resp);
        }

    }

}
