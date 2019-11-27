package com.entity;

import java.util.List;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-12 12:03
 **/

public class EmployeeVO {
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "EmployeeVO{" +
                "employees=" + employees +
                '}';
    }
}
