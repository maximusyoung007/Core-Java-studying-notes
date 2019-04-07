<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="hp" value="${10 }" scope="request"></c:set>
<c:choose>
	<c:when test="${hp < 5 }">
		<p>有危险</p>
	</c:when>
	<c:otherwise>
		<p>没有危险</p>
	</c:otherwise>
</c:choose>
