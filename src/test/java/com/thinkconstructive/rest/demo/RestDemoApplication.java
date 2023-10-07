package com.thinkconstructive.rest.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
public class RestDemoApplication {

	@Test
	public static void main(String[] args)
	{

		SpringApplication.run(RestDemoApplication.class,args);
	}

}
