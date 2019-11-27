package com.ll.demo.service.impl;

import com.ll.demo.dao.EmployeeDao;
import com.ll.demo.entity.EmployeeEntity;
import com.ll.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-21 19:18
 **/

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<EmployeeEntity> getPageHelper(int pageNum, int pageSize) {
        return employeeDao.getPageHelper(pageNum,pageSize);
    }

    @Override
    public void add(EmployeeEntity employeeEntity) {
        employeeDao.add(employeeEntity);
    }
}
