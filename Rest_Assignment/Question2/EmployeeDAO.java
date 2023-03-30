package com.example.Rest_Assignment.Rest_Assignment.Question2;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAO {
    static int count=0;

    private static List<Employee> user=new ArrayList<>();
    static{
        user.add(new Employee(++count,"Gita",23));
        user.add(new Employee(++count,"Hira",23));
        user.add(new Employee(++count,"Gita",23));


    }
    public List<Employee>  findAll(){
        return user;
    }

    public Employee getEmployeeById(int id){
        return user.stream().filter(emp->emp.getId()==id).findFirst().orElse(null);
    }

    public void deleteEmployeeById(int id){
        user.removeIf(emp->emp.getId()==id);
    }



    public Employee save(Employee emp){
        emp.setId(++count);
        user.add(emp);
        return emp;
    }
}
