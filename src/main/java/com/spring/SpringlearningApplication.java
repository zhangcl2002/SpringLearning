package com.spring;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringlearningApplication implements CommandLineRunner {
	
    private static Logger logger=Logger.getLogger("SpringlearningApplication.class");    		
    		
	@Autowired
	private HelloWorld helloworld;
				
	public static void main(String[] args) {
		
		
		
		ApplicationContext ctx = SpringApplication.run(SpringlearningApplication.class, args);
		        	
		try {
			throw new Exception("您输入的是定除数不能为负数!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Threw a BadException in MyClass::MyMethod, full stack trace follows:", e);
		}
		logger.error("Let's inspect the beans provided by the Spring Boot");
		
		
		logger.info("Spring Boot");
		
        
        String[] beanNames=ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        
        /*for(String beanName:beanNames){
        	System.out.println(beanName);        	
        }*/			
        
        HelloWorld hw=(HelloWorld)ctx.getBean("helloWorld");
        hw.setName("Michael");
        hw.hello();
                        
									
	}



	@Override
	public void run(String... arg0) throws Exception {
		//System.out.println(helloworld);		
	}
}
