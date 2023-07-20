package ru.skypro.lessons.springboot.springbootmvchw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;
import ru.skypro.lessons.springboot.springbootmvchw.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("list")
    public List<Employee> showCounter() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/max")
    public String getMaxSalaryEmployees() {
        return employeeService.getEmployeeMaxSalary();
    }

    @GetMapping("/sum")
    public int getSumSalaryEmployees() {
        return employeeService.getAllEmployeeSumSalary();
    }

    @GetMapping("/min")
    public String getMinSalary() {
        return employeeService.getEmployeeMinSalary();
    }

    @GetMapping("/high-salary")
    public List<Employee> getHighSalarySalary() {
        return employeeService.getEmployeeHighSalarySalary();
    }
}