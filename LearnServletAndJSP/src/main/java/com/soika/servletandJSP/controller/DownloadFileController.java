package com.soika.servletandJSP.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Andrei_Soika on 1/20/2016.
 */
@WebServlet(value="/down", name="downServlet")
public class DownloadFileController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/jpeg");
        ServletContext ctx = getServletContext();
        System.out.println(ctx.getResourcePaths(""));
        InputStream is = ctx.getResourceAsStream("/yyy.jpg");
        int read = 0;
        byte[] buffer = new byte[1024];
        OutputStream os = resp.getOutputStream();
        while ((read = is.read(buffer)) != -1) {
            os.write(buffer, 0, read);
        }
        os.flush();
        os.close();
    }
}
