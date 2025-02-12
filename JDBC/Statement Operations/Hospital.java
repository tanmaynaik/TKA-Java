package com.crudoperations;

import java.sql.*;

public class Hospital {
    public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("CREATE TABLE hospital (id INT PRIMARY KEY AUTO_INCREMENT, pname VARCHAR(50), city VARCHAR(100), reason VARCHAR(50))");
        System.out.println("Hospital table created successfully");
        c.close();
    }

    public void insertHospital() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("INSERT INTO hospital (pname, city, reason) VALUES ('Suresh', 'Delhi', 'Mouth Cancer')");
        s.executeUpdate("INSERT INTO hospital (pname, city, reason) VALUES ('Ramesh', 'Mumbai', 'Accident')");
        s.executeUpdate("INSERT INTO hospital (pname, city, reason) VALUES ('Jethalal', 'Goregaon', 'Food Poisoning')");
        s.executeUpdate("INSERT INTO hospital (pname, city, reason) VALUES ('Mukesh', 'Pune', 'Dengue')");
        s.executeUpdate("INSERT INTO hospital (pname, city, reason) VALUES ('Sunder', 'Ahemdabad', 'Accident')");
        System.out.println("Hospital inserted successfully");
        c.close();
    }

    public void updateHospital() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("UPDATE hospital SET city='Mumbai' WHERE pname='Mukesh'");
        System.out.println("Hospital updated successfully");
        c.close();
    }

    public void deleteHospital() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("DELETE FROM hospital WHERE pname='Ramesh'");
        System.out.println("Hospital deleted successfully");
        c.close();
    }

    public void selectHospitals() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM hospital");
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
//		h.selectHospitals();
	}
}