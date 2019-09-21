package com.bakeryfoodshut.dao;

public interface LoginDao {

	public boolean loginAdmin(String username, String password, String role);

	public boolean loginCustomer(String username, String password, String role);

	public boolean loginHomemade(String username, String password, String role);

	public boolean loginBakery(String username, String password, String role);

	public boolean loginPaidpackage(String username, String password, String role);

	// check profilemanage

	public boolean checkprofilemanage(String checkemail);
	
}
