package com.preparedstatementassign;

import java.sql.*;

public class Teachers {
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("CREATE TABLE IF NOT EXISTS teachers (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), subject VARCHAR(50), experience INT)");
        ps.executeUpdate();
        System.out.println("Teachers table created successfully");
        c.close();
    }

    public void insertTeacher() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("INSERT INTO teachers (name, subject, experience) VALUES (?, ?, ?)");
        
        ps.setString(1, "Dubey ji");
        ps.setString(2, "Mathematics");
        ps.setInt(3, 10);
        ps.executeUpdate();
        
        ps.setString(1, "Sushma");
        ps.setString(2, "English");
        ps.setInt(3, 3);
        ps.executeUpdate();
        
        ps.setString(1, "Deepak");
        ps.setString(2, "Science");
        ps.setInt(3, 6);
        ps.executeUpdate();
        
        ps.setString(1, "Vikas");
        ps.setString(2, "Social Studies");
        ps.setInt(3, 11);
        ps.executeUpdate();
        
        System.out.println("Teachers inserted successfully");
        c.close();
    }

    public void updateTeacher() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("UPDATE teachers SET experience = ? WHERE name = ?");
        ps.setInt(1, 12);
        ps.setString(2, "Dubey ji");
        ps.executeUpdate();
        System.out.println("Teacher updated successfully");
        c.close();
    }

    public void deleteTeacher() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("DELETE FROM teachers WHERE name = ?");
        ps.setString(1, "Deepak");
        ps.executeUpdate();
        System.out.println("Teacher deleted successfully");
        c.close();
    }

    public void selectTeachers() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
        PreparedStatement ps = c.prepareStatement("SELECT * FROM teachers");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
        c.close();
    }
    
    public static void main(String[] args) throws Exception {
        Teachers t = new Teachers();
        
        // Create Table
//        t.createTable();
        
        // Insert Data
//        t.insertTeacher();
        
        // Update Data
//        t.updateTeacher();
        
        // Delete Data
//        t.deleteTeacher();
        
        // Get all Data
        t.selectTeachers();
    }
}