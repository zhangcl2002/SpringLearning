package com.spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringlearningApplication implements CommandLineRunner {

	@Autowired
	private HelloWorld helloworld;
				
	public static void main(String[] args) {
		System.out.println("dddd");
		ApplicationContext ctx = SpringApplication.run(SpringlearningApplication.class, args);
		
        System.out.println("Let's inspect the beans provided by the Spring Boot");
        
        String[] beanNames=ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        
        for(String beanName:beanNames){
        	System.out.println(beanName);        	
        }			
        
        HelloWorld hw=(HelloWorld)ctx.getBean("helloWorld");
        hw.hello();
                        
									
	}



	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(helloworld);
		
	}
}
