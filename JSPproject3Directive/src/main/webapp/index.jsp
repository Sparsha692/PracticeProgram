<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directive</title>
</head>
<body>
<h3>This information can be from anywhere.</h3><br>
<%@ include file="retriver.jsp" %>
<hr>
<p>
Current date and time is  = <%= new Date()%>
</p>
</body>
</html>