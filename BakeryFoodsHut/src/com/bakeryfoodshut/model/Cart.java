package com.bakeryfoodshut.model;

public class Cart {
	private int cartId;
	private String shopkeeperEmail;
	private String customerEmail;
	private String productName;
	private String description;
	private int quantity;
	private String price;
	private String cartDate;
	private String weighttype;
	private String discount;

	public Cart() {
	}

	public Cart(int cartId, String shopkeeperEmail, String customerEmail, String productName, String description,
			int quantity, String price, String cartDate, String weighttype,String discount) {
		super();
		this.cartId = cartId;
		this.shopkeeperEmail = shopkeeperEmail;
		this.customerEmail = customerEmail;
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.cartDate = cartDate;
		this.weighttype = weighttype;
		this.discount=discount;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCartDate() {
		return cartDate;
	}

	public void setCartDate(String cartDate) {
		this.cartDate = cartDate;
	}

	public String getWeighttype() {
		return weighttype;
	}

	public void setWeighttype(String weighttype) {
		this.weighttype = weighttype;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

}
