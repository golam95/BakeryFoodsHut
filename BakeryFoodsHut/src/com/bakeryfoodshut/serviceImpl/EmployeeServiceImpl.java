package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.EmployeeDao;
import com.bakeryfoodshut.daoImpl.EmployeeDaoImpl;
import com.bakeryfoodshut.model.EmployeeInfo;
import com.bakeryfoodshut.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao empdao = new EmployeeDaoImpl();

	@Override
	public void addEmployee(EmployeeInfo employee) {
		empdao.addEmployee(employee);

	}

	@Override
	public List<EmployeeInfo> getEmployeeListInfo(String email) {
		return empdao.getEmployeeListInfo(email);
	}

	@Override
	public void updateEmployee(EmployeeInfo quantity) {
		empdao.updateEmployee(quantity);

	}

	@Override
	public List<EmployeeInfo> getEmployeeListexternal(String type) {
		// TODO Auto-generated method stub
		return empdao.getEmployeeListexternal(type);
	}

}
