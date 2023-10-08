package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Tasks;
import helpers.TaskHelper;

/**
 * Servlet implementation class AddTasks
 */
@WebServlet("/add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 12L;
         
	/**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tasks a = new Tasks();
		TaskHelper helper = new TaskHelper();
		a.setName(request.getParameter("name"));
		a.setDescription(request.getParameter("description"));
		a.setTaskCompleted(Boolean.parseBoolean(request.getParameter("tasksCompleted")));
		//a.getToDo().setTitle(request.getParameter("toDoTitle"));
		helper.add(a);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
