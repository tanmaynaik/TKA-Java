package com.entity;

public class Country {
	
	private int ccode;
	private String country;
	public Country() {
		
	}
	public Country(int ccode, String country) {
		super();
		this.ccode = ccode;
		this.country = country;
	}
	public int getCcode() {
		return ccode;
	}
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Country [ccode=" + ccode + ", country=" + country + "]";
	}
	

}
