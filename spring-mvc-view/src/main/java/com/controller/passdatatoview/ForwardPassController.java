package com.controller.passdatatoview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-14 11:40
 * 传递数据到视图 方法又3种：
 * 1.利用 servlet 的 api，比如请求作用域，会话作用域，应用程序作用域都可以
 * 2.利用 ModelAndView
 * 利用 Model，ModelMap，Map<String,Object>类型作为参数
 **/
@Controller
@RequestMapping("/forward")

public class ForwardPassController {
    @GetMapping("/demo1")
    public String demo(HttpServletRequest request){
        request.setAttribute("demo1","/forward/demo1");
        return "view";
    }


    @GetMapping("/demo2")
    public ModelAndView demo2(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("demo2","/forward/demo2");
        mav.setViewName("view");
        return mav;
    }

    @GetMapping("/demo3")
    public String demo3(Model model){
        //Model接口的实现类 BindingAwareModelMap
        model.addAttribute("demo3","/forward/demo3");
        return "view";
    }

    /**
     * 在控制器方法中，写下面三种类型，效果是一样的
     * 最后一个Map的写法，必须要去键是String类型，
     */
    @GetMapping("/demo4")
    public String demo4(Model model, ModelMap modelMap, Map<String,Object>map){
        //Model接口的实现类 BindingAwareModelMap
        model.addAttribute("demo4","/forward/demo4");
        return "view";
    }
}
