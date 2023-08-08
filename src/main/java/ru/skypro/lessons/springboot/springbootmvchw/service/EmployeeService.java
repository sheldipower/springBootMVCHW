package ru.skypro.lessons.springboot.springbootmvchw.service;

import org.springframework.web.bind.annotation.PathVariable;
import ru.skypro.lessons.springboot.springbootmvchw.Dto.EmployeeFullInfo;
import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;


import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    /**
     * GET возвращать информацию о сотруднике с переданным id
     */
    List<EmployeeFullInfo> getBuIdEmployeeFull(int id);


/**
 * GET  возвращать самой высокой зарплатой
 */
List<Employee> employeeHighSalary (Integer salary);
/**
 * GET возвращать информацию о сотруднике с переданным position
 */
List<EmployeeFullInfo>getBuPositionToEmployee(String role);
    /**
     * GET возвращать информацию о сотрудниках на странице.
     */
    List<Employee> getEmployeesPaging( int page, int size);

    List<EmployeeFullInfo> getFull();
 }