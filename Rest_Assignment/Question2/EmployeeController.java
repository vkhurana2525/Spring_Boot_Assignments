package com.example.Rest_Assignment.Rest_Assignment.Question2;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeDAO ed;
    public EmployeeController(EmployeeDAO ed){
        this.ed=ed;
    }

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployee(){
        return ed.findAll();
    }
    @GetMapping("/employees/{id}")
    public Employee retrieveEmployeeById(@PathVariable Integer id){
        Employee e=ed.getEmployeeById(id);
       if(e==null)
           throw new EmployeeNotFoundException("id"+id);
       return e;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployeeById(@PathVariable Integer id){
       ed.deleteEmployeeById(id);
    }

    @PostMapping("/emp")
    public void createUser(@RequestBody Employee emp){
        ed.save(emp);
    }

    @PutMapping("/emps/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee emp){
        Employee e=ed.getEmployeeById(id);
        e.setAge(emp.getAge());
        e.setId(emp.getId());
        e.setName(emp.getName());
        final Employee updatedEmp=ed.save(e);
        return ResponseEntity.ok(updatedEmp);
    }













}
