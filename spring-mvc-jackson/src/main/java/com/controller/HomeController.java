package com.controller;

import com.entity.EmployeeVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-18 19:13
 * ResponseBody 注解的含义:
 * 1.就是把方法的返回类型交给一个特殊的特性去处理(HttpMessageConverter)
 * 2.处理的结果直接放到 http 响应体里面
 **/
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public EmployeeVO list() throws ParseException {
        EmployeeVO employeeVO = new EmployeeVO(1,1,"程序猿",new Date());
        return employeeVO;
    }

    /**
     * 不加 RequestBody表示使用传统的数据绑定来绑定参数值，
     * 对应jsp中的 insert2 按钮的案例
     * @param employeeVO
     * @return
     */
    @RequestMapping("/insert2")
    @ResponseBody
    public EmployeeVO insert2(EmployeeVO employeeVO){
        System.out.println("employeeVO = " + employeeVO);
        EmployeeVO result = new EmployeeVO(3,0,"bug",new Date());
        return result;
    }

    /**
     * RequestBody注解，就是把请求传递过来的请求体中的数据利用消息转换器，转换为被它修饰的参数的类型
     * @param employeeVO
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public EmployeeVO insert(@RequestBody EmployeeVO employeeVO){
        System.out.println("employeeVO = " + employeeVO);
        EmployeeVO result = new EmployeeVO(4,0,"STUBD",new Date());
        return result;
    }
}
