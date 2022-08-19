package com.contact.contact_service.service.impl;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> contact = List.of(
				new Contact(1L,"amir@yopmail.com", "Amir", 1L),
				new Contact(2L,"samir@yopmail.com", "Smir", 1L),
				new Contact(3L,"kamir@yopmail.com", "Kamir", 2L),
				new Contact(4L,"lamir@yopmail.com", "Lamir", 3L)
			);
	
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		
		return contact.stream().filter(contact->contact.getUserID().equals(userId)).collect(Collectors.toList());
	}
}
