<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="domain.Bean01" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Bean01 bean = new Bean01();
		bean.setName("nongfuSpring");
		session.setAttribute("bean",bean);
	%>
</body>
</html>