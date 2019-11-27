package com.ll.demo.service;

import com.ll.demo.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getPageHelper(int pageNum,int pageSize);

    void add(EmployeeEntity employeeEntity);
}
