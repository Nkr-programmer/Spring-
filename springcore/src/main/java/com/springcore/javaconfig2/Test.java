package com.springcore.javaconfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student s1=(Student) context.getBean("getdata");
        s1.study();
		
		
	}

}
