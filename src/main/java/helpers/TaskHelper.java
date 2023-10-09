package helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Tasks;

public class TaskHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ToDoList");
	ToDoListHelper toDoListHelper = new ToDoListHelper();

	// method to add tasks
	public void add(Tasks model) {
		EntityManager manager = factory.createEntityManager();
		model.setToDoList(toDoListHelper.searchToDoListByTitle(model.getToDoList().getTitle()));
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();

	}

	// method to delete Task
	public void delete(Tasks model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Tasks.class, model.getTaskId()));
		manager.getTransaction().commit();
		manager.close();
	}

	// method to search for tasks using JPQL query
	public Tasks searchByTaskName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Tasks> query = manager.createQuery("SELECT i FROM tasks AS i WHERE i.name = :name", Tasks.class);
		query.setParameter("name", oldName);
		Tasks dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}

	// method to update tasks
	public void update(Tasks model) {
		EntityManager manager = factory.createEntityManager();
		model.setToDoList(toDoListHelper.searchToDoListByTitle(model.getToDoList().getTitle()));
		Tasks dbEntity = manager.find(Tasks.class, model.getTaskId());
		manager.getTransaction().begin();
		dbEntity.setName(model.getName());
		dbEntity.setDescription(model.getDescription());
		dbEntity.setTaskCompleted(model.getTaskCompleted());
		dbEntity.setToDoList(model.getToDoList());
		manager.getTransaction().commit();
		manager.close();

	}

	// method to show animals using JPQL query
	@SuppressWarnings("unchecked")
	public List<Tasks> showAllTasks() {
		EntityManager manager = factory.createEntityManager();
		List<Tasks> allItems = manager.createQuery("SELECT i FROM tasks i").getResultList();
		manager.close();
		return allItems;

	}

}
