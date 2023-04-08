package ComponentMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeesController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public void addEmployees() {
        Employees emp = new Employees();
        emp.setId(1L);
        emp.setAge(23);
        emp.setFirstName("Vaishnavi");
        emp.setLastName("Khurana");


        Salary sal=new Salary();
        sal.setBonusSalary(23445.78);
        sal.setBasicSalary(345677.98);
        sal.setTaxAmount(23.67);
        sal.setBonusSalary(456776.43);

        emp.setSalary(sal);


        employeeRepository.save(emp);
    }
}
