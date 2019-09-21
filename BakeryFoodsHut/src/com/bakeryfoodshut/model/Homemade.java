package com.bakeryfoodshut.model;

public class Homemade {
	private int homeId;
	private String homeName;
	private String homeEmail;
	private String homePhone;
	private String homeAddress;
	private String hoemRole;
	private String homePassword;
	private String homeDate;
	private String homeGender;
	private String bakeryDistrict;

	public Homemade() {
	}

	public Homemade(String homeName, String homepassword, String homeEmail) {
		this.homeName = homeName;
		this.homePassword = homepassword;
		this.homeEmail = homeEmail;
	}

	public Homemade(int homeId, String homeName, String homeEmail, String homePhone, String homeAddress,
			String hoemRole, String homePassword, String homeDate, String homeGender,String bakeryDistrict) {
		super();
		this.homeId = homeId;
		this.homeName = homeName;
		this.homeEmail = homeEmail;
		this.homePhone = homePhone;
		this.homeAddress = homeAddress;
		this.hoemRole = hoemRole;
		this.homePassword = homePassword;
		this.homeDate = homeDate;
		this.homeGender = homeGender;
		this.bakeryDistrict=bakeryDistrict;
	}

	public int getHomeId() {
		return homeId;
	}

	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}

	public String getHomeName() {
		return homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public String getHomeEmail() {
		return homeEmail;
	}

	public void setHomeEmail(String homeEmail) {
		this.homeEmail = homeEmail;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getHoemRole() {
		return hoemRole;
	}

	public void setHoemRole(String hoemRole) {
		this.hoemRole = hoemRole;
	}

	public String getHomePassword() {
		return homePassword;
	}

	public void setHomePassword(String homePassword) {
		this.homePassword = homePassword;
	}

	public String getHomeDate() {
		return homeDate;
	}

	public void setHomeDate(String homeDate) {
		this.homeDate = homeDate;
	}

	public String getHomeGender() {
		return homeGender;
	}

	public void setHomeGender(String homeGender) {
		this.homeGender = homeGender;
	}

	public String getBakeryDistrict() {
		return bakeryDistrict;
	}

	public void setBakeryDistrict(String bakeryDistrict) {
		this.bakeryDistrict = bakeryDistrict;
	}

}
