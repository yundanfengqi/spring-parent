package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-11 10:42
 **/
@Controller
@RequestMapping("/employee")
public class HomeOneController {
    @RequestMapping("/list")
    public String index(){
        return "index";
    }
}
