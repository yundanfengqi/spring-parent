package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-22 15:25
 **/
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
