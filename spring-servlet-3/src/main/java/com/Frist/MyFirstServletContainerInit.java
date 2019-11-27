package com.Frist;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-22 11:32
 **/

public class MyFirstServletContainerInit implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("first",new FirstServlet());

        servletRegistration.addMapping("/first");
    }
}
