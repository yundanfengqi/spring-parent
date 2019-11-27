package com.ll.three.demo.service.impl;

import com.ll.three.demo.dao.EmployeeDao;
import com.ll.three.demo.entity.Employee;
import com.ll.three.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-22 07:11
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao dao;
    @Override
    public List<Employee> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum,pageSize);
    }

    @Override
    public void insert(Employee employee) {
        dao.insert(employee);
    }
}
