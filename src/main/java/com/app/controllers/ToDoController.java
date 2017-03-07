package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.entities.ToDo;
import com.app.servicesapi.ToDoService;

@Controller
@RequestMapping("todos")
public class ToDoController {
	
	@Autowired
	ToDoService todoService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public @ResponseBody List<ToDo> list()
	{
		List<ToDo> list = todoService.list();
		
		return list;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody ToDo create(@RequestBody ToDo todo) {
		
		ToDo todoObj = todoService.create(todo);
		
		return todoObj;
	}
	
	@RequestMapping(value="update/{id}", method=RequestMethod.PUT)
	public @ResponseBody ToDo update(@RequestBody ToDo todo) {
		
		ToDo todoObj = todoService.update(todo);
		
		return todoObj;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ToDo view(String id) {
		
		ToDo todoObj = todoService.view(Integer.parseInt(id));
		
		return todoObj;
	}
	
}
