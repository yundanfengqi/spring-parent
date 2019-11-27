package com.controller;

import com.entity.Employee;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-12 12:02
 **/
@Controller
@RequestMapping("/formatter")
public class FormatterController {
    @GetMapping("/data")
    public String receiveDate(@DateTimeFormat(pattern = "yyyy-MM-dd")Date date){
        System.out.println("date = " + date);
        return "index";
    }
    /**
     *  formatter/employee?xxx-liao,long
     *  通过指定RequestPram就明确表明把请求参数中 xxx 的值转换为 一个 Employee
     *  这是必须要指定的
     */
    @GetMapping("/employee")
    public String receiveEmployee(@RequestParam("xxx")Employee employee){
        System.out.println("employee = " + employee);
        return "index";
    }
}
