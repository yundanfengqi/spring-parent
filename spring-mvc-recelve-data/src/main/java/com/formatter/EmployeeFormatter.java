package com.formatter;

import com.entity.Employee;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-12 12:03
 **/

public class EmployeeFormatter implements Formatter<Employee> {
    @Override
    public Employee parse(String text, Locale locale) throws ParseException {
       String[] data = text.split(",");
       Employee employee = new Employee();
       employee.setFirstName(data[0]);
       employee.setLastName(data[1]);
        return employee;
    }

    @Override
    public String print(Employee object, Locale locale) {
        return object.toString();
    }
}
