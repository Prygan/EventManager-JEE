package fr.lidadi.jee.eventmanager;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.lidadi.jee.eventmanager.framework.HttpErrorResponse;

/**
 * Created by damien on 08/10/2016.
 */
public class EventServlet implements HttpErrorResponse {

    public void fetchAll(HttpServlet servlet, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ok(resp, "fetchAll");
    }

    public void welcome(HttpServlet servlet, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        okJsp(servlet, req, resp, "/welcome.jsp");
    }


    public void fetch(HttpServlet servlet, HttpServletRequest req, HttpServletResponse resp, UUID id) throws ServletException, IOException {
        ok(resp, "fetch(" + id + ")");
    }
    
    public void login(HttpServlet servlet, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	okJsp(servlet, req, resp, "/login.jsp");
    }

    public void signup(HttpServlet servlet, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	okJsp(servlet, req, resp, "/signup.jsp");
    }

    public void help(HttpServlet servlet, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	okJsp(servlet, req, resp, "/help.jsp");
    }
}
