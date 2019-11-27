package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-07 19:17
 **/
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String handle(){
        System.out.println(" *************index**********");

        //这里的 hello 是逻辑视图的名字，靠配置的视图解析器解析为真正的视图，比如 jsp文件
        return "WEB-INF/jsp/hello.jsp";
    }

    @RequestMapping("/index2")
    public ModelAndView handle2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("msg","mvc");
        return modelAndView;
    }
}
