package com.bakeryfoodshut.model;

public class VanDetails {
	private int vanId;
	private String vanlisence;
	private String vanDescription;
	private String vanprice;
	private String vanDate;
	private String vanEmail;

	public VanDetails() {

	}

	public VanDetails(int vanId, String vanlisence, String vanDescription, String vanprice, String vanDate,
			String vanEmail) {
		super();
		this.vanId = vanId;
		this.vanlisence = vanlisence;
		this.vanDescription = vanDescription;
		this.vanprice = vanprice;
		this.vanDate = vanDate;
		this.vanEmail = vanEmail;
	}

	public int getVanId() {
		return vanId;
	}

	public void setVanId(int vanId) {
		this.vanId = vanId;
	}

	public String getVanlisence() {
		return vanlisence;
	}

	public void setVanlisence(String vanlisence) {
		this.vanlisence = vanlisence;
	}

	public String getVanDescription() {
		return vanDescription;
	}

	public void setVanDescription(String vanDescription) {
		this.vanDescription = vanDescription;
	}

	public String getVanprice() {
		return vanprice;
	}

	public void setVanprice(String vanprice) {
		this.vanprice = vanprice;
	}

	public String getVanDate() {
		return vanDate;
	}

	public void setVanDate(String vanDate) {
		this.vanDate = vanDate;
	}

	public String getVanEmail() {
		return vanEmail;
	}

	public void setVanEmail(String vanEmail) {
		this.vanEmail = vanEmail;
	}

}
