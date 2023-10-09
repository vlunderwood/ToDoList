package model;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "toDoList")
@Table(name = "toDoList")
public class ToDoList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	//private LocalDate date;
	private String completed;
	
	@OneToMany(mappedBy = "toDoList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)

	private List<Tasks> tasks;
	
	public ToDoList() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//public LocalDate getDate() {
	//	return date;
	//}
	//public void setDate(LocalDate date) {
	//	this.date = date;
	//}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	
	public List<Tasks> getTasks() {
		return tasks;
	}

	public void setTasks(List<Tasks> tasks) {
		this.tasks = tasks;
	}
	
	public String toString() {
		//return  this.title + " Date: " +  this.date + " Completed: " + this.completed;
		return  this.title + " Completed: " + this.completed;
	}
	
	

}