package com.entity;

public class Student {
	
	private int stdid;
	private String sname;
	private int age;
	private String city;
	
	private Institute inst;

	public Student() {
		
	}

	public Student(int stdid, String sname, int age, String city, Institute inst) {
		super();
		this.stdid = stdid;
		this.sname = sname;
		this.age = age;
		this.city = city;
		this.inst = inst;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Institute getInst() {
		return inst;
	}

	public void setInst(Institute inst) {
		this.inst = inst;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", sname=" + sname + ", age=" + age + ", city=" + city + ", inst=" + inst
				+ "]";
	}
	
	

}
