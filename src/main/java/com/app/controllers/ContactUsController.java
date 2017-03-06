package com.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.entities.ContactUs;
import com.app.servicesapi.ContactUsService;
import com.google.gson.Gson;

@Controller
@RequestMapping("contact_us")
public class ContactUsController {
	
	@Autowired
	ContactUsService contactUsService;
	
	@RequestMapping(value = "/contactus/{id}", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> view(@PathVariable("id") String id) {
		
		ContactUs contact = this.contactUsService.view(Integer.parseInt(id));
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("contact", contact);
		map.put("status", "200");
		map.put("message", "Successfully retrived contact us");
		
		return map;		
	}
	
	@RequestMapping(value = "/contactus/{id}/view", method = RequestMethod.GET)
	public @ResponseBody ContactUs viewContact(@PathVariable("id") String id) {
		
		ContactUs contact = this.contactUsService.view(Integer.parseInt(id));
		
		return contact;		
	}
	
	@RequestMapping(value="/contactus", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> list()
	{
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<ContactUs> contacts = this.contactUsService.list();
		
		map.put("Status", "200");
		map.put("message", "Successfully retrived");
		map.put("data", contacts);
		
		return map;
	}
	
	@RequestMapping(value="/contactus/list", method = RequestMethod.GET)
	public @ResponseBody List<ContactUs> listView()
	{
		List<ContactUs> contacts = this.contactUsService.list();
		
		return contacts;
	}
	
	@RequestMapping(value="/contactus", method = RequestMethod.POST)
	public @ResponseBody ContactUs create(@RequestBody ContactUs contact_us)
	{
		ContactUs contact = this.contactUsService.create(contact_us);
		
		return contact;
	}
	
	@RequestMapping(value="/contactus/create", method = RequestMethod.POST)
	public ResponseEntity<String> createContact(@RequestBody ContactUs contact_us)
	{
		Gson gson=new Gson();
		
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
		
		ContactUs contact = this.contactUsService.create(contact_us);
		
		return new ResponseEntity<String>(gson.toJson(contact), headers, HttpStatus.CREATED);
	}
	
	/**
	 * Update contact 
	 * 
	 * @param contactUs
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/contacts/{id}", method = RequestMethod.PUT)
	public @ResponseBody ContactUs update(@RequestBody ContactUs contactUs, @PathVariable("id") String id) {
		
		ContactUs contact = this.contactUsService.update(contactUs);
		
		return contact;
		
	}
	
}
