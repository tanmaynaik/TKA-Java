package com.studentoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student {
	
	String name, city;
	int age, marks, sclass;

	
	public void insertData(String name, int age, String city, int marks, int sclass) throws Exception {

		this.name = name;
		this.age = age;
		this.city = city;
		this.marks = marks;
		this.sclass = sclass;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("INSERT INTO student(name, age, city, marks, class) VALUES(?, ?, ?, ?, ?)");

		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setString(3, city);
		ps.setInt(4, marks);
		ps.setInt(5, sclass);
		ps.executeUpdate();
		System.out.println("Data Inserted");

		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("UPDATE student SET name=? WHERE name=?");
		ps.setString(1, "Thala");
		ps.setString(2, "Udi Baba");
		ps.execute();
		System.out.println("Data Updated");

		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("DELETE FROM student WHERE name=?");
		ps.setString(1, "Tanmay");
		ps.execute();
		System.out.println("Data Deleted");

		c.close();
	}

	public void selectData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("SELECT * FROM student");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(5) + " " + rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getInt(6));
		}

		c.close();
	}

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
//		System.out.println("Enter your name:");
//		String name = sc.nextLine();
//		
//		System.out.println("Enter your age:");
//		int age = sc.nextInt();
//		
//		System.out.println("Enter your city:");
//		String city = sc.next();
//		
//		System.out.println("Enter your marks in percent:");
//		int marks = sc.nextInt();
//		
//		System.out.println("Enter your class:");
//		int sclass = sc.nextInt();

		
//		s.insertData(name, age, city, marks, sclass);
		
//		s.updateData();
		
//		s.deleteData();
		
		s.selectData();
		sc.close();

	}

}
