package com.ll.demo.service.impl;

import com.ll.demo.dao.DeptDao;
import com.ll.demo.dao.EmployeeDao;
import com.ll.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-21 19:18
 **/

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public void deleteDeptById(int deptid) {
        employeeDao.deleteByDeptId(deptid);
        deptDao.deleteDeptById(deptid);
    }
}
