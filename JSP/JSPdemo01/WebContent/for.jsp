<%@ page language="java" contentType="text/html;charset=UTF-8" 
pageEncoding="UTF-8" import="java.util.*"%>

<% 
	List<String> words = new ArrayList<String>();
	words.add("hello");
	words.add("hi");
	words.add("good morning");
	words.add("good afternoon");
	words.add("bye bye");
%>
<table width="200px" align="center" border="1px" cellspacing="0">
<% for(String word:words){ %>
<tr>
	<td><%=word %></td>
</tr>
<%}%>
</table>