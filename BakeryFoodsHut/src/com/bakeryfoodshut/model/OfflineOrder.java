package com.bakeryfoodshut.model;

public class OfflineOrder {
	private int id;
	private String shopkeeperemail;
	private String customeremail;
	private String ordertype;
	private String trackflag;
	private int totalquantity;
	private String totalprice;
	private String pickuplocation;
	private String pickupdate;
	private String pickuptime;
	private String date;
	private String status;

	public OfflineOrder() {
	}

	public OfflineOrder(int id, String shopkeeperemail, String customeremail, String ordertype, String trackflag,
			int totalquantity, String totalprice, String pickuplocation, String pickupdate, String pickuptime,
			String date, String status) {
		super();
		this.id = id;
		this.shopkeeperemail = shopkeeperemail;
		this.customeremail = customeremail;
		this.ordertype = ordertype;
		this.trackflag = trackflag;
		this.totalquantity = totalquantity;
		this.totalprice = totalprice;
		this.pickuplocation = pickuplocation;
		this.pickupdate = pickupdate;
		this.pickuptime = pickuptime;
		this.date = date;
		this.status = status;
	}

	public OfflineOrder(String status, int id) {
		this.status = status;
		this.id = id;
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

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public String getTrackflag() {
		return trackflag;
	}

	public void setTrackflag(String trackflag) {
		this.trackflag = trackflag;
	}

	public int getTotalquantity() {
		return totalquantity;
	}

	public void setTotalquantity(int totalquantity) {
		this.totalquantity = totalquantity;
	}

	public String getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}

	public String getPickuplocation() {
		return pickuplocation;
	}

	public void setPickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}

	public String getPickupdate() {
		return pickupdate;
	}

	public void setPickupdate(String pickupdate) {
		this.pickupdate = pickupdate;
	}

	public String getPickuptime() {
		return pickuptime;
	}

	public void setPickuptime(String pickuptime) {
		this.pickuptime = pickuptime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
