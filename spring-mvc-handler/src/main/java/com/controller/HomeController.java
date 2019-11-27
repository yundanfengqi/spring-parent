package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-20 09:05
 **/
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping("/login")
    public String Login(HttpServletRequest request){
        String username="admin";
        String password="1234567";
        HttpSession session = request.getSession();
        session.setAttribute("name",username);
        session.setAttribute("pwd",password);


        return "index";
    }
}
