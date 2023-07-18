package ru.skypro.lessons.springboot.springbootmvchw.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    // Коллекция для имитации данных
    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000),
            new Employee("Женя", 175_000));

    public int maxSalary() {
        int max = 0;
        for (int i = 0; i < employeeList.size(); i++)
            if (employeeList.get(i).getSalary() > max) {
                max = employeeList.get(i).getSalary();
            }
        return max;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeList);
    }

    @Override
    public int getAllEmployeeSumSalary() {
        int sum = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            sum += employeeList.get(i).getSalary();
        }

        return sum;
    }

    @Override
    public String getEmployeeMinSalary() {
        int min = maxSalary();
        String minEmployee = null;
        for (int i = 0; i < employeeList.size(); i++)
            if (employeeList.get(i).getSalary() < min) {
                min = employeeList.get(i).getSalary();
                minEmployee = employeeList.get(i).getName();
            }
        return minEmployee;
    }

    @Override
    public String getEmployeeMaxSalary() {
        int max = 0;
        String maxEmployee = null;
        for (int i = 0; i < employeeList.size(); i++)
            if (employeeList.get(i).getSalary() > max) {
                max = employeeList.get(i).getSalary();
                maxEmployee = employeeList.get(i).getName();
            }
        return maxEmployee;
    }
    @Override
    public List<Employee> getEmployeeHighSalarySalary() {
        List<Employee> employeeList = new ArrayList<>();
        int hightSalary = 40_000;
        for (int i = 0; i < employeeList.size(); i++) {
            if (hightSalary < employeeList.get(i).getSalary()) {
                employeeList.add( new Employee(employeeList.get(i).getName(), employeeList.get(i).getSalary()));
            }
        }
        return employeeList;
    }

    }


