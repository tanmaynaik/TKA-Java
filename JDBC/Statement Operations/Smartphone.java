package com.crudoperations;

import java.sql.*;

public class Smartphone {
    public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("CREATE TABLE IF NOT EXISTS smartphone (id INT PRIMARY KEY AUTO_INCREMENT, brand VARCHAR(50), model VARCHAR(50), price DOUBLE)");
        System.out.println("Smartphone table created successfully");
        c.close();
    }

    public void insertSmartphone() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("INSERT INTO smartphone (brand, model, price) VALUES ('Apple', 'iPhone 15', 80000)");
        s.executeUpdate("INSERT INTO smartphone (brand, model, price) VALUES ('Samsung', 'M32', 20000)");
        s.executeUpdate("INSERT INTO smartphone (brand, model, price) VALUES ('Samsung', 'S23', 36000)");
        s.executeUpdate("INSERT INTO smartphone (brand, model, price) VALUES ('Redmi', '11 Prime', 14000)");
        s.executeUpdate("INSERT INTO smartphone (brand, model, price) VALUES ('Realme', '8', 15000)");
        System.out.println("Smartphone inserted successfully");
        c.close();
    }

    public void updateSmartphone() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("UPDATE smartphone SET price=30000 WHERE brand='Apple'");
        System.out.println("Smartphone updated successfully");
        c.close();
    }

    public void deleteSmartphone() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("DELETE FROM smartphone WHERE model='S23'");
        System.out.println("Smartphone deleted successfully");
        c.close();
    }

    public void selectSmartphones() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM smartphone");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
        }
        c.close();
    }
    
    public static void main(String[] args) throws Exception {
		Smartphone s = new Smartphone();
		
		//Create Table
//		s.createTable();
		
		//Insert Data
//		s.insertSmartphone();
		
		//Update Data
//		s.updateSmartphone();
		
		//Delete Data
//		s.deleteSmartphone();
		
		//Get all Data
		s.selectSmartphones();
		
	}
}
