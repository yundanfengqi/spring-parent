package com.dao;

import com.entity.Employee;

public interface EmployeeDao {
    int add(Employee employee);
    void delete();
}
