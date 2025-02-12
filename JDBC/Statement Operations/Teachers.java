package com.crudoperations;

import java.sql.*;

public class Teachers {
    public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("CREATE TABLE IF NOT EXISTS teachers (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), subject VARCHAR(50), experience INT)");
        System.out.println("Teachers table created successfully");
        c.close();
    }

    public void insertTeacher() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("INSERT INTO teachers (name, subject, experience) VALUES ('Dubey ji', 'Mathematics', 10)");
        s.executeUpdate("INSERT INTO teachers (name, subject, experience) VALUES ('Sushma', 'English', 3)");
        s.executeUpdate("INSERT INTO teachers (name, subject, experience) VALUES ('Deepak', 'Science', 6)");
        s.executeUpdate("INSERT INTO teachers (name, subject, experience) VALUES ('Vikas', 'Social Studies', 11)");
        System.out.println("Teacher inserted successfully");
        c.close();
    }

    public void updateTeacher() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("UPDATE teachers SET experience=12 WHERE name='Dubey ji'");
        System.out.println("Teacher updated successfully");
        c.close();
    }

    public void deleteTeacher() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        s.executeUpdate("DELETE FROM teachers WHERE name='Deepak'");
        System.out.println("Teacher deleted successfully");
        c.close();
    }
    
    public void selectTeacher() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM teachers");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        c.close();
    }
    
    public static void main(String[] args) throws Exception {
		Teachers t = new Teachers();
		
		//Create Table
//		t.createTable();
		
		//Insert Data
//		t.insertTeacher();
		
		//Delete Data
//		t.deleteTeacher();
		
		//Get Data
		t.selectTeacher();
	}
}