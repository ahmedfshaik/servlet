package edu.home.app1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLifeCycle
        implements Servlet {

    public void destroy() {
        System.out.println("Hi This is destroy()");
    }

    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    public void init(ServletConfig arg0) throws ServletException {
        System.out.println("Hi This is init()....");

    }

    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
        System.out.println("Hi This is service()");

    }

}
