package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.Review;

public interface ReviewService {
	
	public void addReview(Review review);
	
	public boolean checkReview(String email,int postId);
	
	public List<Review> getReviewListInfo(int postId);
	
	public List<Review> getreviewListEmail(String email);
}
