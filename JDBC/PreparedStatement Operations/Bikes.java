package com.preparedstatementassign;

import java.sql.*;

public class Bikes {
    public void createTable() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("CREATE TABLE IF NOT EXISTS bikes (id INT PRIMARY KEY AUTO_INCREMENT, brand VARCHAR(50), model VARCHAR(50), price INT)");
        ps.executeUpdate();
        System.out.println("Bikes table created successfully");
        c.close();
    }

    public void insertBike() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("INSERT INTO bikes (brand, model, price) VALUES (?, ?, ?)");
        
        ps.setString(1, "Hoonda");
        ps.setString(2, "Activa");
        ps.setInt(3, 170000);
        ps.executeUpdate();
        
        ps.setString(1, "Hero");
        ps.setString(2, "Duet");
        ps.setInt(3, 70000);
        ps.executeUpdate();
        
        System.out.println("Bike inserted successfully");
        c.close();
    }

    public void updateBike() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("UPDATE bikes SET price = ? WHERE brand = ?");
        ps.setInt(1, 1750000);
        ps.setString(2, "Honda");
        ps.executeUpdate();
        System.out.println("Bike updated successfully");
        c.close();
    }

    public void deleteBike() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("DELETE FROM bikes WHERE brand = ?");
        ps.setString(1, "Hoonda");
        ps.executeUpdate();
        System.out.println("Bike deleted successfully");
        c.close();
    }

    public void selectBikes() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("SELECT * FROM bikes");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
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