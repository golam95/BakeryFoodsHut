package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.ContactDao;
import com.bakeryfoodshut.daoImpl.ContactDaoImpl;
import com.bakeryfoodshut.model.Contact;
import com.bakeryfoodshut.service.ContactService;


public class ContactServiceImpl implements ContactService {

	ContactDao contactDao = new ContactDaoImpl();
	
	@Override
	public void addContact(Contact contact) {
		contactDao.addContact(contact);
		
	}

	@Override
	public void deleteContact(int contactId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contact> getcontactList() {
		// TODO Auto-generated method stub
		return null;
	}

}
