package com.bakeryfoodshut.model;

public class Paidpackage {
	private int paidId;
	private String paidName;
	private String paidPhone;
	private String paidAddress;
	private String paidEmail;
	private String paidShopname;
	private String paidShoplocation;
	private String paidDocument;
	private String paidbkashno;
	private String paidbkashtransactionid;
	private String paidDate;
	private String paidRole;
	private String paidPassowrd;
	private String paidGender;
	private String bakeryDistrict;

	public Paidpackage() {
	}

	public Paidpackage(int paidId, String paidName, String paidPhone, String paidAddress, String paidEmail,
			String paidShopname, String paidShoplocation, String paidDocument, String paidbkashno,
			String paidbkashtransactionid, String paidDate, String paidRole, String paidPassowrd, String paidGender,String bakeryDistrict) {
		super();
		this.paidId = paidId;
		this.paidName = paidName;
		this.paidPhone = paidPhone;
		this.paidAddress = paidAddress;
		this.paidEmail = paidEmail;
		this.paidShopname = paidShopname;
		this.paidShoplocation = paidShoplocation;
		this.paidDocument = paidDocument;
		this.paidbkashno = paidbkashno;
		this.paidbkashtransactionid = paidbkashtransactionid;
		this.paidDate = paidDate;
		this.paidRole = paidRole;
		this.paidPassowrd = paidPassowrd;
		this.paidGender = paidGender;
		this.bakeryDistrict=bakeryDistrict;
	}

	public int getPaidId() {
		return paidId;
	}

	public void setPaidId(int paidId) {
		this.paidId = paidId;
	}

	public String getPaidName() {
		return paidName;
	}

	public void setPaidName(String paidName) {
		this.paidName = paidName;
	}

	public String getPaidPhone() {
		return paidPhone;
	}

	public void setPaidPhone(String paidPhone) {
		this.paidPhone = paidPhone;
	}

	public String getPaidAddress() {
		return paidAddress;
	}

	public void setPaidAddress(String paidAddress) {
		this.paidAddress = paidAddress;
	}

	public String getPaidEmail() {
		return paidEmail;
	}

	public void setPaidEmail(String paidEmail) {
		this.paidEmail = paidEmail;
	}

	public String getPaidShopname() {
		return paidShopname;
	}

	public void setPaidShopname(String paidShopname) {
		this.paidShopname = paidShopname;
	}

	public String getPaidShoplocation() {
		return paidShoplocation;
	}

	public void setPaidShoplocation(String paidShoplocation) {
		this.paidShoplocation = paidShoplocation;
	}

	public String getPaidDocument() {
		return paidDocument;
	}

	public void setPaidDocument(String paidDocument) {
		this.paidDocument = paidDocument;
	}

	public String getPaidbkashno() {
		return paidbkashno;
	}

	public void setPaidbkashno(String paidbkashno) {
		this.paidbkashno = paidbkashno;
	}

	public String getPaidbkashtransactionid() {
		return paidbkashtransactionid;
	}

	public void setPaidbkashtransactionid(String paidbkashtransactionid) {
		this.paidbkashtransactionid = paidbkashtransactionid;
	}

	public String getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}

	public String getPaidRole() {
		return paidRole;
	}

	public void setPaidRole(String paidRole) {
		this.paidRole = paidRole;
	}

	public String getPaidPassowrd() {
		return paidPassowrd;
	}

	public void setPaidPassowrd(String paidPassowrd) {
		this.paidPassowrd = paidPassowrd;
	}

	public String getPaidGender() {
		return paidGender;
	}

	public void setPaidGender(String paidGender) {
		this.paidGender = paidGender;
	}

	public String getBakeryDistrict() {
		return bakeryDistrict;
	}

	public void setBakeryDistrict(String bakeryDistrict) {
		this.bakeryDistrict = bakeryDistrict;
	}
	
}
