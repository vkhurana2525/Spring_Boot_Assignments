package com.example.JPA_Part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }
    @GetMapping("/employees")
    public List<Employee> get(){
        return employeeDAO.findAllEmployees();
    }

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee emp){
        employeeDAO.addEmployee(emp);
    }

    @GetMapping("/employees/salary")
    public List<Object> getEmployeesWithSalary(){
        return employeeDAO.getEmployeesBySalary();
    }

    @GetMapping("/employees/update")
    public  void update(@RequestParam int increment){
        employeeDAO.updateEmployeesSalary(increment);
    }

    @GetMapping("/employees/nativequery1")
    public List<Object[]> getNativeQuery(){
        return employeeDAO.getEmployeesByNativeQuery();
    }

    @DeleteMapping("/employees/delete")
    public void delete(){
        employeeDAO.deleteEmployee();
    }

    @DeleteMapping("/employees/del/{age}")
    public void deleteNative(@PathVariable int age){
        employeeDAO.deleteNativeQuery(age);
    }


}
