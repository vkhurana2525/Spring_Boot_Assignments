package com.example.SpringBoot_H2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class SpringBootH2Application implements CommandLineRunner {
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public void run(String... args) throws Exception {
		employeeDAO.save(new Employee(1L,"Hitesh",23));
	}
	public static void main(String[] args) {
	SpringApplication.run(SpringBootH2Application.class);

	}



}
