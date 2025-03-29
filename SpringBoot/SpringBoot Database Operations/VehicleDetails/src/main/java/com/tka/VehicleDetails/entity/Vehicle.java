package com.tka.VehicleDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@Id
	private String noplate;
	private String vtype;
	private String company;
	private String modname;

	public Vehicle() {

	}

	public Vehicle(String noplate, String vtype, String company, String modname) {
		super();
		this.noplate = noplate;
		this.vtype = vtype;
		this.company = company;
		this.modname = modname;
	}

	public String getNoplate() {
		return noplate;
	}

	public void setNoplate(String noplate) {
		this.noplate = noplate;
	}

	public String getVtype() {
		return vtype;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModname() {
		return modname;
	}

	public void setModname(String modname) {
		this.modname = modname;
	}

	@Override
	public String toString() {
		return "Vehicle [noplate=" + noplate + ", vtype=" + vtype + ", company=" + company + ", modname=" + modname
				+ "]";
	}

}
