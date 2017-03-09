package com.app.dao;

import java.util.List;

import com.app.entities.Comment;

public interface CommentDao {
	
	public Comment create();
	
	public Comment update(Comment comment);
	
	public List<Comment> list();
	
	public Comment view(int id);
	
	public boolean delete(int id);	
}
