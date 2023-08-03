package ru.skypro.lessons.springboot.springbootmvchw.service;

import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    //    String EmployeeMaxSalary(); //верно


    Integer getFindAllSalary();
    Employee getFindEmployeeWithMinSalary();
    Employee getFindEmployeeWithMaxSalary();
    List<Employee> getFindEmployeeSalaryMoreThanAverage();
    void createManyEmployee(List<Employee> employeeList);

    List<Employee> getFindEmployeeSalaryHigherThan(int salary);
}