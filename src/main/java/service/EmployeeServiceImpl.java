package service;

import org.springframework.stereotype.Service;
import pojo.Employee;
import repository.EmployeeRepository;

import java.util.List;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

        public int getAllEmployeeSumSalary(){
            return employeeRepository.getAllEmployeeSumSalary();
        }
        public String getEmployeeMinSalary(){ return employeeRepository.getEmployeeMinSalary(); }
        public String getEmployeeMaxSalary(){ return employeeRepository.getEmployeeMaxSalary(); }
        public List<Employee> getAllEmployees(){ return employeeRepository.getAllEmployees(); }
    }
