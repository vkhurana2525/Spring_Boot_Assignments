package com.example.JPA_Assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mustache.MustacheResourceTemplateLoader;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Optional;
@Service
public class EmployeeDAO {
    @Autowired
    EmployeeRepository employeeRepository;

    //create
    public void addEmployee(Employee emp){
        employeeRepository.save(emp);
    }

    //find
    public List<Employee> findAllEmployees(){
        List<Employee> list= (List<Employee>) employeeRepository.findAll();
        return list;
    }

    //delete
    public void deleteEmployees(){
        employeeRepository.deleteAll();
    }

    public void deleteEmployeesById(Long id){
        employeeRepository.deleteById(id);
    }

    //update
    public void updateEmployees(Long id,String name){
        Optional<Employee> op=employeeRepository.findById(id);
        if(op.isPresent()){
            Employee e=op.get();
            e.setName(name);
            employeeRepository.save(e);
        }
    }

    //read
    public Employee getEmployeeById(Long id){
        Optional<Employee> op=employeeRepository.findById(id);
        if(op.isPresent()) {
            return op.get();
        }
        return null;
    }

    //get total count of employees
    public Long getCount(){
        return employeeRepository.count();
    }

    public Employee serviceFindBYName(){
        return employeeRepository.findByName("Priyanka");
    }

    public void serviceFindByNameAndAge(){
        List<Employee> list=employeeRepository.findByNameAndAge("Priya",52);
        list.forEach(e->System.out.println(e.getLocation()));
    }

    public List<Employee> getEmployeeStartingWithA(){
        return employeeRepository.findByNameStartsWith("P");
    }

    public List<Employee> getEmployeeAgeBetween(){
        return employeeRepository.findByAgeBetween(28,32);
    }


    }



