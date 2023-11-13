package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        A a=(A) context.getBean("a3ref");
        B b=(B) context.getBean("bref");
        System.out.println(a.getX()+" "+a.getOb().getY()+" "+b.toString());
	}

}
