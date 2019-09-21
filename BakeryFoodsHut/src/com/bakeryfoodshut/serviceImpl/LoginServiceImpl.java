package com.bakeryfoodshut.serviceImpl;

import com.bakeryfoodshut.dao.LoginDao;
import com.bakeryfoodshut.daoImpl.LoginDaoImpl;
import com.bakeryfoodshut.service.LoginService;

public class LoginServiceImpl implements LoginService {

	LoginDao logindao = new LoginDaoImpl();

	@Override
	public boolean loginAdmin(String username, String password, String role) {
		return logindao.loginAdmin(username, password, role);
	}

	@Override
	public boolean loginCustomer(String username, String password, String role) {
		return logindao.loginCustomer(username, password, role);
	}

	@Override
	public boolean loginHomemade(String username, String password, String role) {
		return logindao.loginHomemade(username, password, role);
	}

	@Override
	public boolean loginBakery(String username, String password, String role) {
		return logindao.loginBakery(username, password, role);
	}

	@Override
	public boolean loginPaidpackage(String username, String password, String role) {
		return logindao.loginPaidpackage(username, password, role);
	}

	@Override
	public boolean checkprofilemanage(String checkemail) {
		return logindao.checkprofilemanage(checkemail);
	}

}
