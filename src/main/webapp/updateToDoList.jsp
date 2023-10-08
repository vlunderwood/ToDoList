<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update To Do List</title>
</head>
<body>


	<form action="updateToDoList" method="post">
		New Title: <input type="text" name="newTitle" size="25" />
		New Completed: <input type="text" name="completed" size="25" /> 
		Enter the current To Do List Title: <input type="text" name="oldTitle"
			size="25"> <input type="submit" value="Update" />
	</form>
</html>