<%@ page language="java" contentType="text/html;charset=UTF-8" 
pageEncoding="UTF-8" import="java.util.*"%>
<%-- 客户端跳转--%>
<%-- <% response.sendRedirect("hello.jsp");%> --%>
<%-- 服务端跳转 --%>
<%-- <% request.getRequestDispatcher("hello.jsp").forward(request, response);%> --%> 

<%--简化版服务端跳转 --%>
<jsp:forward page="hello.jsp" />