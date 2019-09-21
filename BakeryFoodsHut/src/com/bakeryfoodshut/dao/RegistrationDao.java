package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.Registration;

public interface RegistrationDao {

	public void addCustomerInfo(Registration addinfo);

	public boolean checkCustomeremail(String email);

	public void updateCustomer(Registration updateinfo);
	
	public void updateforgetpassword(Registration updateinfo);

	public void deleteCustomer(int deleteinfo);

	public List<Registration> getCustomerList();

	public List<Registration> getcustomerListInfo(String email);

	public String getDistrict(String useremail);
	
	
}
