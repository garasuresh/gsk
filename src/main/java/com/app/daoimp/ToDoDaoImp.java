package com.app.daoimp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ToDoDao;
import com.app.entities.ToDo;

@Transactional
@Repository
public class ToDoDaoImp implements ToDoDao {

	@Autowired
	SessionFactory session;
	
	@Override
	public ToDo create(ToDo todo) {
		
		session.getCurrentSession().save(todo);
		session.getCurrentSession().refresh(todo);
		
		return todo;
	}

	@Override
	public ToDo update(ToDo todo) {
		session.getCurrentSession().saveOrUpdate(todo);
		session.getCurrentSession().flush();
		session.getCurrentSession().refresh(todo);
		
		return todo;
	}

	@Override
	public List<ToDo> list() {
		List<ToDo> todos=  session.getCurrentSession().createQuery("from ToDo").list();
		
		return todos;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ToDo view(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
