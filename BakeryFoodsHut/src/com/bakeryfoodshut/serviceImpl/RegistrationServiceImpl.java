package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.RegistrationDao;
import com.bakeryfoodshut.daoImpl.RegistrationDaoImpl;
import com.bakeryfoodshut.model.Registration;
import com.bakeryfoodshut.service.RegistrationService;

public class RegistrationServiceImpl implements RegistrationService {

	RegistrationDao registrationDao = new RegistrationDaoImpl();

	@Override
	public void addCustomerInfo(Registration addinfo) {
		registrationDao.addCustomerInfo(addinfo);
	}

	@Override
	public void updateCustomer(Registration updateinfo) {
		registrationDao.updateCustomer(updateinfo);
	}

	@Override
	public void deleteCustomer(int deleteinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Registration> getCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkCustomeremail(String email) {
		return registrationDao.checkCustomeremail(email);
	}

	@Override
	public List<Registration> getcustomerListInfo(String email) {
		return registrationDao.getcustomerListInfo(email);
	}

	@Override
	public String getDistrict(String useremail) {
		return registrationDao.getDistrict(useremail);
	}

	@Override
	public void updateforgetpassword(Registration updateinfo) {
		registrationDao.updateforgetpassword(updateinfo);
	}

}
