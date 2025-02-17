package com.statementmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LaptopStatement {
	
	public void createTable() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		Statement s = c.createStatement();
		s.execute("CREATE TABLE laptops(id int PRIMARY KEY AUTO_INCREMENT, brand varchar(50), model varchar(50), price int)");
		System.out.println("Table Created");
		
		c.close();
	}
	
	public void insertData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		Statement s = c.createStatement();
		s.execute("INSERT INTO laptops(brand, model, price) VALUES('Acer', 'Aspire 5', 50000), ('Lenevo', 'IdeaPad', 25000), ('Asus', 'Vivobook', 33000)");
		System.out.println("Data Inserted");
		
		c.close();
	}
	
	public void updateData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		Statement s = c.createStatement();
		s.execute("UPDATE laptops SET model='Swift Go' WHERE brand='Acer'");
		System.out.println("Data Updated");
		
		c.close();
	}
	
	public void deleteData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		Statement s = c.createStatement();
		s.execute("DELETE FROM laptops WHERE brand='Asus'");
		System.out.println("Data Deleted");
		
		c.close();
	}
	
	public void  selectData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM laptops");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		
		c.close();
	}

	public static void main(String[] args) throws Exception {
		LaptopStatement ls = new LaptopStatement();
//		ls.createTable();
//		ls.insertData();
//		ls.updateData();
//		ls.deleteData();
		ls.selectData();
		
	}

}
