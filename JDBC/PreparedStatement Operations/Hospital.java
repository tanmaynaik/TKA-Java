package com.preparedstatementassign;

import java.sql.*;

public class Hospital {
    public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("CREATE TABLE hospital (id INT PRIMARY KEY AUTO_INCREMENT, pname VARCHAR(50), city VARCHAR(100), reason VARCHAR(50))");
        ps.executeUpdate();
        System.out.println("Hospital table created successfully");
        c.close();
    }

    public void insertHospital() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("INSERT INTO hospital (pname, city, reason) VALUES (?, ?, ?)");
        ps.setString(1, "Suresh");
        ps.setString(2, "Pune");
        ps.setString(3, "Cancer");
        ps.executeUpdate();
        
        ps.setString(1, "Mukesh");
        ps.setString(2, "Mumbai");
        ps.setString(3, "Five Star");
        ps.executeUpdate();
        
        System.out.println("Hospital inserted successfully");
        c.close();
    }

    public void updateHospital() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("UPDATE hospital SET city=? WHERE pname=?");
        ps.setString(2, "Mukesh");
        ps.setString(1, "Dholakpur");
        ps.executeUpdate();
        System.out.println("Hospital updated successfully");
        c.close();
    }

    public void deleteHospital() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("DELETE FROM hospital WHERE pname=?");
        ps.setString(1, "Sunder");
        ps.executeUpdate();
        System.out.println("Hospital deleted successfully");
        c.close();
    }

    public void selectHospitals() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("SELECT * FROM hospital");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        c.close();
    }
    
    public static void main(String[] args) throws Exception{
		Hospital h = new Hospital();
		
		//Create Table
//		h.createTable();
		
		//Insert Data
//		h.insertHospital();
		
		//Update Data
//		h.updateHospital();
		
		//Delete Hospital
//		h.deleteHospital();
		
		//Select Data
		h.selectHospitals();
	}
}