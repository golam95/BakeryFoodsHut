package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import com.bakeryfoodshut.dao.ContactDao;
import com.bakeryfoodshut.model.Contact;
import com.bakeryfoodshut.utils.DBconnection;

public class ContactDaoImpl implements ContactDao {

	@Override
	public void addContact(Contact contact) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into contact " + "(name,email,description,date) " + "values (?, ?, ?, ?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, contact.getContactName());
			ps.setString(2, contact.getContactEmail());
			ps.setString(3, contact.getContactDescription());
			ps.setString(4, contact.getContactDate());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}
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
