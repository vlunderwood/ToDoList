package helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.ToDoList;



public class ToDoListHelper {
EntityManagerFactory factory = Persistence.createEntityManagerFactory("ToDoList");
	
	public void add(ToDoList model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	
	public void delete(ToDoList model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(ToDoList.class, model.getId()));
		manager.getTransaction().commit();
		manager.close();
	}
	  
	public ToDoList searchToDoListByTitle(String title) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ToDoList> query = manager.createQuery("SELECT i FROM toDoList AS i WHERE i.title = :title", ToDoList.class);
		query.setParameter("title", title);
		ToDoList dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
	 

}
