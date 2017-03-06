package com.app.dao;

import java.util.List;

import com.app.entities.ContactUs;

public interface ContactUsDao {
	
	public ContactUs create(ContactUs contact);	
	
	public ContactUs update(ContactUs contact);
	
	public List<ContactUs> list();
	
	public ContactUs view(int id);
	
	public boolean delete();
}
