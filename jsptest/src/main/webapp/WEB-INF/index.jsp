<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	
	<% for (int i= 0; i < 5; i++){ %>
		<h1><%= i %></h1>
		<%} %>
	
	<h3>The Time is: <%= new Date() %></h3>
	<p>
		<c:out value="${name}"/>
	</p>
</body>
</html>