<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	共有九个内置对象
	四个作用域：pageContext request session application
	out exception page config response
	 --%>
	 使用四个作用域存储数据<br>
<%
	pageContext.setAttribute("name","pageeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	request.setAttribute("name","request");
	session.setAttribute("name","session");
	application.setAttribute("name","application");
%>
	获取作用域数据<br>
<%= pageContext.getAttribute("name")%>
<%= request.getAttribute("name")%>
<%= session.getAttribute("name")%>
<%= application.getAttribute("name")%>
<%--跳转到下一个界面 --%>
<%
	request.getRequestDispatcher("other04.jsp").forward(request, response);
%>
</body>
</html>