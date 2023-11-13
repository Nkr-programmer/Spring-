package com.springcore.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//there can be multiple files which can have @Configuration
@Configuration
@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {

}
