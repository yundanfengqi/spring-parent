package com.ll.demo.service.impl;

import com.ll.demo.entity.EmployeeEntity;
import com.ll.demo.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app-spring.xml")
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void getPageHelper(){
        List<EmployeeEntity> employeeEntities = employeeService.getPageHelper(1,4);
        for (EmployeeEntity employeeEntity : employeeEntities) {
            System.out.println("employeeEntity = " + employeeEntity);
        }
    }

}