package com.custom;

import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-08 10:38
 **/

public class MyRequestMapping implements HandlerMapping {
    private Map<String,Class<?>> handlers;

    public void setHandlers(Map<String, Class<?>> handlers) {
        this.handlers = handlers;
    }

    @Override
    public HandlerExecutionChain getHandler(HttpServletRequest httpServletRequest) throws Exception {
        Class<?> handlerClass = handlers.get(httpServletRequest.getRequestURI());
        Object handler = handlerClass.newInstance();

        HandlerExecutionChain chain = new HandlerExecutionChain(handler);
        return chain;
    }
}
