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
	//method to add tasks
		public void add(Tasks model) {
			EntityManager manager = factory.createEntityManager();
			//model.setToDoList(toDoListHelper.searchToDoListByName(model.getToDoList().getTitle()));
			manager.getTransaction().begin();
			manager.persist(model);
			manager.getTransaction().commit();
			manager.close();

		}
		
		
		//method to delete Animal
		//public void delete(Animal model) {
			//EntityManager manager = factory.createEntityManager();
			//manager.getTransaction().begin();
			//manager.remove(manager.find(Animal.class, model.getRowId()));
			//manager.getTransaction().commit();
			//manager.close();
		//}
		
		/*
		 * //method to search for animal using JPQL query public Animal
		 * searchAnimalByAnimalName(String oldName) { EntityManager manager =
		 * factory.createEntityManager(); TypedQuery<Animal> query = manager.
		 * createQuery("SELECT i FROM animals AS i WHERE i.animalName = :animalName",
		 * Animal.class); query.setParameter("animalName", oldName); Animal dbEntity =
		 * query.getSingleResult(); manager.close(); return dbEntity; }
		 * 
		 * //method to show animals using JPQL query
		 * 
		 * @SuppressWarnings("unchecked") public List<Animal> showAllAnimals() {
		 * EntityManager manager = factory.createEntityManager(); List<Animal> allItems
		 * = manager.createQuery("SELECT i FROM animals i").getResultList();
		 * manager.close(); return allItems;
		 * 
		 * }
		 * 
		 * //method to update animals public void update(Animal model) { EntityManager
		 * manager = factory.createEntityManager();
		 * model.setZoo(zooHelper.searchZooByName(model.getZoo().getName())); Animal
		 * dbEntity = manager.find(Animal.class, model.getRowId());
		 * manager.getTransaction().begin();
		 * dbEntity.setAnimalName(model.getAnimalName());
		 * dbEntity.setWeight(model.getWeight()); dbEntity.setLength(model.getLength());
		 * dbEntity.setZoo(model.getZoo()); manager.getTransaction().commit();
		 * manager.close();
		 * 
		 * }
		 */

}
