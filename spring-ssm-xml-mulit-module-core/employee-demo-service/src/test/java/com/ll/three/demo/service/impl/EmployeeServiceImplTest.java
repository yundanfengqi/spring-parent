package com.ll.three.demo.service.impl;

import com.ll.three.demo.entity.Employee;
import com.ll.three.demo.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:service-spring.xml")
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void getAll() {
        List<Employee> employees = employeeService.getAll(2,4);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}