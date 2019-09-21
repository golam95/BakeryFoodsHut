package com.bakeryfoodshut.model;


public class Feedback {

	private int feebackId;
	private String feebackTopic;
	private String feedbackComment;
	private String feedbackEmail;
	private String feedbackDate;

	public Feedback() {
	}

	public Feedback(int feebackId, String feebackTopic, String feedbackComment, String feedbackEmail,
			String feedbackDate) {
		super();
		this.feebackId = feebackId;
		this.feebackTopic = feebackTopic;
		this.feedbackComment = feedbackComment;
		this.feedbackEmail = feedbackEmail;
		this.feedbackDate = feedbackDate;
	}

	public int getFeebackId() {
		return feebackId;
	}

	public void setFeebackId(int feebackId) {
		this.feebackId = feebackId;
	}

	public String getFeebackTopic() {
		return feebackTopic;
	}

	public void setFeebackTopic(String feebackTopic) {
		this.feebackTopic = feebackTopic;
	}

	public String getFeedbackComment() {
		return feedbackComment;
	}

	public void setFeedbackComment(String feedbackComment) {
		this.feedbackComment = feedbackComment;
	}

	public String getFeedbackEmail() {
		return feedbackEmail;
	}

	public void setFeedbackEmail(String feedbackEmail) {
		this.feedbackEmail = feedbackEmail;
	}

	public String getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(String feedbackDate) {
		this.feedbackDate = feedbackDate;
	}
}
