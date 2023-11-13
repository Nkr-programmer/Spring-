package com.springcore.javaconfig1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Student getdata()
	{
		Student student=new Student();
		return student;
	}
	
}
