package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-20 09:05
 **/
@Controller
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(" pre     Handle----------------");
        //在拦截点执行前拦截，如果返回 true 则不执行拦截点后的操作(拦截成功)，
        //返回 false 则不执行拦截

        HttpSession session = request.getSession();

        if (session.getAttribute("name") =="admin"&& session.getAttribute("pwd")== "1234567" ){
            System.out.println("登录成功");
            return true;
        }else {
            //拦截后进入登录页面
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(" post  Handle (在处理过程中，执行拦截)--------------------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(" after Completion   (执行完毕，返回拦截器)--------------------------");
    }
}
