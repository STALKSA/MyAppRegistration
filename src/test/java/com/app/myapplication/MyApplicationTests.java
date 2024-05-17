package com.app.myapplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class MyApplicationTests {

	@Autowired
	private MyApplication context;

	@Test
	void contextLoads() {
		assert(context != null);
		System.out.println("Context loaded succussfully");
	}

}
