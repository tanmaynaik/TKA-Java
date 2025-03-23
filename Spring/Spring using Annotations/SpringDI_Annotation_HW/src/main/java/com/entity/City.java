package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {
	
	@Value("411810")
	private int pincode;
	@Value("Dholakpur")
	private String cityname;
	@Value("North")
	private String region;
	public City() {
		
	}
	public City(int pincode, String cityname, String region) {
		super();
		this.pincode = pincode;
		this.cityname = cityname;
		this.region = region;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "City [pincode=" + pincode + ", cityname=" + cityname + ", region=" + region + "]";
	}
	
	

}
