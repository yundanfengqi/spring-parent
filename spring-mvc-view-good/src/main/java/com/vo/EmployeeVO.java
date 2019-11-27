package com.vo;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-14 19:28
 **/

public class EmployeeVO {
    private Integer id;
    private Integer gender;
    private String username;

    public EmployeeVO() {
    }

    public EmployeeVO(Integer id, Integer gender, String username) {
        this.id = id;
        this.gender = gender;
        this.username = username;
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

    @Override
    public String toString() {
        return "EmployeeVO{" +
                "id=" + id +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                '}';
    }
}
