<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="card p-4 shadow-lg">
            <h2 class="text-center mb-4">Employee Profile</h2>
            <p><strong>First Name: ${fname}</p>
            <p><strong>Last Name:</strong> ${lname}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Mobile:</strong> ${mobile}</p>
            <p><strong>Age:</strong> ${age}</p>
            <p><strong>Date of Birth:</strong> ${dob}</p>
            <p><strong>Marital Status:</strong> ${marital_status}</p>
            <p><strong>City:</strong> ${city}</p>
            <p><strong>Country:</strong> ${country}</p>
            <p><strong>Role:</strong> ${role}</p>
            <p><strong>Salary:</strong> ${salary}</p>
            <p><strong>Join Date:</strong> ${join_date}</p>
            <p><strong>Experience:</strong> ${experience} years</p></strong>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
