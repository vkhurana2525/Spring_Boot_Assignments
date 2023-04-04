package com.example.JPA_Assignment1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    Employee findByName(String name);

    //find with multiple fields
    List<Employee> findByNameAndAge(String name,int age);
    List<Employee> findByNameStartsWith(String str);

    List<Employee> findByAgeBetween(int a,int b);
}


