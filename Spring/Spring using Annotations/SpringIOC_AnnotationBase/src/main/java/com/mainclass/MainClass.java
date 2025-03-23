package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.entity.Tourist;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		Tourist emp = context.getBean("emp", Tourist.class);
		
		System.out.println(emp);
	}

}
