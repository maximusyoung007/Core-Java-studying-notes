<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//pageContext只能作用于当前页面
	//pageContext.setAttribute("name","gareen");
	
	//作用于一次请求
	//request.setAttribute("name","panda");
	 //response.sendRedirect("getContext.jsp");客户端跳转申请新的请求，无法跳转成功
	
	//作用于一次会话
	//session.setAttribute("name","cat");
	//response.sendRedirect("getContext.jsp");
	
	//作用于全局
	application.setAttribute("name","the old man and the sea");
	System.out.println(application == request.getServletContext());
	response.sendRedirect("getContext.jsp");
%>
<%--<%=pageContext.getAttribute("name")%>--%>
<%--<%=request.getAttribute("name")%>--%>
<%-- <jsp:forward page="getContext.jsp"></jsp:forward> --%>
<%--服务端跳转，还是一次请求--%>