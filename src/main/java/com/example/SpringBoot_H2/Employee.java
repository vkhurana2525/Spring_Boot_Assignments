package com.example.SpringBoot_H2;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;

    public Employee(Long id,String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee() {
        super();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return emp.id.equals(this.id);
    }
}
