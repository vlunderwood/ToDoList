<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tasks</title>
</head>
<body>
	List of all Tasks:
	<table>
		<c:forEach items="${requestScope.allTasks}" var="currenttasks">
			<tr>
				<td>${currenttasks.name}|</td>
				<td>${currenttasks.description}|</td>
				<td>${currenttasks.taskCompleted}|</td>
				<td>${currenttasks.toDoList.title}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>


</body>
</html>