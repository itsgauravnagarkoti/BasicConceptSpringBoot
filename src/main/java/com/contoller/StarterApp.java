package com.contoller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan /// scaning all contollers 
@SpringBootApplication
public class StarterApp {
	
	public static void main(String[] args) {
		
		// short form
		
		SpringApplication.run(StarterApp.class, args);
		
//		SpringApplication sa = new SpringApplication(StarterApp.class);
//		sa.run(args);
//		ConfigurableApplicationContext conatiner =  sa.run();
//		
//		Student student = conatiner.getBean(Student.class);
//		System.out.println("Student Name is ---------------->"+student.getStudentName());
		
	}
	
	
	
//	@Bean /// Second way to create object and  also push into container
//	public Student createobj() {
//		return new Student();
//	}


}
