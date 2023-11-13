package com.springcore.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Annotation
		    ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/prototype/protoconfig.xml");
	        Student s1=(Student) context.getBean("ob");
	        System.out.println(s1.hashCode()+" "+s1.toString());
	        Student s2=(Student) context.getBean("ob");
	        System.out.println(s2.hashCode()+" "+s2.toString());
	    //XML    
	        Teacher t1=(Teacher) context.getBean("obj");
	        System.out.println(t1.hashCode()+" "+t1.toString());
	        Teacher t2=(Teacher) context.getBean("obj");
	        System.out.println(t2.hashCode()+" "+t2.toString());
	
	}

}
