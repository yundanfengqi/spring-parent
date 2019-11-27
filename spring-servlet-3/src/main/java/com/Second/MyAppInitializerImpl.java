package com.Second;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-22 11:31
 **/

public class MyAppInitializerImpl implements MyAppInitializer {
    @Override
    public void dangQiDongShi(ServletContext servletContext) {
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("second",new SecondServlet());
        servletRegistration.addMapping("/second");
    }
}
