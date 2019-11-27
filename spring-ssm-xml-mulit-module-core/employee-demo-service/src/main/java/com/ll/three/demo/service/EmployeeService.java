package com.ll.three.demo.service;

import com.ll.three.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAll(int pageNum, int pageSize);

    void insert(Employee employee);
}
