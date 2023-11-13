package com.springcore.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/singleton/singleconfig.xml");
	        Student s1=(Student) context.getBean("ob");
	        System.out.println(s1.hashCode());
	        Student s2=(Student) context.getBean("ob");
	        System.out.println(s2.hashCode());
	
	}

}
