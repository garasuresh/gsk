package com.app.servicesapi;

import java.util.List;

import com.app.entities.ToDo;

public interface ToDoService {
	
	public List<ToDo> list();
	
	public ToDo create(ToDo todo);
	
	public ToDo update(ToDo todo);
	
	public ToDo view(int id);
	
	public boolean delete();
}
