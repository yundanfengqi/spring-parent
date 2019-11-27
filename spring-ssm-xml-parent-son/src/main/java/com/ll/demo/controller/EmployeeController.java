package com.ll.demo.controller;

import com.github.pagehelper.PageInfo;
import com.ll.demo.entity.EmployeeEntity;
import com.ll.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-21 19:18
 **/
@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum",required = false,defaultValue = "2")int pageNum,
                       @RequestParam(value = "pageSize",required = false,defaultValue = "4")int pageSize,
                       Model model){
        List<EmployeeEntity> employeeEntities = employeeService.getPageHelper(pageNum,pageSize);

        PageInfo pageInfo = new PageInfo(employeeEntities);
        model.addAttribute("list",pageInfo);
        return "employee/list";
    }

    @GetMapping("/add")
    public String add(){
        return "/employee/add";
    }

    @PostMapping("/insert")
    public String insert(@Valid EmployeeEntity employeeEntity, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "/employee/add";
        }
        employeeService.add(employeeEntity);
        return "redirect:/emp/list";
    }
}
