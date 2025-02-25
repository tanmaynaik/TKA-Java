package com.setuptable;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
			

			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				out.print("<script>alert('login successful')</script>");
//				RequestDispatcher rd = req.getRequestDispatcher("ProfilePage.jsp");
//				rd.include(req, resp);
				
				HttpSession hs = req.getSession();
				hs.setAttribute("fname", rs.getString(2));
				hs.setAttribute("lname", rs.getString(3));
				hs.setAttribute("salary", rs.getString(4));
				hs.setAttribute("role", rs.getString(5));
				hs.setAttribute("join_date", rs.getString(6));
				hs.setAttribute("experience", rs.getString(7));
				hs.setAttribute("city", rs.getString(8));
				hs.setAttribute("country", rs.getString(9));
				hs.setAttribute("email", rs.getString(10));
				hs.setAttribute("mobile", rs.getString(11));
				hs.setAttribute("age", rs.getString(12));
				hs.setAttribute("marital_status", rs.getString(13));
				hs.setAttribute("dob", rs.getString(14));
				resp.sendRedirect("ProfilePage.jsp");
				
			}
			else {
				out.print("<script>alert('login failed')</script>");
			}


			c.close();

		} catch (Exception e) {
			System.out.println("Wrong get out");
		}
	}

}
