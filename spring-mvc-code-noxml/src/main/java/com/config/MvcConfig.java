package com.config;

import com.controller.MyFirstInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-22 15:25
 * @EnableWebMvc: 这个注解，相当于 xml 配置文件中的 mvc：annotation-driven(Mvc注解驱动)
 **/

@Configuration
@ComponentScan("com.controller")
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver resourceViewResolver(){
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/views/");
        resourceViewResolver.setSuffix(".jsp");
        return resourceViewResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MyFirstInterceptor firstInterceptor = new MyFirstInterceptor();
        InterceptorRegistration registration = registry.addInterceptor(firstInterceptor);
        registration.addPathPatterns("/**");
    }
}
