package ru.skypro.lessons.springboot.springbootmvchw.service;

import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    //    String EmployeeMaxSalary(); //верно

    List<Employee> getAllEmployees ();
    int getAllEmployeeSumSalary ();
    String getEmployeeMinSalary ();
    String getEmployeeMaxSalary ();
    List<Employee> getEmployeeHighSalarySalary();
}