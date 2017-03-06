package com.app.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ContactUsDao;
import com.app.entities.ContactUs;
import com.app.servicesapi.ContactUsService;

@Service
public class ContactUsServiceImpl implements ContactUsService{

	@Autowired
	ContactUsDao contactUsDao;
	
	public ContactUs create(ContactUs contactObj) {
		ContactUs contact = contactUsDao.create(contactObj);
		return contact;
	}

	public ContactUs update(ContactUs contact) {
		
		ContactUs contactObj = contactUsDao.update(contact);
		
		return contactObj;
	}

	public List<ContactUs> list() {
		
		return contactUsDao.list();
	}

	public ContactUs view(int id) {
		return contactUsDao.view(id);
	}

	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

}
