package com.spring;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hello(){
		System.out.println("hello " + name);
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}
		

}
