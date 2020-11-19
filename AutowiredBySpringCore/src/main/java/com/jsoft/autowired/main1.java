package com.jsoft.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main1 {
public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Emp emp=context.getBean("emp1",Emp.class);
	System.out.println(emp);
}
}
