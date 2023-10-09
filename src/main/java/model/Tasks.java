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
	private String taskCompleted;
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
	public String getTaskCompleted() {
		return taskCompleted;
	}
	public void setTaskCompleted(String taskCompleted) {
		this.taskCompleted = taskCompleted;
	}
	
	public ToDoList getToDoList() {
		return toDoList;
	}

	public void setToDoList(ToDoList toDoList) {
		this.toDoList = toDoList;
	}
	
	public String toString() {
		return  this.name + " Date: " +  this.description + " Completed: " + this.taskCompleted;
	}
	

}
