package com.app.servicesapi;

import java.util.List;
import com.app.entities.ContactUs;

public interface ContactUsService {
	
	public ContactUs create(ContactUs contact);	
	
	public ContactUs update(ContactUs contact);
	
	public List<ContactUs> list();
	
	public ContactUs view(int id);
	
	public boolean delete();
}
