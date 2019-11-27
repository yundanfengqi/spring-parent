package com.service;

import com.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

public interface EmployeeService {
    void insert(EmployeeEntity employeeEntity);
    void EmployeeTx(EmployeeEntity employeeEntity);
}
