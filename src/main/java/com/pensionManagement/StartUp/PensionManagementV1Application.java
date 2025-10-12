package com.pensionManagement.StartUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.pensionManagement")
@EntityScan(value="com.PensionManagement.Entity")
@EnableJpaRepositories(basePackages = "com.PensionManagement.Repository")
@EnableAutoConfiguration
public class PensionManagementV1Application {

	public static void main(String[] args) {
		SpringApplication.run(PensionManagementV1Application.class, args);
	}

}
