package com.app.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ToDoDao;
import com.app.entities.ToDo;
import com.app.servicesapi.ToDoService;

@Service
public class ToDoServiceImp implements ToDoService{

	@Autowired
	ToDoDao todoDao;
	
	@Override
	public List<ToDo> list() {
		
		List <ToDo> todos = todoDao.list();
		
		return todos;
	}

	@Override
	public ToDo create(ToDo todo) {
		
		ToDo todoObj = todoDao.create(todo);
		
		return todoObj;
	}

	@Override
	public ToDo update(ToDo todo) {
		ToDo todoObj = todoDao.update(todo);
		
		return todoObj;
	}

	@Override
	public ToDo view(int id) {
		
		ToDo todo = todoDao.view(id);
		
		return todo;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}
}
