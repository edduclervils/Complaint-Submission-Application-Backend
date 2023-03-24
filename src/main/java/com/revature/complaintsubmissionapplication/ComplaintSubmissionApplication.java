package com.revature.complaintsubmissionapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:prod.properties")
public class ComplaintSubmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplaintSubmissionApplication.class, args);
	}

}
