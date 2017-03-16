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
	
	public Comment create(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comment view(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comment update(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Comment> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
