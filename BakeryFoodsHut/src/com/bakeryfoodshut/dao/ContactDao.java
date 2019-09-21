package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.Contact;

public interface ContactDao {
	
	public void addContact(Contact contact);

	public void deleteContact(int contactId);

	public List<Contact> getcontactList();
}
