package com.service;

import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-25 11:00
 **/
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao dao;

    public List<EmployeeEntity> getAll(int pageNum,int pageSize){
        return dao.getAll(pageNum,pageSize);
    }
}
