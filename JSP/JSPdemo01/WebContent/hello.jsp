<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
你好 JSP
<br>
 
<%=new Date().toLocaleString()%>
<%-- 相当于response.getWriter().println(new Date().toLocaleString() --%>
<br>
<%="hello jsp"%><br>
<% out.print("hello jsp");%><br>

<%@include file="footer.jsp" %> <%--指令include --%>

<jsp:include page="footer.jsp">
    <jsp:param  name="year" value="2017" />
</jsp:include>