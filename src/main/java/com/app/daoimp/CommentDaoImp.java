package com.app.daoimp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import com.app.dao.CommentDao;
import com.app.entities.Comment;

@Transactional
@Repository
public class CommentDaoImp implements CommentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Comment create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment update(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment view(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
