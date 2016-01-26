package com.soika.servletandJSP;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value="/bye", name="byeServlet")
public class ByeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        res.sendRedirect("hello");
        res.getWriter().println("<br/>Bye!!");
        RequestDispatcher rd = req.getRequestDispatcher("hello");
        rd.forward(req, res);


    }
}
