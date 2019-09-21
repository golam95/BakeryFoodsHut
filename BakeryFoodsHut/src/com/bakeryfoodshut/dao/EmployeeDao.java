package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.EmployeeInfo;

public interface EmployeeDao {

	public void addEmployee(EmployeeInfo employee);

	public List<EmployeeInfo> getEmployeeListInfo(String email);

	public void updateEmployee(EmployeeInfo quantity);

	public List<EmployeeInfo> getEmployeeListexternal(String type);

}
