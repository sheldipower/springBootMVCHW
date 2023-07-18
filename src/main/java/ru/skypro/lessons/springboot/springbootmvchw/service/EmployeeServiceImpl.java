package ru.skypro.lessons.springboot.springbootmvchw.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;
import ru.skypro.lessons.springboot.springbootmvchw.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

        public int getAllEmployeeSumSalary(){
            return employeeRepository.getAllEmployeeSumSalary();
        }
        public String getEmployeeMinSalary(){ return employeeRepository.getEmployeeMinSalary(); }
        public String getEmployeeMaxSalary(){ return employeeRepository.getEmployeeMaxSalary(); }

    @Override
    public List<Employee> getEmployeeHighSalarySalary() {
        return null;
    }


    public List<Employee> getAllEmployees(){ return employeeRepository.getAllEmployees(); }
    }
