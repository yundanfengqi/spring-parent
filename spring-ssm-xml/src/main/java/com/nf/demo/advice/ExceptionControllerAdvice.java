package com.nf.demo.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-21 11:14
 **/
@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntime(){
        return "error";
    }
}
