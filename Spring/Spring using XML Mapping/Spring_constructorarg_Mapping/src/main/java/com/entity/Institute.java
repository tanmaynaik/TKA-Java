package com.entity;

public class Institute {
	
	private int instcode;
	private String instname;
	private String course;
	public Institute() {
		
	}
	public Institute(int instcode, String instname, String course) {
		super();
		this.instcode = instcode;
		this.instname = instname;
		this.course = course;
	}
	public int getInstcode() {
		return instcode;
	}
	public void setInstcode(int instcode) {
		this.instcode = instcode;
	}
	public String getInstname() {
		return instname;
	}
	public void setInstname(String instname) {
		this.instname = instname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Institute [instcode=" + instcode + ", instname=" + instname + ", course=" + course + "]";
	}
	
	
	

}
