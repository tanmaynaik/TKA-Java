package com.dao;

import java.sql.*;

public class EmployeeDAO {

	public void insertData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		Statement s = c.createStatement();
		s.executeUpdate("INSERT INTO employee VALUE(8, 'Chota Bheem', 'Fighting')");
		
		System.out.println("Inserted...");
		c.close();
	}
	
	public void updateData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		Statement s = c.createStatement();
		s.executeUpdate("UPDATE employee SET empname='MobileBoy' WHERE empid=4");
		
		System.out.println("Updated...");
		c.close();
	}
	
	public void deleteData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		
		Statement s = c.createStatement();
		s.executeUpdate("DELETE FROM employee WHERE empid = 2");
		
		System.out.println("Deleted...");
		c.close();
	}
	
	public void selectData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM employee");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) + " " + rs.getString(3));
		}
		
		System.out.println("Deleted...");
		c.close();
	}
	
}
