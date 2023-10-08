<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete To Do List</title>
</head>
<body>

	<form action="deleteToDoList" method="post">
		Enter name of To Do List to delete: <input type="text" name="title"
			size="25"> <input type="submit" value="Delete" />
	</form>
</body>
</html>