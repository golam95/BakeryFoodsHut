package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.ReviewDao;
import com.bakeryfoodshut.daoImpl.ReviewDaoImpl;
import com.bakeryfoodshut.model.Registration;
import com.bakeryfoodshut.model.Review;
import com.bakeryfoodshut.service.ReviewService;

public class ReviewServiceImpl implements ReviewService {

	ReviewDao reviewdao = new ReviewDaoImpl();

	@Override
	public void addReview(Review review) {
		reviewdao.addReview(review);
	}

	@Override
	public boolean checkReview(String email, int postId) {
		return reviewdao.checkReview(email, postId);
	}

	@Override
	public List<Review> getReviewListInfo(int postId) {
		return reviewdao.getreviewListInfo(postId);
	}

	@Override
	public List<Review> getreviewListEmail(String email) {
		return reviewdao.getreviewListEmail(email);
	}
}
