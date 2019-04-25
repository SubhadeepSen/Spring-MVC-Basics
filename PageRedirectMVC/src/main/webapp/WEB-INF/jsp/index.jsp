<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
<center>
<h2>Page Redirect Example</h2>
<form action="redirectForm" method="get" name="redirect">
<table>
<tr>
<td>Name</td><td><input type="text" name="name"></td>
</tr><tr>
<td>City</td><td><input type="text" name="city"></td>
</tr>
</table>
<br>
<a href="javascript:document.redirect.submit()">Redirect</a>
</form>
<br><br>
<h2>Page Forward Example</h2>
<form action="forwardForm" method="get" name="forward">
<table>
<tr>
<td>Name</td><td><input type="text" name="name"></td>
</tr><tr>
<td>City</td><td><input type="text" name="city"></td>
</tr>
</table>
<br>
<a href="javascript:document.forward.submit()">Forward</a>
</form>
</center>
</body>
</html>