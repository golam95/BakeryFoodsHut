package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);

	public void deleteContact(int contactId);

	public List<Contact> getcontactList();
}
