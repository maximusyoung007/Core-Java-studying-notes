<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	查看控制台是否有如下内容：</br>
	属性被添加了</br>
	属性被替换了</br>
	属性被移除了</br>
	<%
		session.setAttribute("work","nanjing");
		session.setAttribute("work","shenzhen");
		session.removeAttribute("work");
	%>
</body>
</html>