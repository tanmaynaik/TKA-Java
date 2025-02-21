package com.setuptable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@SuppressWarnings("serial")
public class SetConnectionEmp extends EmployeegetData {
	
	String fname, lname, salary, role, join_date, experience, city, country, email, mobile, age, marital_status, dob, password;

	public void insertData()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
			
			PreparedStatement ps = c.prepareStatement("INSERT INTO employee (fname, lname, salary, role, join_date, experience, city, country, email, mobile, age, marital_status, dob, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			
			int intsalary = Integer.parseInt(salary);
			ps.setInt(3, intsalary);
			ps.setString(4, role);
			ps.setString(5, join_date);
			
			int intexperience = Integer.parseInt(experience);
			ps.setInt(6, intexperience);
			ps.setString(7, city);
			ps.setString(8, country);
			ps.setString(9, email);
			ps.setString(10, mobile);
			
			int intage = Integer.parseInt(age);
			ps.setInt(11, intage);
			ps.setString(12, marital_status);
			ps.setString(13, dob);
			ps.setString(14, password);
			
			ps.executeUpdate();
			
			c.close();
			
		} catch (Exception e) {
			
		}
	}

}
