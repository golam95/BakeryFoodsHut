package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.ReviewDao;
import com.bakeryfoodshut.model.Registration;
import com.bakeryfoodshut.model.Review;
import com.bakeryfoodshut.utils.DBconnection;

public class ReviewDaoImpl implements ReviewDao {

	@Override
	public void addReview(Review review) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into review " + "(shopkeeperemail,postid,description,star,date,title,customeremail) "
				+ "values (?, ?, ?, ?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, review.getRivewShopkeeperemail());
			ps.setInt(2, review.getPostId());
			ps.setString(3, review.getReiveDes());
			ps.setInt(4, review.getRievewStar());
			ps.setString(5, review.getRiewDate());
			ps.setString(6, review.getTitle());
			ps.setString(7, review.getCustomeremail());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@Override
	public boolean checkReview(String email, int postId) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from review where customeremail='" + email + "' and postid='" + postId + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Review> getreviewListInfo(int postId) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from review where postid='" + postId + "'";
		List<Review> list = new ArrayList<Review>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String email = rs.getString("shopkeeperemail");
				String pid = rs.getString("postid");
				String description = rs.getString("description");
				String star = rs.getString("star");
				String date = rs.getString("date");
				String title = rs.getString("title");
				String customeremail = rs.getString("customeremail");
				list.add(new Review(id, email, Integer.parseInt(pid), description, Integer.parseInt(star), date, title,
						customeremail));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Review> getreviewListEmail(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from review where shopkeeperemail='" + email + "'";
		List<Review> list = new ArrayList<Review>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String shopkeeperemail = rs.getString("shopkeeperemail");
				String pid = rs.getString("postid");
				String description = rs.getString("description");
				String star = rs.getString("star");
				String date = rs.getString("date");
				String title = rs.getString("title");
				String customeremail = rs.getString("customeremail");
				list.add(new Review(id, shopkeeperemail, Integer.parseInt(pid), description, Integer.parseInt(star),
						date, title, customeremail));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
