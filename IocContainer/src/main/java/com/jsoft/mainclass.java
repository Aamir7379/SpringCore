package com.jsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainclass {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-servlet.xml");
	             Student student=(Student)context.getBean("Student1");
	             Student student2=(Student)context.getBean("Student2");
	             System.out.println(student);
	             System.out.println(student2);
}
}
