<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<center>
<h1>Student Form Example</h1><hr>
<table border="2px" bordercolor="blue">
<tr>
<td>Firstname</td><td>${student.firstName}</td>
</tr>
<tr>
<td>Lastname</td><td>${student.lastName}</td>
</tr>
<tr>
<td>Age</td><td>${student.age}</td>
</tr>
<tr>
<td>City</td><td>${student.city}</td>
</tr>
</table>
</center>
</body>
</html>