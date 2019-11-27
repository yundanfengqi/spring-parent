package com.dao;

import com.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {
    void insert(Emp emp);
    List<Emp> getEmpByPage(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);

}
