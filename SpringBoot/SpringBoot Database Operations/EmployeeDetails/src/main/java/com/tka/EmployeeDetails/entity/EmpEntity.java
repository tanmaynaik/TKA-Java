package com.tka.EmployeeDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;

	private String empname;

	private String sal;

	private String dept;

	public EmpEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpEntity(int empid, String empname, String sal, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
		this.dept = dept;
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

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmpEntity [empid=" + empid + ", empname=" + empname + ", sal=" + sal + ", dept=" + dept + "]";
	}

}
