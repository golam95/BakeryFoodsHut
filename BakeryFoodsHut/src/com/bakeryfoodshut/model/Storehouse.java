package com.bakeryfoodshut.model;

public class Storehouse {

	private int warehouseId;
	private String wareDescription;
	private String month;
	private String year;
	private String price;
	private String date;
	private String email;

	public Storehouse() {

	}

	public Storehouse(int warehouseId, String wareDescription, String month, String year, String price, String date,
			String email) {
		super();
		this.warehouseId = warehouseId;
		this.wareDescription = wareDescription;
		this.month = month;
		this.year = year;
		this.price = price;
		this.date = date;
		this.email = email;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWareDescription() {
		return wareDescription;
	}

	public void setWareDescription(String wareDescription) {
		this.wareDescription = wareDescription;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
