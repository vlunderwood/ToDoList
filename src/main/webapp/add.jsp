<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Task</title>
</head>
<body>
	<form action="addTask" method="post">
		To Do List Title:<input
			type="text" name="toDoListTitle" size="25"/> 
		
		Name: <input
			type="text" name="name" size="25"/> 
		z
		Description: <input
			type="text" name="description" size="25"/> 
		
		Task Completed: <input
			type="text" name="taskCompleted" size="25"> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>