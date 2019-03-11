<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("name", "david");
		session.setAttribute("name","mike");
	%>
	${pageScope.name }
	${name }
	${sessionScope.name }
</body>
</html>