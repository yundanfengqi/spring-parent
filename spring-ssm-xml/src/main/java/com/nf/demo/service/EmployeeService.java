package com.nf.demo.service;

import com.nf.demo.entity.EmployeeEntity;

import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-21 08:56
 **/

public interface EmployeeService {
    List<EmployeeEntity> getAll(int pageNum, int pageSize);
    void insert(EmployeeEntity employeeEntity);
}
