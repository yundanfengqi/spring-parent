package com.config;

import com.interceptor.FirstInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-25 11:01
 **/
@Configuration
@EnableWebMvc
@ComponentScan({"com.controller","com.interceptor"})
public class MvcConfig implements WebMvcConfigurer {

    //视图资源解析器
   @Bean
   public InternalResourceViewResolver viewResolver(){
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       viewResolver.setSuffix(".jsp");
       viewResolver.setPrefix("/WEB-INF/views/");
       return viewResolver;
   }


   //日期转换器
    @Override
    public void addFormatters(FormatterRegistry registry) {
       registry.addFormatter(new DateFormatter("yyyy-MM-dd"));
    }


    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new FirstInterceptor());
        interceptorRegistration.addPathPatterns("/**");
    }

    //静态资源

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ResourceHandlerRegistration registration = registry.addResourceHandler("/static/**");
        registration.addResourceLocations("classpath:/static/");
    }
}
