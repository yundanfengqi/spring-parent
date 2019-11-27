package com.entity;

import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-18 19:13
 **/

public class EmployeeVO {
    private Integer id;
    private Integer gender;
    private String username;
    private Date hiredate;

    public EmployeeVO() {
    }

    public EmployeeVO(Integer id, Integer gender, String username, Date hiredate) {
        this.id = id;
        this.gender = gender;
        this.username = username;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "EmployeeVO{" +
                "id=" + id +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", hiredate=" + hiredate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}
