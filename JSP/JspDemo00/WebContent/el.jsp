<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("name","page");
		request.setAttribute("name","request");
		session.setAttribute("name","session");
		application.setAttribute("name","application");
	%>
	<br>使用普通方法取值<br>
	<%= pageContext.getAttribute("name") %>
	<%= request.getAttribute("name") %>
	<%= session.getAttribute("name") %>
	<%= application.getAttribute("name") %>
	
	<br>使用EL方法取值<br>
	${pageScope.name }
	${requestScope.name }
	${sessionScope.name }
	${applicationScope.name }
	<br><br><br>
	<%
		String[] a = {"aa","bb","cc"};
		pageContext.setAttribute("array", a);
	%>
	使用el方式取出数组<br>
	${pageScope.array[0] }
	${pageScope.array[1] }
	${pageScope.array[2] }
	<br><br><br>
	<%
		List<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		pageContext.setAttribute("list", list);
	%>
	使用EL表达式取出集合的值<br>
	${pageScope.list[0] } ${pageScope.list[1] } ${pageScope.list[2] }
	<br><br><br>
	<%
		Map map = new HashMap();
		map.put("name","mike");
		map.put("age","89");
		map.put("address","beijing");
		pageContext.setAttribute("map",map);
	%>
	使用EL表达式取出集合的值<br>
	${map.name } ${map.age } ${map.address }
</body>
</html>