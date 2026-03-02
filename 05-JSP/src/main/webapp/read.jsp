<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		
			String name = request.getParameter("un");
			String email = request.getParameter("ue");
			String pwd = request.getParameter("pwd");
	
	%>
	
	<h1>User Details</h1>
	<h3>Name : <%=name %></h3>
	<h3>Email : <%=email %></h3>
	
	<hr>
	
	<h1>User Details</h1>
	<h3>Name : <%=request.getParameter("un") %></h3>
	<h3>Email : <%= request.getParameter("ue") %></h3>
	
</body>
</html>