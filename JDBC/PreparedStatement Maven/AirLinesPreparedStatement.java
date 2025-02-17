package com.preparedstatementmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AirLinesPreparedStatement {
	
	static String company;
	static String hub;
	static float rating;
	
	
	public void createTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("CREATE TABLE airlines(id int PRIMARY KEY AUTO_INCREMENT, name varchar(50), hub varchar(50), rating float)");
		ps.execute();
		System.out.println("Table Created");

		c.close();
	}

	public void insertData(String company, String hub, float rating) throws Exception {
		
		this.company = company;
		this.hub = hub;
		this.rating = rating;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("INSERT INTO airlines(name, hub, rating) VALUES(?, ?, ?)");
		
		
//		ps.setString(1, "Air India");
//		ps.setString(2, "Indira Gandhi International Airport, Delhi");
//		ps.setFloat(3, 4.5f);
//		ps.executeUpdate();
//		ps.setString(1, "IndiGo");
//		ps.setString(2, "Indira Gandhi International Airport, Delhi");
//		ps.setFloat(3, 4.2f);
//		ps.executeUpdate();
//		ps.setString(1, "SpiceJet");
//		ps.setString(2, "Rajiv Gandhi International Airport, Hyderabad");
//		ps.setFloat(3, 4f);
//		ps.executeUpdate();
		
		
		ps.setString(1, company);
		ps.setString(2, hub);
		ps.setFloat(3, rating);
		ps.executeUpdate();
		System.out.println("Data Inserted");

		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("UPDATE airlines SET name=? WHERE name=?");
		ps.setString(2, "SpiceJet");
		ps.setString(1, "Vistara");
		ps.execute();
		System.out.println("Data Updated");

		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("DELETE FROM airlines WHERE name=?");
		ps.setString(1, "IndiGo");
		ps.execute();
		System.out.println("Data Deleted");

		c.close();
	}

	public void selectData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("SELECT * FROM airlines");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4));
		}

		c.close();
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Sagle Airlines");
		
		System.out.print("Enter your Airline Company: ");
		company = sc.nextLine();
		
		System.out.print("Enter your Airline Hub: ");
		hub = sc.nextLine();
		
		System.out.print("Enter your Rating: ");
		rating = sc.nextFloat();
		
		AirLinesPreparedStatement al = new AirLinesPreparedStatement();
		
//		al.createTable();
		al.insertData(company, hub, rating);
//		al.updateData();
//		al.deleteData();
		al.selectData();
	}

}
