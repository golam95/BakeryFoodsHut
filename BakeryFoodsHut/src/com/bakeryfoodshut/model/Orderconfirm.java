package com.bakeryfoodshut.model;

public class Orderconfirm {
	private int id;
	private String servicename;
	private int orderid;
	private String status;
	private String date;
	private int serviceproviderId;

	public Orderconfirm() {

	}

	public Orderconfirm(int id, String servicename, int orderid, String status, String date, int serviceproviderId) {
		super();
		this.id = id;
		this.servicename = servicename;
		this.orderid = orderid;
		this.status = status;
		this.date = date;
		this.serviceproviderId = serviceproviderId;
	}

	public Orderconfirm(String status, int id) {
		this.status = status;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getServiceproviderId() {
		return serviceproviderId;
	}

	public void setServiceproviderId(int serviceproviderId) {
		this.serviceproviderId = serviceproviderId;
	}

}
