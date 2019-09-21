package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.Feedback;

public interface FeedbackService {

	public void addFeedback(Feedback feedback);

	public void deleteFeedback(int feedbackId);

	public List<Feedback> getFeedbackList();
}
