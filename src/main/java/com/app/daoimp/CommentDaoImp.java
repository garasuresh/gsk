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
	public Comment create(Comment comment) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(comment);
		this.sessionFactory.getCurrentSession().refresh(comment);
		
		return comment;
	}

	@Override
	public Comment update(Comment comment) {
		
		this.sessionFactory.getCurrentSession().saveOrUpdate(comment);
		this.sessionFactory.getCurrentSession().refresh(comment);
		
		return comment;
	}

	@Override
	public List<Comment> list() {
		
		List<Comment> comments = this.sessionFactory.getCurrentSession().createQuery("from comments").list();
		
		return null;
	}

	@Override
	public Comment view(int id) {
		
		Comment comment = (Comment) this.sessionFactory.getCurrentSession().get(Comment.class, id);
		
		return comment;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}
