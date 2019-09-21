package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.FeedbackDao;
import com.bakeryfoodshut.daoImpl.FeedbackDaoImpl;
import com.bakeryfoodshut.model.Feedback;
import com.bakeryfoodshut.service.FeedbackService;

public class FeedbackServiceImpl implements FeedbackService{

	FeedbackDao feedbackDao = new FeedbackDaoImpl();
	
	@Override
	public void addFeedback(Feedback feedback) {
		feedbackDao.addFeedback(feedback);
	}

	@Override
	public void deleteFeedback(int feedbackId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Feedback> getFeedbackList() {
		// TODO Auto-generated method stub
		return null;
	}

}
