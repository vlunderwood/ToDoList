package controllerToDoList;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.ToDoListHelper;
import model.ToDoList;

/**
 * Servlet implementation class UpdateToDoList
 */
@WebServlet("/updateToDoList")
public class UpdateToDoList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateToDoList() {
		super();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ToDoListHelper helper = new ToDoListHelper();

		String oldTitle = request.getParameter("oldTitle");
		String title = request.getParameter("newTitle");
		String completed = request.getParameter("completed");

		ToDoList toDoListToUpdate = helper.searchToDoListByTitle(oldTitle);
		toDoListToUpdate.setTitle(title);
		toDoListToUpdate.setCompleted(completed);
		helper.update(toDoListToUpdate);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
