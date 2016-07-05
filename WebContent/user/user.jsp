<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
</head>
<body>
<c:set var="rs" value="${requestScope.allUsers}"/>
	<center>
		<h2>All user</h2>
		<table border="1">
			<tr>
				<th>Username</th>
				<th>Password</th>
			</tr>
			<c:forEach items="${rs}" var="row">
				<tr>
					<td><c:out value="${row.username}"/></td>
					<td><c:out value="${row.password}"/></td>
				</tr>
			</c:forEach>
			
		</table>
	</center>
</body>
</html>