package com.bakeryfoodshut.model;

public class ManageQuantity {
	private int id;
	private String email;
	private int quantity;
	private String date;

	public ManageQuantity() {
	}

	public ManageQuantity(int quantity, String date, String email) {
		this.quantity = quantity;
		this.date = date;
		this.email = email;
	}

	public ManageQuantity(int id, String email, int quantity, String date) {
		super();
		this.id = id;
		this.email = email;
		this.quantity = quantity;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
