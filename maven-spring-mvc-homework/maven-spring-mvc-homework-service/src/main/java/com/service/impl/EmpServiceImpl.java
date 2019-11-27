package com.service.impl;

import com.dao.EmpDao;
import com.entity.Emp;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-19 19:36
 **/
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public void insert(Emp emp) {
        empDao.insert(emp);
    }

    @Override
    public List<Emp> getEmpByPage(int pageNum, int pageSize) {
        return empDao.getEmpByPage(pageNum,pageSize);
    }
}
