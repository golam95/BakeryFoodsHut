package com.bakeryfoodshut.model;

public class ProfileInfo {
	private int infoId;
	private String infoEmail;
	private String infoWeblink;
	private String infoBranch;
	private String infoProduce;
	private String infoStartbusiness;
	private String infoDate;

	public ProfileInfo() {
	}

	public ProfileInfo(int infoId, String infoEmail, String infoWeblink, String infoBranch, String infoProduce,
			String infoStartbusiness, String infoDate) {
		super();
		this.infoId = infoId;
		this.infoEmail = infoEmail;
		this.infoWeblink = infoWeblink;
		this.infoBranch = infoBranch;
		this.infoProduce = infoProduce;
		this.infoStartbusiness = infoStartbusiness;
		this.infoDate = infoDate;
	}

	public int getInfoId() {
		return infoId;
	}

	public void setInfoId(int infoId) {
		this.infoId = infoId;
	}

	public String getInfoEmail() {
		return infoEmail;
	}

	public void setInfoEmail(String infoEmail) {
		this.infoEmail = infoEmail;
	}

	public String getInfoWeblink() {
		return infoWeblink;
	}

	public void setInfoWeblink(String infoWeblink) {
		this.infoWeblink = infoWeblink;
	}

	public String getInfoBranch() {
		return infoBranch;
	}

	public void setInfoBranch(String infoBranch) {
		this.infoBranch = infoBranch;
	}

	public String getInfoProduce() {
		return infoProduce;
	}

	public void setInfoProduce(String infoProduce) {
		this.infoProduce = infoProduce;
	}

	public String getInfoStartbusiness() {
		return infoStartbusiness;
	}

	public void setInfoStartbusiness(String infoStartbusiness) {
		this.infoStartbusiness = infoStartbusiness;
	}

	public String getInfoDate() {
		return infoDate;
	}

	public void setInfoDate(String infoDate) {
		this.infoDate = infoDate;
	}

}
