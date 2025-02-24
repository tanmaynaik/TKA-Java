package com.setuptable;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/loginemp")
public class LoginEmployee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "saitama");

			PreparedStatement ps = c.prepareStatement("SELECT * FROM employee WHERE email = ? AND password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			ps.executeQuery();
			
			

			PrintWriter out = resp.getWriter();
			out.print("<script>alert('login successful')</script>");


			c.close();

		} catch (Exception e) {
			System.out.println("Wrong get out");
		}
	}

}
