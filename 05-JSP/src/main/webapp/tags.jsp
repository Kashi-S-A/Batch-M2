<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- JSP Tags  -->
	
	<!-- Declaration Tag -->
	<%!
		int a = 10;
		
		public String greet(){
			return "Hello, Good Morning!!!!!!!!!!";
		}	
	%>
	
	<!-- Expression Tag -->
	
	<h1>a : <%= a %></h1>
	
	<h1>greet : <%= greet() %></h1>
	
	<!-- Scriptlet Tag -->
	
	<%
		String s = "Hello";
	
		int a = 101;
		
		if(a%2==0){
			out.print("Even");
		}else{
			out.print("odd");		
		}
	%>
	<br><hr>
	
	<%=s %>

</body>
</html>