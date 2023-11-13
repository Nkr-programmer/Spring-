package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alonecollectionconfig.xml");
        Person emp1=(Person) context.getBean("emp1");
        System.out.println(emp1.getToken());
        System.out.println(emp1.getToken().getClass().getName());//to find class of map eg:its hashmap,linkedhashmap etc 

	}

}
