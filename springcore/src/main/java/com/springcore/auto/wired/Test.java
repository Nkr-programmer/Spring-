package com.springcore.auto.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wired/awconfig.xml");
        //Emp emp=(Emp) context.getBean("emp");//both ways are same
        Emp emp=(Emp) context.getBean("emp",Emp.class);
        System.out.println(emp.toString());

	}

}
