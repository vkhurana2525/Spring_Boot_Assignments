package com.example.JPA_Part2;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDAO {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDAO(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
    public void addEmployee(Employee emp){
        employeeRepository.save(emp);
    }

    public List<Object> getEmployeesBySalary(){
        return employeeRepository.getEmployeesBySalary();
    }

    @Transactional
    public void updateEmployeesSalary(int increment){
        Long avgSalary= employeeRepository.avgSalary();
        employeeRepository.updateEmployeesBySalary(increment,avgSalary);
    }

    @Transactional
    public void deleteEmployee(){
        Long minSalary= employeeRepository.minSalary();
        employeeRepository.deleteEmployeesWithMinSal(minSalary);
    }

    public List<Object[]> getEmployeesByNativeQuery(){
        return employeeRepository.getFromNativeQuery();
    }

    public void deleteNativeQuery(int age){
        employeeRepository.deleteByNativeQuery(age);
    }




}
