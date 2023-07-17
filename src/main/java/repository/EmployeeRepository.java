package repository;

import pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    public int maxSalary ();
    public List<Employee> getAllEmployees ();
    public int getAllEmployeeSumSalary ();
    public String getEmployeeMinSalary ();
    public String getEmployeeMaxSalary ();

    List<Employee> getEmployeeHighSalarySalary();
}
