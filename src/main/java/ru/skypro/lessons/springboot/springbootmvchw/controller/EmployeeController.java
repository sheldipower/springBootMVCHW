package ru.skypro.lessons.springboot.springbootmvchw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.springbootmvchw.pojo.Employee;
import ru.skypro.lessons.springboot.springbootmvchw.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/salary/max")
    public Employee findEmployeeWithMaxSalary() {return employeeService.getFindEmployeeWithMaxSalary(); }

    @GetMapping("/salary/min")
    public Employee findEmployeeWithMinSalary() {
        return employeeService.getFindEmployeeWithMinSalary();
    }

    @GetMapping("/salary/sum")
    public Integer findAllSalary() {
        return employeeService.getFindAllSalary();
    }
    @GetMapping("/salary/MoreThanAverage")
    public List<Employee> getFindEmployeeSalaryMoreThanAverage() {
        return employeeService.getFindEmployeeSalaryMoreThanAverage();
    }
    //Создание множества новых сотрудников;
    @PostMapping
    public void createManyEmployee(@RequestBody List<Employee> employeeList){
        employeeService.createManyEmployee(employeeList);
    }
    //Редактирование сотрудника с указанным id;
   @PutMapping("/{id}")
  public void update(@PathVariable int id, @RequestBody Employee employee){
       employeeService.update(id, employee);
   }
  //Возвращение информации о сотруднике с переданным id;
    @GetMapping("/{id}")
    public Employee get(@PathVariable int id) {
       return employeeService.get(id);
    }
    //Удаление сотрудника с переданным id.
  @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
       employeeService.delete(id);
   }
   //Метод возвращения всех сотрудников, зарплата которых выше переданного параметра salary.
    @GetMapping("/salaryHigherThan")
    public List<Employee> getFindEmployeeSalaryHigherThan(@RequestParam int salary) {
       return employeeService.getFindEmployeeSalaryHigherThan(salary);
    }
}