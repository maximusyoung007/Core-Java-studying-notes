<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	it is other05.jsp file<br>
	out----------
<%
	out.write("这是out输出的内容");
%>
<br>
	response--------
<%
	response.getWriter().write("这是response输出的内容");
%>
</body>
</html>