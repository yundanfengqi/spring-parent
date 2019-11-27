package com.controller.view;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-14 11:42
 * mvc概念：view对象永远不能直接访问，只能直接访问控制器
 * 由控制器去访问 view(而且安装 servlet技术，基本就是转发到视图)
 *
 * 处理请求方法之间的访问：基本应该都是重定向
 **/

public class ViewDemoController {
    /**
     * 通过 转发的方法 到视图(jsp) 有三种方法
     * demo1方法:demo1是直接返回字符串，代表视图名
     */
    @RequestMapping("/demo1")
    public String demo1(){
        return "view";
    }

    /**
     * demo2方法 本质与 demo1方法是一样的，都是转发
     *demo2方法：直接返回字符串，加前缀 forward， 比如方法中返回的 "forward:view"
     * @return
     */
    @RequestMapping("/demo2")
    public String demo2(HttpServletRequest request){
        request.setAttribute("demo2","直接返回字符串，加前缀 forward");
        return "forward:view";
    }

    /**
     * demo3方法:返回 ModelAndView,直接设置视图名即可
     * @return
     */
    @RequestMapping("/demo3")
    public ModelAndView demo3(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view");
        /**
         * 如果设置成下面的这种方式会不会报错？
         * modelAndView.setViewName("forward:view");
         */
        return modelAndView;
    }

    /**
     * 通过重定向(redirect)的方法 : 指的是多个请求方法之间的跳转
     *demo4方法:返回字符串，加前缀 redirect，比如'redirect:其它请求方法的地址
     */
    @RequestMapping("/demo4")
    public String demo4(HttpServletRequest request){
        request.setAttribute("demo4","返回字符串，加前缀 redirect，比如'redirect:其它请求方法的地址' ");
        return "redirect:display";
    }

    /**
     * demo5方法：返回RedirectView类型，直接设置其它请求方法的地址，不需要加前缀
     * @return
     */
    @RequestMapping("/demo5")
    public RedirectView demo5(){
        RedirectView redirectView = new RedirectView("display");
        return redirectView;
    }

    /**
     * 原始方法
     * @return
     */
    @RequestMapping("/display")
    public String demo6(){
        return "view";
    }
}
