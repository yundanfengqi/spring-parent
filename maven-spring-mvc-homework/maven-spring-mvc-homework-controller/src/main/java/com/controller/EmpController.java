package com.controller;

import com.entity.Emp;
import com.github.pagehelper.PageInfo;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-19 19:53
 * 控制器：相当于 servlet
 * @Controller :表明该类是处理器类
 **/

@Controller
public class EmpController {
    @InitBinder
    public void InitBinder(WebDataBinder webDataBinder){
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        webDataBinder.addCustomFormatter(dateFormatter);
    }

    //自动注入 emp 业务层
    @Autowired
    private EmpService empService;

    //该方法是一开始访问的方法，进入到视图界面
    @RequestMapping("/index")
    public String index(){return "index";}

    /**
     * 视图通过 ajax请求到这个方法
     * 这个方法 返回 json数据给视图
     * @ResponseBody 返回json数据
     */

    @RequestMapping("/list")
    @ResponseBody
    public PageInfo<Emp> getEmpByPage(int pageNum,int pageSize){
        List<Emp> emps = empService.getEmpByPage(pageNum,pageSize);
        PageInfo<Emp> pageInfo = new PageInfo<>(emps,3);
        return pageInfo;
    }

    @RequestMapping("/insertIndex")
    public String insertIndex(){
        return "insert";
    }

    /**
     * 添加操作，如果添加成功，则返回主界面，
     * 如果添加失败，则返回添加页面
     */

    @RequestMapping("/insert")
    public ModelAndView insert(@Valid Emp emp, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()){
            modelAndView.addObject("error",true);
            //获取异常信息
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            //遍历所有异常信息，并添加到视图
            for (FieldError fieldError : fieldErrors) {
                modelAndView.addObject(fieldError.getField()+"Error",fieldError.getDefaultMessage());
            }
            //把提交的内容返回回去
            modelAndView.addObject("emp",emp);
            modelAndView.setViewName("insert");
        }else {
            //添加数据
            empService.insert(emp);
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }




}
