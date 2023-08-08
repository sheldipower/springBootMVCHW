package ru.skypro.lessons.springboot.springbootmvchw.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.springbootmvchw.Dto.EmployeeFullInfo;
import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;
import ru.skypro.lessons.springboot.springbootmvchw.repository.EmployeeRepository;
import ru.skypro.lessons.springboot.springbootmvchw.repository.PagingEmployeeRepository;


import java.awt.print.Pageable;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, PagingEmployeeRepository pagingEmployeeRepository) {
        this.employeeRepository = employeeRepository;
        this.pagingEmployeeRepository = pagingEmployeeRepository;
    }

    /**
     * GET возвращать информацию о сотруднике с переданным id
     */


    @Override
    public List<EmployeeFullInfo> getBuIdEmployeeFull(int id) {
        return employeeRepository.buIdEmployeeINfo(id);
    }

    /**
     * GET самой высокой зарплатой
     */
    @Override
    public List<Employee> employeeHighSalary(Integer lowBoard) {
        return employeeRepository.employeeUserHighSalary(lowBoard);
    }


    /**
     * GET возвращать информацию о сотруднике с переданным position
     */
    @Override
    public List<EmployeeFullInfo> getBuPositionToEmployee(String role) {
        return employeeRepository.buPositionToEmployee(role);
    }

    /**
     * GET возвращать полную информацию о сотруднике
     */
    @Override
    public List<EmployeeFullInfo> getFull() {
        return employeeRepository.getFullEmployee();
    }


    /**
     * GET возвращать информацию о сотрудниках на странице.
     */
    @Override
    public List<Employee> getEmployeesPaging(int page, int size) {
        Pageable employeeOfConcretePage = PageRequest.of(page, size);
        Page<Employee> employeePage = pagingEmployeeRepository.findAll(employeeOfConcretePage);
        return employeePage.stream().toList();
    }
}