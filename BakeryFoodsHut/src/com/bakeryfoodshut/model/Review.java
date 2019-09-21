package com.bakeryfoodshut.model;

public class Review {

	private int revieId;
	private String rivewShopkeeperemail;
	private int postId;
	private String reiveDes;
	private int rievewStar;
	private String riewDate;
	private String title;
	private String customeremail;

	public Review() {
	}

	public Review(int revieId, String rivewShopkeeperemail, int postId, String reiveDes, int rievewStar,
			String riewDate, String title, String customeremail) {
		super();
		this.revieId = revieId;
		this.rivewShopkeeperemail = rivewShopkeeperemail;
		this.postId = postId;
		this.reiveDes = reiveDes;
		this.rievewStar = rievewStar;
		this.riewDate = riewDate;
		this.title = title;
		this.customeremail = customeremail;
	}

	public int getRevieId() {
		return revieId;
	}

	public void setRevieId(int revieId) {
		this.revieId = revieId;
	}

	public String getRivewShopkeeperemail() {
		return rivewShopkeeperemail;
	}

	public void setRivewShopkeeperemail(String rivewShopkeeperemail) {
		this.rivewShopkeeperemail = rivewShopkeeperemail;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getReiveDes() {
		return reiveDes;
	}

	public void setReiveDes(String reiveDes) {
		this.reiveDes = reiveDes;
	}

	public int getRievewStar() {
		return rievewStar;
	}

	public void setRievewStar(int rievewStar) {
		this.rievewStar = rievewStar;
	}

	public String getRiewDate() {
		return riewDate;
	}

	public void setRiewDate(String riewDate) {
		this.riewDate = riewDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

}
