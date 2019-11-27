package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-25 11:02
 * 当你的项目只有一个 spring 容器，那么只需要下面方法返回有值即可，
 * 如果有2个容器，那么这2个配置类的方法都需要返回配置类
 **/

public class SystemConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
