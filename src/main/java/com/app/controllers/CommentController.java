package com.app.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.entities.Comment;
import com.app.servicesapi.CommentService;

@Component
@RequestMapping("/")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@RequestMapping(value="/todos/{id}/comments/create", method=RequestMethod.POST)
	public @ResponseBody Comment create(@PathVariable("id") String id, @RequestBody Comment comment)
	{
		return commentService.create(Integer.parseInt(id), comment);
	}
	
	@RequestMapping(value="/comments/{id}", method=RequestMethod.PUT)
	public @ResponseBody Comment update(@RequestBody Comment comment) {
		
		return commentService.update(comment);
	}
}
