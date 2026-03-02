<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Custom Tags</h1>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<c:set var="a" value="100"></c:set>

	<h2>
		<c:out value="${a}"></c:out>
	</h2>

	<c:if test="${a==100}">Hii</c:if>


</body>
</html>