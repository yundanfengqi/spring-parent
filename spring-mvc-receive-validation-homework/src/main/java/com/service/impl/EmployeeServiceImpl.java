package com.service.impl;

import com.dao.EmployeeDaoOne;
import com.entity.EmployeeEntity;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-13 15:08
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDaoOne employeeDaoOne;

    @Override
    public void insert(EmployeeEntity employeeEntity) {
        employeeDaoOne.insert(employeeEntity);
    }

    @Override
    public void EmployeeTx(EmployeeEntity employeeEntity) {
        employeeDaoOne.delete();
        employeeDaoOne.insert(employeeEntity);
    }
}
