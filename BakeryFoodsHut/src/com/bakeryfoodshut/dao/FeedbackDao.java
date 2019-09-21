package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.Feedback;

public interface FeedbackDao {

	public void addFeedback(Feedback feedback);

	public void deleteFeedback(int feedbackId);

	public List<Feedback> getFeedbackList();
}
