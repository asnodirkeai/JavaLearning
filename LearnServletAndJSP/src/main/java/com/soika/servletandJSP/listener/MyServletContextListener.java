package com.soika.servletandJSP.listener;

import com.soika.servletandJSP.bean.Dog;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Andrei_Soika on 1/25/2016.
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String breed = sce.getServletContext().getInitParameter("dog-breed");
        String nick = sce.getServletContext().getInitParameter("dog-nick");
        Dog dog = new Dog(breed, nick);
        sce.getServletContext().setAttribute("dog", dog);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
