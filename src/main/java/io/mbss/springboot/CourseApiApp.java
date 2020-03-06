package io.mbss.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Needed  to start and tell java that this is a spring boot application
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
//		The static class SpringApp calls run, sending the class with the anotation @SpringBootApplication
//		Sets up default configuration
//		Starts Spring Application context
//		Performs class path scan 
//		Starts Tomcat server
		SpringApplication.run(CourseApiApp.class, args);
	}

}
