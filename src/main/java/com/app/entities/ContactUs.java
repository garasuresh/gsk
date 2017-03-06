package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Table(name="contact_us")
@Entity
public class ContactUs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;

	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="message")
	private String message;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Required
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	@Required
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	@Required
	public void setMessage(String message) {
		this.message = message;
	}
}
