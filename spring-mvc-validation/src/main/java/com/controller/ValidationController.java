package com.controller;

import com.entity.EmployeeEntity;
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
 * @create: 2019-11-13 11:08
 **/
@Controller
public class ValidationController {
    @RequestMapping("/insert")
    public ModelAndView insert(@Valid EmployeeEntity employeeEntity, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();

        if (bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
//                modelAndView.addObject(error.getField(),error.getDefaultMessage());
                System.out.println(error.getObjectName() + ":" + error.getDefaultMessage());
            }
            modelAndView.setViewName("error");

        }else {
            modelAndView.setViewName("ok");
        }
        System.out.println("--------- employeeEntity" + employeeEntity);
        return modelAndView;
    }
}
