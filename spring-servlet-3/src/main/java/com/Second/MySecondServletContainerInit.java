package com.Second;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-22 11:48
 **/
@HandlesTypes(MyAppInitializer.class)
public class MySecondServletContainerInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> classes, ServletContext servletContext) throws ServletException {
        for (Class<?> clz:classes){
            //判断传递过来的类型是否是 MyAppInitializer 的实现类
            //因为 HandlesTypes 可以填多个类型

            if (MyAppInitializer.class.isAssignableFrom(clz)){
                try {
                    MyAppInitializer instance = (MyAppInitializer) clz.newInstance();
                    instance.dangQiDongShi(servletContext);

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
