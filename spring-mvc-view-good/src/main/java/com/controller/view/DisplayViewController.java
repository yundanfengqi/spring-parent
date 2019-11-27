package com.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-14 19:27
 **/
@Controller
@RequestMapping("/display")
/**
 * mvc理念：view对象永远不能直接访问，只能直接访问控制器
 * 由控制器去访问view(而且按照 servlet jsp 技术，基本就是转发到视图)
 *
 * 按照这个理念，在这里只是显示视图，不要想着转发与重定向的问题，直接理解为把视图打开来响应用户请求
 */
public class DisplayViewController {
    /**
     *通过转发的方法到视图 (jsp) 有三种方法
     * demo1方法：demo1是直接返回字符串，代表视图名
     * 显示视图
     */
    @RequestMapping("/demo1")
    public String demo1(){
        return "view";
    }

    // demo方法：返回 ModelAndView，直接设置视图名即可
    @RequestMapping("/demo2")
    public ModelAndView demo2(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("view");
        return mav;
    }
}
