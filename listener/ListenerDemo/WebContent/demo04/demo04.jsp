<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="domain.Bean02" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	here is demo04
	<%
		Bean02 bean02 = new Bean02();
		bean02.setName("wechat");
		session.setAttribute("bean02",bean02);
	%>
</body>
</html>