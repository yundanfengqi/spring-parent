package com.entity;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-13 15:07
 **/

public class EmployeeEntity {
    private Integer id;

   @Min(value = 1000,message = "工资最小值为1000")
   @NotNull(message = "工资不能为空")
    private BigDecimal salary;

//   @Size(max = 1,min = 0,message = "性别1为男生，O为女生")
   @NotNull(message = "性别不能不填")
    private Integer gender;

   // @Size(min = 2,max = 5,message = "姓名必须是两个字以上，五个字以下 ")
    @NotNull(message = "姓名不能为空")
    private String username;

    @DecimalMax(value = "1")
    @NotNull(message = "部门编号信息需要填写")
    private Integer deptid;

    @Past(message = "填写的日期必须是过去的日期，不能填写将来的日期")
    @NotNull(message = "入职日期不能为空")
    private Date hiredate;

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

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", deptid=" + deptid +
                ", hiredate=" + hiredate +
                '}';
    }
}
