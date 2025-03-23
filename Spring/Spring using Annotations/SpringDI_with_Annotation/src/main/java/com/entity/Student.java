package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("12")
	private int stdid;
	
	@Value("Nandu")
	private String stdname;
	
	@Value("12")
	private int age;
	@Autowired(required = false)
	private College clg;

	public Student() {
		
	}

	public Student(int stdid, String stdname, int age, College clg) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.age = age;
		this.clg = clg;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", age=" + age + ", clg=" + clg + "]";
	}
	
	

}
