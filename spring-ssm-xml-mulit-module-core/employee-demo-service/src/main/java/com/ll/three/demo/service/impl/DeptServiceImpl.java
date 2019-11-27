package com.ll.three.demo.service.impl;

import com.ll.three.demo.dao.DeptDao;
import com.ll.three.demo.dao.EmployeeDao;
import com.ll.three.demo.entity.Employee;
import com.ll.three.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: &#x4e91;&#x6de1;&#x98ce;&#x8f7b;
 * @create: 2019-11-22 07:11
 **/
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public void deleteById(int deptid) {
        Employee employee = new Employee(1,"事务显示",new Date());
        employeeDao.deleteByDeptId(deptid);
        deptDao.deleteById(deptid);
    }
}
