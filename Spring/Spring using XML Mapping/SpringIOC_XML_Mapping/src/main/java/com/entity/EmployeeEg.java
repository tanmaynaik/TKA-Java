package com.entity;

public class EmployeeEg {

	private int empid;
	private String empname;
	private String dept;
	private String salary;
	private Country con;

	public EmployeeEg() {

	}

	public EmployeeEg(int empid, String empname, String dept, String salary, Country con) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
		this.salary = salary;
		this.con = con;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "EmployeeEg [empid=" + empid + ", empname=" + empname + ", dept=" + dept + ", salary=" + salary
				+ ", con=" + con + "]";
	}

	

}
