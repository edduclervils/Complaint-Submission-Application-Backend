package com.revature.complaintsubmissionapplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:test.properties")
class ComplaintSubmissionApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(System.getenv("RDS_URL"));
	}

}
