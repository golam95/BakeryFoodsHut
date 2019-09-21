package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.Review;

public interface ReviewDao {
	
	public void addReview(Review review);
	
	public boolean checkReview(String email,int postId);
	
	public List<Review> getreviewListInfo(int postId);
	
	public List<Review> getreviewListEmail(String email);
	
}
