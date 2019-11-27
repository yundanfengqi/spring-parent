package com.ll.three.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-22 07:32
 **/

@Controller
public class ErrorController {
    @RequestMapping("/error")
    public String error(){
        return "404";
    }
}
