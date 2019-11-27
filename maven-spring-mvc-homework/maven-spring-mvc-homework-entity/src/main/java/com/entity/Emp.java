package com.entity;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-19 19:11
 **/

public class Emp {
    private Integer id;
    @Size(min = 1,max = 25,message = "姓名格式不正确")
    private String name;
    @Pattern(regexp = "^1(3|4|5|7|8)\\d(9)$",message = "手机号码格式不正确")
    @NotBlank(message = "手机号码不能为空")
    private String phone;
    @Email(message = "邮箱格式不正确")
    private String email;
    @Past(message = "生日日期格式不正确")
    private Date birthday;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
