<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*" import="domain.Users"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--
		常用标签：
		<c:set></c:set>
		<c:if test=""></c:if>
		<c:forEach></c:forEach>
	--%>
	<!-- 声明一个对象以及对象的值，默认存储到page中，可以自行指定 -->
	<c:set var="name" value="maximus" scope="session"></c:set> ${sessionScope.name }
	<br><br>
	<c:set var="hometown" value="nowhere"></c:set>
	<c:if test="${hometown == 'nowhere' }">
		he don't know where he belonged.
	</c:if>
	<br><br><br>
	<c:forEach begin="1" end="10" var="i">
		${i }
	</c:forEach><br>
	<c:forEach begin="1" end="10" var="i" step="2">
		${i }
	</c:forEach>
	<br><br>
	<%
		List<Users> list = new ArrayList<Users>();
		list.add(new Users("mike",20));
		list.add(new Users("david",22));
		list.add(new Users("nancy",18));
		list.add(new Users("timo",1));
		pageContext.setAttribute("list", list);
	%>
	<c:forEach var="user" items="${list }">
		${user.userName }---------${user.age}
	</c:forEach>
</body>
</html>