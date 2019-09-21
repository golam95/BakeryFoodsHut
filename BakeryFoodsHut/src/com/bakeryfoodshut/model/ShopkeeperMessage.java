package com.bakeryfoodshut.model;

public class ShopkeeperMessage {
	private int messageId;
	private String shopkeeperEmail;
	private String customerEmail;
	private String comment;
	private String messageDate;
	private String status;

	public ShopkeeperMessage() {
	}

	public ShopkeeperMessage(String status, int messageId) {
		this.status = status;
		this.messageId = messageId;
	}

	public ShopkeeperMessage(int messageId, String shopkeeperEmail, String customerEmail, String comment,
			String messageDate, String status) {
		super();
		this.messageId = messageId;
		this.shopkeeperEmail = shopkeeperEmail;
		this.customerEmail = customerEmail;
		this.comment = comment;
		this.messageDate = messageDate;
		this.status = status;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getShopkeeperEmail() {
		return shopkeeperEmail;
	}

	public void setShopkeeperEmail(String shopkeeperEmail) {
		this.shopkeeperEmail = shopkeeperEmail;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(String messageDate) {
		this.messageDate = messageDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
