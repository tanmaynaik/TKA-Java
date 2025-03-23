package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("123")
	private int empid;
	@Value("Indravarma")
	private String empname;
	@Value("100LPA")
	private String salary;
	@Value("Control")
	private String dept;
	
	@Autowired(required = false)
	private City ct;

	public Employee() {

	}

	public Employee(int empid, String empname, String salary, String dept, City ct) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.dept = dept;
		this.ct = ct;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public City getCt() {
		return ct;
	}

	public void setCt(City ct) {
		this.ct = ct;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", dept=" + dept + ", ct="
				+ ct + "]";
	}

}
