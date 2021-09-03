package com.example.ProjectMicroservice.ProjectMicroservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMicroserviceApplication.class, args);
		System.out.println("Server started! "
				+ "and it is listing to port :8000");
	}
}
