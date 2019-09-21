package com.bakeryfoodshut.model;

public class EmployeeInfo {

	private int empId;
	private String empName;
	private String empDesignation;
	private String empAddress;
	private String empGender;
	private String empNid;
	private String empContactno;
	private String empDate;
	private String empStatus;
	private String empemailAddress;

	public EmployeeInfo() {

	}

	public EmployeeInfo(int empId, String empName, String empDesignation, String empAddress, String empGender,
			String empNid, String empContactno, String empDate, String empStatus, String empemailAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empAddress = empAddress;
		this.empGender = empGender;
		this.empNid = empNid;
		this.empContactno = empContactno;
		this.empDate = empDate;
		this.empStatus = empStatus;
		this.empemailAddress = empemailAddress;
	}
	
	public EmployeeInfo(String empStatus,int empId) {
		this.empStatus = empStatus;
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpNid() {
		return empNid;
	}

	public void setEmpNid(String empNid) {
		this.empNid = empNid;
	}

	public String getEmpContactno() {
		return empContactno;
	}

	public void setEmpContactno(String empContactno) {
		this.empContactno = empContactno;
	}

	public String getEmpDate() {
		return empDate;
	}

	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public String getEmpemailAddress() {
		return empemailAddress;
	}

	public void setEmpemailAddress(String empemailAddress) {
		this.empemailAddress = empemailAddress;
	}

}
