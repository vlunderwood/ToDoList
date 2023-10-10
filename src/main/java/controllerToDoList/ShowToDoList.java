package controllerToDoList;

/**
 * @author valei - vlunderwood CIS175 - Fall 2023 Oct 08, 2023
 */

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.ToDoListHelper;
import model.ToDoList;


/**
 * Servlet implementation class ShowToDoList
 */
@WebServlet("/showToDoList")
public class ShowToDoList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowToDoList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ToDoListHelper helper = new ToDoListHelper();

		List<ToDoList> toDoListList = helper.showAllToDoList();

		request.setAttribute("allToDoList", toDoListList);

		String path = "/showToDoList.jsp";

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
