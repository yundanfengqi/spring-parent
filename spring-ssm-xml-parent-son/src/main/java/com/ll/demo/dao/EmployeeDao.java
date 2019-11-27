package com.ll.demo.dao;

import com.ll.demo.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    List<EmployeeEntity> getPageHelper(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);

    void add(EmployeeEntity employeeEntity);

    void deleteByDeptId(int deptid);
}
