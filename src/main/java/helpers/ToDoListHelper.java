package helpers;

/**
 * @author valei - vlunderwood CIS175 - Fall 2023 Oct 03, 2023
 */

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.ToDoList;



public class ToDoListHelper {
EntityManagerFactory factory = Persistence.createEntityManagerFactory("ToDoList");
	
	//method to add todolist
	public void add(ToDoList model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	//method to delete todolist
	public void delete(ToDoList model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(ToDoList.class, model.getId()));
		manager.getTransaction().commit();
		manager.close();
	}
	  
	//method to search for todolist using JPQL query
	public ToDoList searchToDoListByTitle(String title) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ToDoList> query = manager.createQuery("SELECT i FROM toDoList AS i WHERE i.title = :title", ToDoList.class);
		query.setParameter("title", title);
		ToDoList dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
	
	//method to update todolist
	public void update(ToDoList model) {
		EntityManager manager = factory.createEntityManager();
		ToDoList dbEntity = manager.find(ToDoList.class, model.getId());
		manager.getTransaction().begin();
		dbEntity.setTitle(model.getTitle());
		dbEntity.setCompleted(model.getCompleted());
		manager.getTransaction().commit();
		manager.close();
		
	}
	 
	// method to show todolist using JPQL query
	@SuppressWarnings("unchecked")
	public List<ToDoList> showAllToDoList() {
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM toDoList i");
		List<ToDoList> allItems = q.getResultList();
		manager.close();
		return allItems;
		
	}

}
