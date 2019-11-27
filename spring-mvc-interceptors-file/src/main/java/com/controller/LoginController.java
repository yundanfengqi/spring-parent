package com.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-20 20:15
 **/
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.getAttribute(username);
        session.getAttribute(password);
        if ("admin".equalsIgnoreCase(username) && "1234567".equalsIgnoreCase(password)){
            return "index";
        }else {
            return "login";
        }
    }
}
