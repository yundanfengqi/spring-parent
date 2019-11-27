package com.controller.passdatatoview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-14 11:41
 * 请求之间传递数据 方法有三种：
 * 1.拼接 url 的方式
 * 2.利用会话作用域，应用程序作用域
 * 3.利用 RedirectAttributes
 *   利用 addFlashAttribute方法来传递
 *   原理:把数据放到 session 中，读取之后自动删除
 *
 *   要掌握 addAttribute的作用：添加到里面的数据会自动拼接到 url参数
 **/
@Controller
@RequestMapping("/redirect")
public class RedirectPassController {
    //第一组方法：利用 session(HttpSession)和application(ServletContext)
    @GetMapping("/demo1")
    public String demo1(HttpSession session){
        session.setAttribute("demo1","/redirect/demo1");
        return "redirect:demo88";
    }

    @GetMapping("/demo88")
    public String demo88(){
        return "view";
    }

    /**
     * 利用拼接url 的方式传递数据，
     *  url致命缺点：
     *  1.长度是有限制的
     *  2.拼接字符繁琐
     */
    @GetMapping("/demo2")
    public String demo2(){
        return "redirect:demo3?f=redirect-demo2";
    }

    @GetMapping("/demo3")
    public String demo3(String demo3, Model model){
        model.addAttribute("demo3",demo3);
        return "view";
    }


    @GetMapping("/demo4")
    public String demo4(RedirectAttributes redirectAttributes){
        //因为我们是重定向到 demo5，所以 addAttribute 添加的数据自动帮我们拼接到 url 上
        redirectAttributes.addAttribute("demo","demo4 demo");
        //addFlashAttribute 是把数据自动放到 session 中，跳转到的方法 demo5 的 model参数自动有这个值
        redirectAttributes.addFlashAttribute("demo1","demo4-falsh");
        return "redirect:demo5";
    }

    @GetMapping("/demo5")
    public String demo5(String demo,Model model){
        return "view";
    }

    //因为 addFlashAttribute 是把数据放到 session 中，读取到了之后自动从 session中删除数据
    //这个方法用来演示已经读不到数据,操作步骤：/demo4 ->跳转到了 demo5,接着访问 /demo6

    @GetMapping("/demo6")
    public String demo6(){
        return "view";
    }
}
