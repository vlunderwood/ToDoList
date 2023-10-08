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
	
	/*
	 * public void delete(Zoo model) { EntityManager manager =
	 * factory.createEntityManager(); manager.getTransaction().begin();
	 * manager.remove(manager.find(Zoo.class, model.getZooId()));
	 * manager.getTransaction().commit(); manager.close(); }
	 * 
	 * @SuppressWarnings("unchecked") public List<Zoo> showAllZoos() { EntityManager
	 * manager = factory.createEntityManager(); manager.clear(); Query q =
	 * manager.createQuery("SELECT i FROM zoo i"); List<Zoo> allItems =
	 * q.getResultList(); manager.close(); return allItems;
	 * 
	 * }
	 * 
	 * public void update(Zoo model) { EntityManager manager =
	 * factory.createEntityManager(); Zoo dbEntity = manager.find(Zoo.class,
	 * model.getZooId()); manager.getTransaction().begin();
	 * dbEntity.setName(model.getName()); dbEntity.setLocation(model.getLocation());
	 * manager.getTransaction().commit(); manager.close();
	 * 
	 * }
	 * 
	 * public Zoo searchZooByName(String name) { EntityManager manager =
	 * factory.createEntityManager(); TypedQuery<Zoo> query =
	 * manager.createQuery("SELECT i FROM zoo AS i WHERE i.name = :name",
	 * Zoo.class); query.setParameter("name", name); Zoo dbEntity =
	 * query.getSingleResult(); manager.close(); return dbEntity; }
	 */

}
