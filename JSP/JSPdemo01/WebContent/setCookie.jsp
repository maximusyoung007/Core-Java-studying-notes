<%@ page language="Java" contentType="text/html;charset=UTF-8" 
	pageEncoding="UTF-8" import="javax.servlet.http.Cookie"%>
	
<% 
	Cookie c = new Cookie("name","Gareen");
	c.setPath("/");
	c.setMaxAge(60 * 24 * 60);
	response.addCookie(c);
%>

<a href="getCookie.jsp">跳转到获取cookie的页面</a>