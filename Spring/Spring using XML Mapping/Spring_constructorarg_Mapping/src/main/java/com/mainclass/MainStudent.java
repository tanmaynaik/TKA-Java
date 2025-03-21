package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

public class MainStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		Student stds = context.getBean("std", Student.class);
		
		System.out.println(stds);
		
	}

}
