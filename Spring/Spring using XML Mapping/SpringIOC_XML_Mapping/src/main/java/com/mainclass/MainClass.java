package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.EmployeeEg;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		EmployeeEg emp = context.getBean("emp", EmployeeEg.class);
		
		System.out.println(emp);
	}

}
