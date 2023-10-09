<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To Do List</title>
</head>
<body>
	<h1>To Do List</h1>
	<form action="showTasks" method="get">
		<input type="submit" value="Show Tasks" />
	</form>
	<a href="update.jsp">Update Tasks</a>
	<a href="delete.jsp">Delete Tasks</a>
	<a href="add.jsp">Add Tasks</a>
	<form action="showToDoList" method="get">
		<input type="submit" value="Show ToDoList" />
	</form>
	<a href="updateToDoList.jsp">Update To Do List</a>
	<a href="deleteToDoList.jsp">Delete To Do List</a>
	<a href="addToDoList.jsp">Add To Do List</a>
</body>
</html>
