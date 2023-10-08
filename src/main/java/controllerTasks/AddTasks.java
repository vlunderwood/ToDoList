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
 * Servlet implementation class AddTasks
 */
@WebServlet("/addTasks")
public class AddTasks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTasks() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tasks a = new Tasks();
		TaskHelper helper = new TaskHelper();
		a.setName(request.getParameter("name"));
		a.setDescription(request.getParameter("description"));
		a.setTaskCompleted(request.getParameter("taskCompleted"));
		a.getToDoList().setTitle(request.getParameter("toDoListTitle"));
		helper.add(a);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
