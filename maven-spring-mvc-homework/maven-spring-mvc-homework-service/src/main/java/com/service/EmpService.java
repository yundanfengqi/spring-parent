package com.service;

import com.entity.Emp;

import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-19 19:36
 **/
public interface EmpService {
    void insert(Emp emp);
    List<Emp> getEmpByPage(int pageNum,int pageSize);
}
