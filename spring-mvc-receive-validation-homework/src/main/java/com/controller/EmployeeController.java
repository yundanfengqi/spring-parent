package com.controller;

import com.entity.EmployeeEntity;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-13 15:07
 **/
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping("/insert")
    public String index(){
        return "index";
    }

    @RequestMapping("/insertCheck")
    public ModelAndView insert(@Valid EmployeeEntity employeeEntity, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();

        if (bindingResult.hasErrors()){
           // List<FieldError> errors = bindingResult.getFieldErrors();
            List<FieldError> errors1 = bindingResult.getFieldErrors();
            modelAndView.addObject("errors",errors1);
            modelAndView.setViewName("index");
        }else {
            service.insert(employeeEntity);
            modelAndView.setViewName("insert");
            System.out.println("-------employeeEntity = " + employeeEntity);
        }
        return modelAndView;
    }
}
