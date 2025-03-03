package com.samplepojo;

public class Patient {
	
	private int pat_id;
	private String pat_name;
	private String hosp_name;
	private int age;
	private String reason;
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient(int pat_id, String pat_name, String hosp_name, int age, String reason) {
		super();
		this.pat_id = pat_id;
		this.pat_name = pat_name;
		this.hosp_name = hosp_name;
		this.age = age;
		this.reason = reason;
	}


	public int getPat_id() {
		return pat_id;
	}


	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}


	public String getPat_name() {
		return pat_name;
	}


	public void setPat_name(String pat_name) {
		this.pat_name = pat_name;
	}


	public String getHosp_name() {
		return hosp_name;
	}


	public void setHosp_name(String hosp_name) {
		this.hosp_name = hosp_name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	@Override
	public String toString() {
		return "Patient [pat_id=" + pat_id + ", pat_name=" + pat_name + ", hosp_name=" + hosp_name + ", age=" + age
				+ ", reason=" + reason + "]";
	}
	
	
	

}
