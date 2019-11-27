package com.custom;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-08 10:37
 **/

@MvcController
public class MyController {
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/jsp/custom.jsp");
        modelAndView.addObject("msg","custom");
        return modelAndView;
    }
}
