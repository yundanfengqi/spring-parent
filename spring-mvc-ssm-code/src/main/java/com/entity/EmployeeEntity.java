package com.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-25 10:58
 **/
@Data
public class EmployeeEntity {
    private Integer id;
    private Integer gender;
    private BigDecimal salary;
    private String username;
    private Integer deptid;
}
