<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="bean.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	Hero hero = new Hero();
	hero.setName("cat");
	hero.setHp(666);
	pageContext.setAttribute("hero",hero);
%>
英雄名字：${hero.name }<br>
英雄血量：${hero.hp}