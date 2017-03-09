package com.app.servicesapi;

import java.util.List;

import com.app.entities.Comment;

public interface CommentService {
	
	public Comment create(Comment comment);
	
	public Comment view(int id);
	
	public Comment update(Comment comment);
	
	public List<Comment> list();
	
	public boolean delete(int id);
}
