package com.ll.three.demo.entity;

import lombok.Data;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-21 21:53
 **/

@Data
public class Employee {
    private Integer id;
    @NotEmpty
    @Size(min = 1,max = 10)
    private String username;

    @Min(0)
    private BigDecimal salary;
    @FutureOrPresent

    private Date hiredate;

}
