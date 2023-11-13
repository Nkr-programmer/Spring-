package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo demo=(Demo) context.getBean("demo");
		System.out.println(demo.toString());
		
		
		//not used regularly and remember the class of expression if using
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression exp= temp.parseExpression("22+23-66");
		System.out.println(exp.getValue());
	}

}
