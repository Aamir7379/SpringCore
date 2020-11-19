package com.SpringCore.LIstIocInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       Model model=(Model)context.getBean("model1");
       
       System.out.println(model.getName());
       System.out.println(model.getPhonesnumber());
       System.out.println(model.getAddress());
       System.out.println(model.getCourse());
    }
}
