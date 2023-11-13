package com.springcore.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
        Samosa s1= (Samosa) context.getBean("s1");
        System.out.println(s1);
        Pepsi p1= (Pepsi) context.getBean("p1");
        System.out.println(p1);
        Sauce c1= (Sauce) context.getBean("c1");
        System.out.println(c1);
        //to enable the destroy we need to register the sutdown hook which is 
        //not present ApplicationContext .that method is present in AbstractApplicationContext
        context.registerShutdownHook();
        
	}

}
