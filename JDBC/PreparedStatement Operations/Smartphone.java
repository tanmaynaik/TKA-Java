package com.preparedstatementassign;

import java.sql.*;

public class Smartphone {
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("CREATE TABLE IF NOT EXISTS smartphone (id INT PRIMARY KEY AUTO_INCREMENT, brand VARCHAR(50), model VARCHAR(50), price DOUBLE)");
        ps.executeUpdate();
        System.out.println("Smartphone table created successfully");
        c.close();
    }

    public void insertSmartphone() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("INSERT INTO smartphone (brand, model, price) VALUES (?, ?, ?)");
        
        
        
        ps.setString(1, "Redmi");
        ps.setString(2, "14 Prime");
        ps.setDouble(3, 14000);
        ps.executeUpdate();
        
        ps.setString(1, "Realme");
        ps.setString(2, "10");
        ps.setDouble(3, 15000);
        ps.executeUpdate();
        
        System.out.println("Smartphone inserted successfully");
        c.close();
    }

    public void updateSmartphone() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("UPDATE smartphone SET price = ? WHERE brand = ?");
        ps.setDouble(1, 30000);
        ps.setString(2, "Redmi");
        ps.executeUpdate();
        System.out.println("Smartphone updated successfully");
        c.close();
    }

    public void deleteSmartphone() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("DELETE FROM smartphone WHERE model = ?");
        ps.setString(1, "S23");
        ps.executeUpdate();
        System.out.println("Smartphone deleted successfully");
        c.close();
    }

    public void selectSmartphones() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("SELECT * FROM smartphone");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
        }
        c.close();
    }
    
    public static void main(String[] args) throws Exception {
        Smartphone s = new Smartphone();
        
        // Create Table
//        s.createTable();
        
        // Insert Data
//        s.insertSmartphone();
        
        // Update Data
//        s.updateSmartphone();
        
        // Delete Data
//        s.deleteSmartphone();
        
        // Get all Data
        s.selectSmartphones();
    }
}
