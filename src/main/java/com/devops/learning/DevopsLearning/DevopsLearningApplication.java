package com.devops.learning.DevopsLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.devops"})
public class DevopsLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsLearningApplication.class, args);
	}

}
