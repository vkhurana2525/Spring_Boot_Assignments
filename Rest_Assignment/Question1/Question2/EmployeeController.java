package com.example.Rest_Assignment.Rest_Assignment.Question1.Question2;


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

//    @PutMapping("/employees/{id}")
//    public

}
