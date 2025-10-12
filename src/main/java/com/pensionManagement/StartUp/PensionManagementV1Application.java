package com.pensionManagement.StartUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pensionManagement")
public class PensionManagementV1Application {

	public static void main(String[] args) {
		SpringApplication.run(PensionManagementV1Application.class, args);
	}

}
