<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="name" value="${'cat'}" scope="request"/>
通过JSTL获取名字：
<c:out value="${name }"></c:out><br>
通过EL获取名字：${name}