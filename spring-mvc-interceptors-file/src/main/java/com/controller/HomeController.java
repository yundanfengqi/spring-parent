package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-20 20:15
 **/
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
