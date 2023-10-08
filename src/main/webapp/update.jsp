<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Tasks</title>
</head>
<body>


	<form action="updateTasks" method="post">
		New Name: <input type="text" name="name" size="25" />
		New Description: <input type="text" name="description" size="25" /> 
		New Task Completed: <input type="text" name="taskCompleted" size="25" />
		Enter the current task name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>

</body>
</html>