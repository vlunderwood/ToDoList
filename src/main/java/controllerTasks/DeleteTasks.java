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
 * Servlet implementation class DeleteTasks
 */
@WebServlet("/deleteTasks")
public class DeleteTasks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTasks() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaskHelper helper = new TaskHelper();
		String TaskName = request.getParameter("name");
		Tasks deleteThis = helper.searchByTaskName(TaskName);
		helper.delete(deleteThis);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	
	
	}

}
