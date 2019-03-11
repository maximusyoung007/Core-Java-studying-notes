<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <jsp:include page=""></jsp:include>
	<jsp:param value="" name=""/>
	<jsp:forward page=""></jsp:forward> --%>
	这是JSP_action页面
	<%-- <jsp:include page="other02.jsp"></jsp:include>--%>
	<%-- <jsp:forward page="other02.jsp"></jsp:forward>--%>
	<jsp:forward page="other02.jsp">
		<jsp:param value="北京" name="address"/>
		
	</jsp:forward>
	
</body>
</html>