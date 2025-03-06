package com.productdata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int prod_id;
	private String prod_name;
	private int prod_price;
	private String prod_brand;
	private String prod_color;

	public Product() {
		
	}

	public Product(int prod_id, String prod_name, int prod_price, String prod_brand, String prod_color) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_brand = prod_brand;
		this.prod_color = prod_color;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_brand() {
		return prod_brand;
	}

	public void setProd_brand(String prod_brand) {
		this.prod_brand = prod_brand;
	}

	public String getProd_color() {
		return prod_color;
	}

	public void setProd_color(String prod_color) {
		this.prod_color = prod_color;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_price=" + prod_price
				+ ", prod_brand=" + prod_brand + ", prod_color=" + prod_color + "]";
	}

}
