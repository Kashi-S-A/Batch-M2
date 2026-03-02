<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Demo JSP Page</h1>
	
	<h2>Person Details</h2>
	<h4>Name : ${personName}</h4>
	<h4>Age : ${personAge}</h4>
	
	<h2>User Data</h2>
	<h4>Name : ${userData.name}</h4>
	<h4>Email : ${userData.email}</h4>
	<h4>Phone : ${userData.phone}</h4>
	
</body>
</html>