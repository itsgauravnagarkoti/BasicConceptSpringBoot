package com.contoller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@EnableAutoConfiguration
//@ComponentScan /// scaning all contollers 
@SpringBootApplication
@PropertySource("/Propfolder/application.properties")
public class StarterApp {
	
	public static void main(String[] args) {
		
		// short form
		
		ConfigurableApplicationContext config = SpringApplication.run(StarterApp.class, args);
		
		MyApp app = config.getBean(MyApp.class);
		
		System.out.println(app.getAppliactionName());
		System.out.println(app.getVersion());
		System.out.println(app.getDescripition());
		
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
