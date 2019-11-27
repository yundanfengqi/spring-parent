package com.controller;

import com.entity.EmployeeEntity;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-25 11:00
 **/
@Controller
public class HomeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<EmployeeEntity> list(
        @RequestParam(value = "pageNum",defaultValue = "1",required = false)int pageNum,

        @RequestParam(value = "pageSize",defaultValue = "3",required = false) int pageSize) {
        return employeeService.getAll(pageNum, pageSize);
    }
}
