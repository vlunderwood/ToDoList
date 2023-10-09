<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Tasks</title>
</head>
<body>
    List of all ToDoLists and Tasks:
    <table>
        <c:forEach items="${requestScope.allToDoList}" var="currentToDoList">
            <tr>
                <td>${currentToDoList.title}|</td>
                <td>${currentToDoList.completed}</td>
                <td>${currentToDoList.date}</td>
            </tr>
            <tr>
                <td colspan="3">
                    <ul>
                        <c:forEach items="${currentToDoList.tasks}" var="currentTask">
                            <li>${currentTask.name} - ${currentTask.description} - ${currentTask.taskCompleted}</li>
                        </c:forEach>
                    </ul>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br />
    <a href="index.jsp">Home</a>
</body>
</html>
