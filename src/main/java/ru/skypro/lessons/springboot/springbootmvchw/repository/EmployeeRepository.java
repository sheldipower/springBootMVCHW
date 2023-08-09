package ru.skypro.lessons.springboot.springbootmvchw.repository;

import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    public Integer getFindAllSalary();
    public Employee getFindEmployeeWithMinSalary();
    public Employee getFindEmployeeWithMaxSalary();
    public List<Employee> getFindEmployeeSalaryMoreThanAverage();
    public void add(Employee employee);


}
