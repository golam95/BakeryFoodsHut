package com.bakeryfoodshut.model;

public class Registration {

	private int regId;
	private String regusername;
	private String reguserEmail;
	private String reguserPassword;
	private String reguserGender;
	private String reguserStatus;
	private String reguserDate;
	private String regdistrict;
	private String regaddress;

	public Registration() {
	}

	public Registration(int regId, String regusername, String reguserEmail, String reguserPassword,
			String reguserGender, String reguserStatus, String reguserDate, String regdistrict, String regaddress) {
		super();
		this.regId = regId;
		this.regusername = regusername;
		this.reguserEmail = reguserEmail;
		this.reguserPassword = reguserPassword;
		this.reguserGender = reguserGender;
		this.reguserStatus = reguserStatus;
		this.reguserDate = reguserDate;
		this.regdistrict = regdistrict;
		this.regaddress = regaddress;
	}

	public Registration(String username, String reguserPassword, String regaddress, String useremail) {
		this.regusername = username;
		this.reguserPassword = reguserPassword;
		this.regaddress = regaddress;
		this.reguserEmail = useremail;
	}

	public Registration(String userpassword, String useremail) {
		this.reguserPassword = userpassword;
		this.reguserEmail = useremail;
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getRegusername() {
		return regusername;
	}

	public void setRegusername(String regusername) {
		this.regusername = regusername;
	}

	public String getReguserEmail() {
		return reguserEmail;
	}

	public void setReguserEmail(String reguserEmail) {
		this.reguserEmail = reguserEmail;
	}

	public String getReguserPassword() {
		return reguserPassword;
	}

	public void setReguserPassword(String reguserPassword) {
		this.reguserPassword = reguserPassword;
	}

	public String getReguserGender() {
		return reguserGender;
	}

	public void setReguserGender(String reguserGender) {
		this.reguserGender = reguserGender;
	}

	public String getReguserStatus() {
		return reguserStatus;
	}

	public void setReguserStatus(String reguserStatus) {
		this.reguserStatus = reguserStatus;
	}

	public String getReguserDate() {
		return reguserDate;
	}

	public void setReguserDate(String reguserDate) {
		this.reguserDate = reguserDate;
	}

	public String getRegdistrict() {
		return regdistrict;
	}

	public void setRegdistrict(String regdistrict) {
		this.regdistrict = regdistrict;
	}

	public String getRegaddress() {
		return regaddress;
	}

	public void setRegaddress(String regaddress) {
		this.regaddress = regaddress;
	}
}
