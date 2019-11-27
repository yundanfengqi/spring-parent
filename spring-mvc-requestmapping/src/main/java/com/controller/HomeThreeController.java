package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-11 11:00
 **/
@Controller
@RequestMapping("/employee")
public class HomeThreeController {
    @GetMapping("/get")
    public String Index(){return "index";}

    @PostMapping("/post")
    public String IndexOne(){return "index";}

    @DeleteMapping("/delete")
    public String IndexTwo(){return "index";}

    @PutMapping("/put")
    public String IndexThree(){return "index";}

    @PatchMapping("/patch")
    public String IndexFore(){return "index";}
}
