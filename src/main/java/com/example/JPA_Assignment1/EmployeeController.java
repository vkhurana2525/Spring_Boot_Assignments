package com.example.JPA_Assignment1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDAO ed;

    @GetMapping("/employees")
    public List<Employee> get(){
        return ed.findAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveById(@PathVariable Long id){
        return ed.getEmployeeById(id);
    }

    @GetMapping("/employees_count")
    public Long getCountofEmployees(){
        return ed.getCount();
    }

    @PostMapping("/emps")
    public void createEmployee(@RequestBody Employee emp){
        ed.addEmployee(emp);
    }

    @PutMapping("/emps/{id}/{name}")
    public void update(@PathVariable Long id,String name){
        ed.updateEmployees(id,name);
    }

    @DeleteMapping("/employees-del")
    public void deleteAll(){
        ed.deleteEmployees();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable Long id){
        ed.deleteEmployeesById(id);
    }


    //FINDER METHODS
    @GetMapping("/findByName")
    public void serviceFindBYName(){
        ed.serviceFindBYName();
    }












}
