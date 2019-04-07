<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	here is el03.jsp
	<jsp:forward page="el04.jsp">
		<jsp:param value="beijing" name="address"/> 
	</jsp:forward>
</body>
</html>