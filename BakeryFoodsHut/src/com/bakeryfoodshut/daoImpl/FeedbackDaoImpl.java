package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import com.bakeryfoodshut.dao.FeedbackDao;
import com.bakeryfoodshut.model.Feedback;
import com.bakeryfoodshut.utils.DBconnection;

public class FeedbackDaoImpl implements FeedbackDao {

	@Override
	public void addFeedback(Feedback feedback) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into feedback " + "(ftopic,fcomment,femail,fdate) " + "values (?, ?, ?, ?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, feedback.getFeebackTopic());
			ps.setString(2, feedback.getFeedbackComment());
			ps.setString(3, feedback.getFeedbackEmail());
			ps.setString(4, feedback.getFeedbackDate());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

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
