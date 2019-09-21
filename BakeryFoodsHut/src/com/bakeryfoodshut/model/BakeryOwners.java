package com.bakeryfoodshut.model;

public class BakeryOwners {

	private int id;
	private String ownername;
	private String owneremail;
	private String shopkeeperemail;
	private String date;

	public BakeryOwners() {

	}

	public BakeryOwners(int id, String ownername, String owneremail, String shopkeeperemail, String date) {
		super();
		this.id = id;
		this.ownername = ownername;
		this.owneremail = owneremail;
		this.shopkeeperemail = shopkeeperemail;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getOwneremail() {
		return owneremail;
	}

	public void setOwneremail(String owneremail) {
		this.owneremail = owneremail;
	}

	public String getShopkeeperemail() {
		return shopkeeperemail;
	}

	public void setShopkeeperemail(String shopkeeperemail) {
		this.shopkeeperemail = shopkeeperemail;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
