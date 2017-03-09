package com.app.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CommentDao;
import com.app.entities.Comment;
import com.app.servicesapi.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	CommentDao commentDao; 
	
	@Override
	public Comment create(Comment comment) {
		Comment commentObj = commentDao.create(comment);
		return commentObj;
	}

	@Override
	public Comment view(int id) {
		Comment commentObj = commentDao.view(id);
		
		return commentObj;
	}

	@Override
	public Comment update(Comment comment) {
		Comment commentObj = commentDao.update(comment);
		
		return commentObj;
	}

	@Override
	public List<Comment> list() {
		List <Comment> comments = this.commentDao.list();
		
		return comments;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
