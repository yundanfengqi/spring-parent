package com.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-08 10:36
 **/

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MvcController {
}
