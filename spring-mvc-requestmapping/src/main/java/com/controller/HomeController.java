package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-11 11:06
 **/
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String Index(){return "index";}

    @RequestMapping("/**/*index")
    public String IndexOne(){
        return "index";
    }

    @RequestMapping("*")
    public String IndexTwo(){return "index";}

    @RequestMapping(value = {"/index","index3"})
    public String IndexThree(){return "index";}
}
