package com.controller;

import com.formatter.EmployeeFormatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-12 12:02
 *
 * 日期注解参数;
 **/
@ControllerAdvice
public class MyControllerAdvice {
    @InitBinder
    public void abc(WebDataBinder dataBinder){
        dataBinder.addCustomFormatter(new EmployeeFormatter());

        dataBinder.addCustomFormatter(new DateFormatter());
    }
}
