<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update To Do List</title>
    <!-- Include a date picker library (e.g., jQuery UI datepicker) -->
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        // Initialize date picker
        $(function() {
            $("#date").datepicker({ dateFormat: 'yy-mm-dd' });
        });
    </script>
</head>
<body>
    <form action="updateToDoList" method="post">
        New Title: <input type="text" name="newTitle" size="25" /><br>
        New Completed: <input type="text" name="completed" size="25" /><br>
        New Date: <input type="text" id="date" name="date" size="25" /><br>
        Enter the current To Do List Title: <input type="text" name="oldTitle" size="25" /><br>
        <input type="submit" value="Update" />
    </form>
</body>
</html>
