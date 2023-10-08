package controllerToDoList;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.ToDoListHelper;

import model.ToDoList;


/**
 * Servlet implementation class addToDoList
 */
@WebServlet("/addToDoList")
public class AddToDoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToDoList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ToDoList a = new ToDoList();
		ToDoListHelper helper = new ToDoListHelper();
		a.setTitle(request.getParameter("title"));
		//a.setDate(LocalDate.parse(request.getParameter("date")));
		a.setCompleted(request.getParameter("completed"));
		helper.add(a);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
	
}
