package Rest_Assignment_part2;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Employee {

    @NotNull
    private Integer id;


    //Customizing field names
    @JsonProperty("emp_name")
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(Integer id, String name, Integer age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public void setId(Integer id) {
        this.id = id;
    }


}
