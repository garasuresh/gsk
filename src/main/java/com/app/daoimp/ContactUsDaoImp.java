package com.app.daoimp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ContactUsDao;
import com.app.entities.ContactUs;

@Transactional
@Repository
public class ContactUsDaoImp implements ContactUsDao {
	
	@Autowired
	SessionFactory session;
	
	public ContactUs create(ContactUs contact){
		
		session.getCurrentSession().saveOrUpdate(contact);
		session.getCurrentSession().refresh(contact);
		
		return contact;
	}

	public ContactUs update(ContactUs contact) {
		session.getCurrentSession().update(contact);
		session.getCurrentSession().refresh(contact);
		
		return contact;
	}

	public List<ContactUs> list() {
		
		List<ContactUs> contacts = session.getCurrentSession().createQuery("from ContactUs").list();
		
		return contacts;
	}

	public ContactUs view(int id) {
		
		return (ContactUs) this.session.getCurrentSession().get(ContactUs.class, id);
	}

	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}
}
