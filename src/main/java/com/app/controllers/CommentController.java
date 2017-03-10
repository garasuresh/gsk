package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.entities.Comment;
import com.app.servicesapi.CommentService;

@Component
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody Comment create(@RequestBody Comment comment)
	{
		return commentService.create(comment);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public @ResponseBody Comment update(@RequestBody Comment comment) {
		
		return commentService.update(comment);
	}
}
