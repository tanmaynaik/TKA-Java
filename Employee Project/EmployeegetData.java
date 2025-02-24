package com.setuptable;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/empinfo")
public class EmployeegetData extends HttpServlet{
	
	String fname;
	String lname;
	String salary;
	String role;
	String join_date;
	String experience;
	String city;
	String country;
	String email;
	String mobile;
	String age;
	String marital_status;
	String dob;
	String password;

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Creating object for DB
		SetConnectionEmp se = new SetConnectionEmp();
		
		se.fname = req.getParameter("fname");
		se.lname = req.getParameter("lname");
		se.salary = req.getParameter("salary");
		se.role = req.getParameter("role");
		se.join_date = req.getParameter("join_date");
		se.experience = req.getParameter("experience");
		se.city = req.getParameter("city");
		se.country = req.getParameter("country");
		se.email = req.getParameter("email");
		se.mobile = req.getParameter("mobile");
		se.age = req.getParameter("age");
		se.marital_status = req.getParameter("marital_status");
		se.dob = req.getParameter("dob");
		se.password = req.getParameter("password");
		
		se.insertData();
		
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+"Data Inserted"+"</h1>");
		resp.setContentType("text/html");
		
		RequestDispatcher rd = req.getRequestDispatcher("loginemployee.html");
		rd.include(req, resp);
		
		
	}

}
