package com.app.dao;

import java.util.List;

import com.app.entities.ToDo;

public interface ToDoDao {
	
	public ToDo create(ToDo todo);
	
	public ToDo update(ToDo todo);
	
	public List<ToDo> list();
	
	public ToDo view(int id);
	
	public boolean delete();
}
