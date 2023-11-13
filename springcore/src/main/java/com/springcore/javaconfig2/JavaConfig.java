package com.springcore.javaconfig2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Subject getknow()
	{
       Subject subject=new Subject();
		return subject;
	}
	
	@Bean(name= {"student","getdata"})
	public Student getdata()
	{
		Student student=new Student(getknow());
		return student;
	}
	
}
