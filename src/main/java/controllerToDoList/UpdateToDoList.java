package controllerToDoList;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.ToDoListHelper;
import model.ToDoList;
import java.time.LocalDate; // Import LocalDate
import java.time.format.DateTimeParseException;

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

        // Parse the date from the request parameter and handle any parsing errors
        LocalDate date = null;
        String dateParam = request.getParameter("date");
        try {
            date = LocalDate.parse(dateParam);
        } catch (DateTimeParseException e) {
            // Handle the parsing error here (e.g., log it or set a default date)
        }

        ToDoList toDoListToUpdate = helper.searchToDoListByTitle(oldTitle);
        toDoListToUpdate.setTitle(title);
        toDoListToUpdate.setCompleted(completed);
        
        // Set the date if it was successfully parsed
        if (date != null) {
            toDoListToUpdate.setDate(date);
        }

        helper.update(toDoListToUpdate);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
