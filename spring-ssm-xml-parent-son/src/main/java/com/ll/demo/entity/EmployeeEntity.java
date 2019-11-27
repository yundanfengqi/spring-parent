package com.ll.demo.entity;

import lombok.Data;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-21 19:16
 **/
@Data
public class EmployeeEntity {
    private Integer id;
    @NotEmpty
    @Size(min = 1,max = 13)
    private String username;

    @NotNull
    private Integer gender;

    @Min(1500)
    private BigDecimal salary;

    @FutureOrPresent
    private Date hiredate;

}
