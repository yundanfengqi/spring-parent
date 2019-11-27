package com.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-20 20:14
 **/

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("---- preHandle是在控制器方法之前运行 -----");

        HttpSession session = request.getSession();
        String username =(String) session.getAttribute("username");
        String password =(String) session.getAttribute("password");
        if (username!="admin" && password!="1234567"){
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
            //response.sendRedirect("/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("---- post Handler(在处理过程中，执行拦截) ---");
        //postHandle 是在控制器方法执行完成之后，但是在视图处理之前运行
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(" after Complrtion(执行完毕，返回拦截器)");
        //这个方法是在视图已经处理完毕之后再执行
    }
}
