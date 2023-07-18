package service;

import pojo.Employee;

import java.util.List;

public interface EmployeeService {
    //    String EmployeeMaxSalary(); //верно

    List<Employee> getAllEmployees ();
    int getAllEmployeeSumSalary ();
    String getEmployeeMinSalary ();
    String getEmployeeMaxSalary ();
    List<Employee> getEmployeeHighSalarySalary();
}