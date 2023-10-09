<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tasks</title>
</head>
<body>
	List of all ToDoLists and Tasks:
	<table>
		<c:forEach items="${requestScope.allToDoList}" var="currenttoDoList">
			<tr>
				<td>${currenttoDoList.title}|</td>
				<td>${currenttoDoList.completed}</td>

			</tr>
			<c:forEach items="${currentToDoList.Tasks}" var="currenttasks">
				<tr>
					<td>${currenttasks.name}|</td>
					<td>${currenttasks.description}|</td>
					<td>${currenttasks.taskCompleted}</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>