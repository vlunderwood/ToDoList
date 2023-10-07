package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "tasks")
@Table(name = "tasks")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskId;
	private String name;
	private String description;
	private boolean taskCompleted;
	@ManyToOne
	@JoinColumn(name = "ID", nullable=false)
	private ToDoList toDoList = new ToDoList();
	
	public Tasks() {
		super();
	}	
	
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isTaskCompleted() {
		return taskCompleted;
	}
	public void setTaskCompleted(boolean taskCompleted) {
		this.taskCompleted = taskCompleted;
	}
	
	public String toString() {
		return  this.name + " Date: " +  this.description + " Completed: " + this.taskCompleted;
	}
	

}
