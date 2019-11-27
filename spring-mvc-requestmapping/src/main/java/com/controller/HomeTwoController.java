package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-11 10:52
 **/

@Controller
public class HomeTwoController{
    @RequestMapping(value ="/index",method = RequestMethod.GET)
    public String Index(){
        return "index";
    }

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String IndexOne(){
        return "index";
    }

    @RequestMapping(value = "/index",method = RequestMethod.POST,
                    params = "a=5",headers = "b=3",
                    produces = "application/json",
                    consumes = "text/html")
    public String IndexTwo(){
        //response.setContentType("application/json")
        return "index";
    }
}
