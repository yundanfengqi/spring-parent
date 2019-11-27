package com.service;

import com.entity.Employee;
import org.springframework.stereotype.Service;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-11 19:44
 **/
public interface EmployeeService {
    void add(Employee employee);
    void tx(Employee employee);
}
