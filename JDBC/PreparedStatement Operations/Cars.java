package com.preparedstatementassign;

import java.sql.*;

public class Cars {
	public void createTable() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("CREATE TABLE cars (id INT PRIMARY KEY AUTO_INCREMENT, brand VARCHAR(50), model VARCHAR(50), price INT)");
        ps.executeUpdate();
        System.out.println("Cars table created successfully");
        c.close();
    }

    public void insertCar() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("INSERT INTO cars (brand, model, price) VALUES (?, ?, ?)");
        
        ps.setString(1, "Toyota");
        ps.setString(2, "Fortuner");
        ps.setInt(3, 5000000);
        ps.executeUpdate();
        
        ps.setString(1, "Tata");
        ps.setString(2, "Safari");
        ps.setInt(3, 3500000);
        ps.executeUpdate();
        
        System.out.println("Car inserted successfully");
        c.close();
    }

    public void updateCar() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("UPDATE cars SET price = ? WHERE brand = ?");
        ps.setInt(1, 3000000);
        ps.setString(2, "Toyota");
        ps.executeUpdate();
        System.out.println("Car updated successfully");
        c.close();
    }

    public void deleteCar() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("DELETE FROM cars WHERE brand = ?");
        ps.setString(1, "Toyota");
        ps.executeUpdate();
        System.out.println("Car deleted successfully");
        c.close();
    }

    public void selectCars() throws Exception {
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("SELECT * FROM cars");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
        c.close();
	}
    
    public static void main(String[] args) throws Exception {
		Cars c = new Cars();
		
		//Create Table
//		c.createTable();
		
		//Insert Data
//		c.insertCar();
		
		//Update Data
//		c.updateCar();
		
		//Delete Data
//		c.deleteCar();
		
		//Get all Data
		c.selectCars();
	}
}