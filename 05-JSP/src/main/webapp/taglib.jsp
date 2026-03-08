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

	<c:set var="a" value="10"></c:set>

	<h2>
		<c:out value="${a}"></c:out>
	</h2>

	<%-- <c:if test="${a==200}">Hii</c:if> --%>
	
	<c:choose>
		<c:when test="${a==100 }">a is equals to 100</c:when>
		<c:when test="${a>100 }">a is greater than 100</c:when>
		<c:otherwise>a is less than 100</c:otherwise>
	</c:choose>

	<%-- <c:redirect url="https://www.wikipedia.org/"></c:redirect> --%>
	
	<c:remove var="a"/>
	
	<h2>
		<c:out value="${a}"></c:out>
	</h2>

</body>
</html>