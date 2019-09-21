package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.EmployeeInfo;

public interface EmployeeService {

	public void addEmployee(EmployeeInfo employee);

	public List<EmployeeInfo> getEmployeeListInfo(String email);

	public void updateEmployee(EmployeeInfo quantity);

	public List<EmployeeInfo> getEmployeeListexternal(String type);

}
