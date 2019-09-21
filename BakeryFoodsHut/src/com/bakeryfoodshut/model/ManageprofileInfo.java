package com.bakeryfoodshut.model;

public class ManageprofileInfo {

	private int id;
	private String email;
	private String weblink;
	private String openshop;
	private String closeshop;
	private String branch;
	private String policy;
	private String products;
	private String date;
	private String vacation;
	private String img;

	public ManageprofileInfo() {
	}

	public ManageprofileInfo(int id, String email, String weblink, String openshop, String closeshop, String branch,
			String policy, String products, String date,String vacation,String img) {
		super();
		this.id = id;
		this.email = email;
		this.weblink = weblink;
		this.openshop = openshop;
		this.closeshop = closeshop;
		this.branch = branch;
		this.policy = policy;
		this.products = products;
		this.date = date;
		this.vacation=vacation;
		this.img=img;
	}

	public ManageprofileInfo(String website, String openshop, String closeshop, String branch, String policy,
			String products, String date, String useremail) {
		this.weblink = website;
		this.openshop = openshop;
		this.closeshop = closeshop;
		this.branch = branch;
		this.policy = policy;
		this.products = products;
		this.date = date;
		this.email = useremail;
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

	public String getWeblink() {
		return weblink;
	}

	public void setWeblink(String weblink) {
		this.weblink = weblink;
	}

	public String getOpenshop() {
		return openshop;
	}

	public void setOpenshop(String openshop) {
		this.openshop = openshop;
	}

	public String getCloseshop() {
		return closeshop;
	}

	public void setCloseshop(String closeshop) {
		this.closeshop = closeshop;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVacation() {
		return vacation;
	}

	public void setVacation(String vacation) {
		this.vacation = vacation;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
}
