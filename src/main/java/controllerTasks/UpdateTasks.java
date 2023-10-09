package controllerTasks;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.TaskHelper;
import model.Tasks;

/**
 * Servlet implementation class UpdateTask
 */
@WebServlet("/updateTasks")
public class UpdateTasks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateTasks() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TaskHelper helper = new TaskHelper();

		String oldName = request.getParameter("oldName");
		String name = request.getParameter("name");
		String description  = request.getParameter("description");
		String taskCompleted = request.getParameter("taskCompleted");

		Tasks taskToUpdate = helper.searchByTaskName(oldName);
		taskToUpdate.setName(name);
		taskToUpdate.setDescription(description);
		taskToUpdate.setTaskCompleted(taskCompleted);
		helper.update(taskToUpdate);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
