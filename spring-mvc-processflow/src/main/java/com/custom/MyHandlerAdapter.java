package com.custom;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-08 10:37
 **/

public class MyHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return handler.getClass().isAnnotationPresent(MvcController.class);
    }

    @Override
    public ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        Method method = handler.getClass().getDeclaredMethod("process",HttpServletRequest.class,HttpServletResponse.class);
       ModelAndView modelAndView = (ModelAndView) method.invoke(handler,httpServletRequest,httpServletResponse);
        return modelAndView;
    }

    @Override
    public long getLastModified(HttpServletRequest httpServletRequest, Object handler) {
        return 0;
    }
}
