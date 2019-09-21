package com.bakeryfoodshut.model;

public class Bakerymade {
	private int bakeryId;
	private String bakeryName;
	private String bakeryEmail;
	private String bakeryPhone;
	private String bakeryAddress;
	private String bakeryRole;
	private String bakeryShopname;
	private String bakeryShoplocation;
	private String bakeryDocument;
	private String bakeryDate;
	private String bakeryPassowrd;
	private String bakeryGender;
	private String bakeryDistrict;

	public Bakerymade() {
	}

	public Bakerymade(String bakeryName, String bakeryPassowrd, String bakeryEmail) {
		this.bakeryName = bakeryName;
		this.bakeryPassowrd = bakeryPassowrd;
		this.bakeryEmail = bakeryEmail;
	}

	public Bakerymade(int bakeryId, String bakeryName, String bakeryEmail, String bakeryPhone, String bakeryAddress,
			String bakeryRole, String bakeryShopname, String bakeryShoplocation, String bakeryDocument,
			String bakeryDate, String bakeryPassowrd, String bakeryGender,String bakeryDistrict) {
		super();
		this.bakeryId = bakeryId;
		this.bakeryName = bakeryName;
		this.bakeryEmail = bakeryEmail;
		this.bakeryPhone = bakeryPhone;
		this.bakeryAddress = bakeryAddress;
		this.bakeryRole = bakeryRole;
		this.bakeryShopname = bakeryShopname;
		this.bakeryShoplocation = bakeryShoplocation;
		this.bakeryDocument = bakeryDocument;
		this.bakeryDate = bakeryDate;
		this.bakeryPassowrd = bakeryPassowrd;
		this.bakeryGender = bakeryGender;
		this.bakeryDistrict=bakeryDistrict;
	}

	public int getBakeryId() {
		return bakeryId;
	}

	public void setBakeryId(int bakeryId) {
		this.bakeryId = bakeryId;
	}

	public String getBakeryName() {
		return bakeryName;
	}

	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}

	public String getBakeryEmail() {
		return bakeryEmail;
	}

	public void setBakeryEmail(String bakeryEmail) {
		this.bakeryEmail = bakeryEmail;
	}

	public String getBakeryPhone() {
		return bakeryPhone;
	}

	public void setBakeryPhone(String bakeryPhone) {
		this.bakeryPhone = bakeryPhone;
	}

	public String getBakeryAddress() {
		return bakeryAddress;
	}

	public void setBakeryAddress(String bakeryAddress) {
		this.bakeryAddress = bakeryAddress;
	}

	public String getBakeryRole() {
		return bakeryRole;
	}

	public void setBakeryRole(String bakeryRole) {
		this.bakeryRole = bakeryRole;
	}

	public String getBakeryShopname() {
		return bakeryShopname;
	}

	public void setBakeryShopname(String bakeryShopname) {
		this.bakeryShopname = bakeryShopname;
	}

	public String getBakeryShoplocation() {
		return bakeryShoplocation;
	}

	public void setBakeryShoplocation(String bakeryShoplocation) {
		this.bakeryShoplocation = bakeryShoplocation;
	}

	public String getBakeryDocument() {
		return bakeryDocument;
	}

	public void setBakeryDocument(String bakeryDocument) {
		this.bakeryDocument = bakeryDocument;
	}

	public String getBakeryDate() {
		return bakeryDate;
	}

	public void setBakeryDate(String bakeryDate) {
		this.bakeryDate = bakeryDate;
	}

	public String getBakeryPassowrd() {
		return bakeryPassowrd;
	}

	public void setBakeryPassowrd(String bakeryPassowrd) {
		this.bakeryPassowrd = bakeryPassowrd;
	}

	public String getBakeryGender() {
		return bakeryGender;
	}

	public void setBakeryGender(String bakeryGender) {
		this.bakeryGender = bakeryGender;
	}

	public String getBakeryDistrict() {
		return bakeryDistrict;
	}

	public void setBakeryDistrict(String bakeryDistrict) {
		this.bakeryDistrict = bakeryDistrict;
	}

}
