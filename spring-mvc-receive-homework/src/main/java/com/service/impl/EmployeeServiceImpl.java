package com.service.impl;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-11 20:13
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    @Transactional
    public void tx(Employee employee) {
        employeeDao.delete();
        employeeDao.add(employee);
    }
}
