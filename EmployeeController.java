package Rest_Assignment_part2;


import jakarta.validation.Valid;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Locale;

@RestController
public class EmployeeController {

    private MessageSource messageSource;
    private EmployeeDAO ed;
    public EmployeeController(EmployeeDAO ed,MessageSource messageSource){

        this.ed=ed;
        this.messageSource=messageSource;
    }

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployee(){
        return ed.findAll();
    }

//   11. HATEOAS
    @GetMapping("/emps/{id}")
    public EntityModel<Employee> retrieve(@PathVariable int id){
        Employee e=ed.getEmployeeById(id);
        EntityModel<Employee> eM=EntityModel.of(e);
        WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).retrieveAllEmployee());
        eM.add(link.withRel("all-emps"));
        return eM;
    }




//    1.Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
    @GetMapping("/employees-internationalized")
    public String helloWorldInternationalised(@RequestParam String username){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("hello.message",null,"Default Message",locale)+" "+username;


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
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @Valid @RequestBody Employee emp){
        Employee e=ed.getEmployeeById(id);
        e.setAge(emp.getAge());
        e.setId(emp.getId());
        e.setName(emp.getName());
        final Employee updatedEmp=ed.save(e);
        return ResponseEntity.ok(updatedEmp);
    }















}
