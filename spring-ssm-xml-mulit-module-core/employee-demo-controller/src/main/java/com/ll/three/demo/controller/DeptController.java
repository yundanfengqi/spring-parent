package com.ll.three.demo.controller;

import com.ll.three.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-22 07:32
 **/

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public String list() {

        return "/dept/list";
    }
    @RequestMapping("/delete")
    public String delete(int deptid) {
        deptService.deleteById(deptid);
        return "redirect:/dept/list";
    }
}
