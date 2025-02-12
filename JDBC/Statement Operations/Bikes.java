package com.crudoperations;

import java.sql.*;

public class Bikes {
    public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("CREATE TABLE bikes (id INT PRIMARY KEY AUTO_INCREMENT, brand VARCHAR(50), model VARCHAR(50), price INT)");
        System.out.println("Bikes table created successfully");
        c.close();
    }

    public void insertBike() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("INSERT INTO bikes (brand, model, price) VALUES ('Honda', 'CBR500R', 170000)");
        s.executeUpdate("INSERT INTO bikes (brand, model, price) VALUES ('Hero', 'Splendor', 170000)");
        s.executeUpdate("INSERT INTO bikes (brand, model, price) VALUES ('Suzuki', 'Ducati', 700000)");
        s.executeUpdate("INSERT INTO bikes (brand, model, price) VALUES ('Hoonda', 'Activa', 170000)");
        s.executeUpdate("INSERT INTO bikes (brand, model, price) VALUES ('Hero', 'Duet', 70000)");
        System.out.println("Bike inserted successfully");
        c.close();
    }

    public void updateBike() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("UPDATE bikes SET price=1750000 WHERE brand='Honda'");
        System.out.println("Bike updated successfully");
        c.close();
    }

    public void deleteBike() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("DELETE FROM bikes WHERE brand='Honda'");
        System.out.println("Bike deleted successfully");
        c.close();
    }

    public void selectBikes() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM bikes");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
        }
        c.close();
    }
    
    public static void main(String[] args) throws Exception {
		Bikes b = new Bikes();
		
		//Create Table
//		b.createTable();
		
		//Insert Data
//		b.insertBike();
		
		//Update Data
//		b.updateBike();
		
		//Delete data
//		b.deleteBike();
		
		//Get Data
		b.selectBikes();
	}
}