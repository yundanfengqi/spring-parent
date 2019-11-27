package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-11 19:34
 **/
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @RequestMapping("/add")
    public String employeeAdd(Employee employee){
        System.out.println("--------add---- = " + employee);
        service.add(employee);
        return "add";
    }

    @RequestMapping("/tx")
    public String employeeTx(Employee employee){
        System.out.println("employeeTX--- = " + employee);
        service.tx(employee);
        return "tx";
    }

    @RequestMapping("/pv/{pv}")
    public String pv(String pv){
        System.out.println("pv-------- = " + pv);
        return "pv";
    }

    @RequestMapping("*")
    public String defaultServlet(){
        return "index";
    }
}
