package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("INSERT INTO students VALUE(?, ?, ?)");
		ps.setInt(1, 1);
		ps.setString(2, "Gogo");
		ps.setString(3, "Pehelwanpur");
		ps.executeUpdate();
		
		ps.setInt(1, 2);
		ps.setString(2, "Jojo");
		ps.setString(3, "Dholakpur");
		ps.executeUpdate();
		
		ps.setInt(1, 3);
		ps.setString(2, "Raju");
		ps.setString(3, "Dholakpur");
		ps.executeUpdate();
		
		ps.setInt(1, 4);
		ps.setString(2, "Chukti");
		ps.setString(3, "Dholakpur");
		ps.executeUpdate();

		System.out.println("Inserted...");
		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		PreparedStatement ps = c.prepareStatement("UPDATE students SET name=? WHERE id=?");
		ps.setInt(2, 3);
		ps.setString(1, "Jaggu");
		ps.executeUpdate();

		System.out.println("Updated...");
		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");

		PreparedStatement ps = c.prepareStatement("DELETE FROM students WHERE id = ?");
		ps.setInt(1, 2);
		ps.executeUpdate();

		System.out.println("Deleted...");
		c.close();
	}

	public void selectData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");

		PreparedStatement ps = c.prepareStatement("SELECT * FROM students");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}

		c.close();
	}
}
