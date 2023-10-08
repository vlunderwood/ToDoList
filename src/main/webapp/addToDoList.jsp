<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add To Do List</title>
</head>
<body>
<form action="addToDoList" method="post">
		Title: <input
			type="text" name="title" size="25"/> 
		
		Completed: <input
			type="text" name="completed" size="25"/> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>