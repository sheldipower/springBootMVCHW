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



    public Integer getFindAllSalary() {
        return employeeList.stream()
                .map(x -> x.getSalary())
                .collect(Collectors.summingInt(Integer::intValue));
    }

    @Override
    public Employee getFindEmployeeWithMinSalary(){
        return employeeList.stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundExeption::new);

    }
    @Override
    public Employee getFindEmployeeWithMaxSalary(){
        return employeeList.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundExeption::new);
    }

    @Override
    public List<Employee> getFindEmployeeSalaryMoreThanAverage(){
        Integer sum = employeeList.stream()
                .map(x -> x.getSalary())
                .collect(Collectors.summingInt(Integer::intValue));
        Integer avg = sum / employeeList.toArray().length;
        return employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .filter(employee -> employee.getSalary() > avg)
                .collect(Collectors.toList());

    }

    @Override
    public void add(Employee employee) {

        employeeList.add(employee);

    }

}


