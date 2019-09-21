package com.bakeryfoodshut.model;

public class Post {
	private int postId;
	private String shopkeeperEmail;
	private String productName;
	private int postQuantity;
	private String postWeight;
	private String postDiscount;
	private String postProductdes;
	private String postAge;
	private String postDate;
	private String img;
	private String postDistrict;
	private String postArea;
	private String price;
	private String categorytype;
	private String pricetype;

	public Post() {
	}

	public Post(String productname, int productquantity, String weighttype, String discount, String description,
			String consumer, String date, String district, String selectarea, String price,int getid) {
		this.productName = productname;
		this.postQuantity = productquantity;
		this.postWeight = weighttype;
		this.postDiscount = discount;
		this.postProductdes = description;
		this.postAge = consumer;
		this.postDate = date;
		this.postDistrict = district;
		this.postArea = selectarea;
		this.price=price;
		this.postId = getid;
	}
	public Post(int quantity,String email) {
		this.postQuantity=quantity;
		this.shopkeeperEmail=email;
	}
	public Post(int postId, String shopkeeperEmail, String productName, int postQuantity, String postWeight,
			String postDiscount, String postProductdes, String postAge, String postDate, String img,
			String postDistrict, String postArea,String price,String categorytype,String pricetype) {
		super();
		this.postId = postId;
		this.shopkeeperEmail = shopkeeperEmail;
		this.productName = productName;
		this.postQuantity = postQuantity;
		this.postWeight = postWeight;
		this.postDiscount = postDiscount;
		this.postProductdes = postProductdes;
		this.postAge = postAge;
		this.postDate = postDate;
		this.img = img;
		this.postDistrict = postDistrict;
		this.postArea = postArea;
		this.price=price;
		this.categorytype=categorytype;
		this.pricetype=pricetype;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getShopkeeperEmail() {
		return shopkeeperEmail;
	}

	public void setShopkeeperEmail(String shopkeeperEmail) {
		this.shopkeeperEmail = shopkeeperEmail;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPostQuantity() {
		return postQuantity;
	}

	public void setPostQuantity(int postQuantity) {
		this.postQuantity = postQuantity;
	}

	public String getPostWeight() {
		return postWeight;
	}

	public void setPostWeight(String postWeight) {
		this.postWeight = postWeight;
	}

	public String getPostDiscount() {
		return postDiscount;
	}

	public void setPostDiscount(String postDiscount) {
		this.postDiscount = postDiscount;
	}

	public String getPostProductdes() {
		return postProductdes;
	}

	public void setPostProductdes(String postProductdes) {
		this.postProductdes = postProductdes;
	}

	public String getPostAge() {
		return postAge;
	}

	public void setPostAge(String postAge) {
		this.postAge = postAge;
	}

	public String getPostDate() {
		return postDate;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getPostDistrict() {
		return postDistrict;
	}

	public void setPostDistrict(String postDistrict) {
		this.postDistrict = postDistrict;
	}

	public String getPostArea() {
		return postArea;
	}

	public void setPostArea(String postArea) {
		this.postArea = postArea;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategorytype() {
		return categorytype;
	}

	public void setCategorytype(String categorytype) {
		this.categorytype = categorytype;
	}

	public String getPricetype() {
		return pricetype;
	}

	public void setPricetype(String pricetype) {
		this.pricetype = pricetype;
	}
}
