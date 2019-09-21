package com.bakeryfoodshut.model;

public class LocalStore {

	private int id;
	private String description;
	private String totalquantity;
	private int price;
	private String email;
	private String date;
	private String month;
	private String year;

	public LocalStore() {

	}

	public LocalStore(int id, String description, String totalquantity, int price, String email, String date,
			String month, String year) {
		super();
		this.id = id;
		this.description = description;
		this.totalquantity = totalquantity;
		this.price = price;
		this.email = email;
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTotalquantity() {
		return totalquantity;
	}

	public void setTotalquantity(String totalquantity) {
		this.totalquantity = totalquantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
