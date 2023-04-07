package com.example.JPA_Part2;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query("select firstName,lastName from Employee where salary >(select AVG(salary) from Employee) order by salary DESC")
    List<Object> getEmployeesBySalary();

    @Modifying
    @Query("Update Employee SET salary=:increment where salary<:avgSalary")
    void updateEmployeesBySalary(@Param("increment") int increment, @Param("avgSalary")Long avgSalary);

    @Modifying
    @Query("delete from Employee where salary=:minSalary")
    void deleteEmployeesWithMinSal(@Param("minSalary") Long minSalary);
    @Query("select AVG(salary) from Employee")
    Long avgSalary();
    @Query("select MIN(salary) from Employee")
    Long minSalary();
    @Query(value="select emp_id,emp_first_name,emp_age from employee_table where emp_last_name LIKE 'Bajaj'", nativeQuery = true)
    List<Object[]> getFromNativeQuery();


    @Modifying
    @Transactional
    @Query(value="delete from employee_table where emp_age> :age",nativeQuery = true)
    void deleteByNativeQuery(@Param("age") int age);

}
