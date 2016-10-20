package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringlearningApplication implements CommandLineRunner {

	@Autowired
	private HelloWorld helloworld;
				
	public static void main(String[] args) {
		System.out.println("dddd");
		SpringApplication.run(SpringlearningApplication.class, args);
									
	}




	@Override
	public void run(String... arg0) throws Exception {
		helloworld.setName("michael");
		helloworld.hello();
		
	}
}
