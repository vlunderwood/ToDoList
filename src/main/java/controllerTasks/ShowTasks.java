package controllerTasks;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import helpers.TaskHelper;
import model.Tasks;

/**
 * Servlet implementation class ShowTasks
 */
@WebServlet("/showTasks")
public class ShowTasks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowTasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TaskHelper helper = new TaskHelper();

		List<Tasks> taskList = helper.showAllTasks();

		request.setAttribute("allTasks", taskList);

		String path = "/show.jsp";

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
