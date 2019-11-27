package com.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-13 11:08
 **/

public class EmployeeEntity {
    @NotNull(message = "员工id不能为空")
    private Integer id;

    @NotNull
    private BigDecimal salary;
    private Integer gender;
    @Size(min =2,max = 8,message = "2-8之间")
    private String username;
    private Date hiredate;
    private Integer deptid;

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", hiredate=" + hiredate +
                ", deptid=" + deptid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}
