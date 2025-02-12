package com.crudoperations;

import java.sql.*;

public class Cars {
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("CREATE TABLE IF NOT EXISTS cars (id INT PRIMARY KEY AUTO_INCREMENT, brand VARCHAR(50), model VARCHAR(50), price INT)");
        System.out.println("Cars table created successfully");
        c.close();
    }

    public void insertCar() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("INSERT INTO cars (brand, model, price) VALUES ('Toyota', 'Fortuner', 5000000)");
        s.executeUpdate("INSERT INTO cars (brand, model, price) VALUES ('Tata', 'Safari', 3500000)");
        s.executeUpdate("INSERT INTO cars (brand, model, price) VALUES ('Maruti', 'Brezza', 2500000)");
        s.executeUpdate("INSERT INTO cars (brand, model, price) VALUES ('Mercedes', 'G-Wagon', 30000000)");
        s.executeUpdate("INSERT INTO cars (brand, model, price) VALUES ('Tata', 'Nano', 400000)");
        System.out.println("Car inserted successfully");
        c.close();
    }

    public void updateCar() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("UPDATE cars SET price=3000000 WHERE brand='Toyota'");
        System.out.println("Car updated successfully");
        c.close();
    }

    public void deleteCar() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("DELETE FROM cars WHERE brand='Toyota'");
        System.out.println("Car deleted successfully");
        c.close();
    }

    public void selectCars() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM cars");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
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