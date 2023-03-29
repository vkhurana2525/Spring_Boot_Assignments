package com.example.SpringBoot_H2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class SpringBootH2Application {

	public static void main(String[] args) {
		Properties props = new Properties();
		try(InputStream input = MyApplication.class.getClassLoader().getResourceAsStream("application.properties")){

		}
	}



}
