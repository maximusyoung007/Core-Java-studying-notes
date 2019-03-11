<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	it is other04 file<br>
	获取作用域数据<br>
<%= pageContext.getAttribute("name")%><%--pageContext只能作用于原页面，因此不能使用在other04.jsp中 --%>
<%= request.getAttribute("name")%>
<%= session.getAttribute("name")%>
<%= application.getAttribute("name")%>
</body>
</html>