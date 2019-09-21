package com.bakeryfoodshut.model;

public class BFHMessage {
	private int id;
	private String shopkeeperemail;
	private String comment;
	private String date;

	public BFHMessage() {
	}

	public BFHMessage(int id, String shopkeeperemail, String comment, String date) {
		super();
		this.id = id;
		this.shopkeeperemail = shopkeeperemail;
		this.comment = comment;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShopkeeperemail() {
		return shopkeeperemail;
	}

	public void setShopkeeperemail(String shopkeeperemail) {
		this.shopkeeperemail = shopkeeperemail;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
