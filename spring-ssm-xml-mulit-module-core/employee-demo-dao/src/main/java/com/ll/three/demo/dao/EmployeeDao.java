package com.ll.three.demo.dao;

import com.ll.three.demo.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAll(@Param("pageNum") int pageNum,
                          @Param("pageSize") int pageSize);

    void insert(Employee employee);


    void deleteByDeptId(int deptid);
}
