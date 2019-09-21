package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.ManageprofileInfoDao;
import com.bakeryfoodshut.model.ManageprofileInfo;
import com.bakeryfoodshut.utils.DBconnection;

public class ManageprofileInfoDaoImpl implements ManageprofileInfoDao {

	@Override
	public void addManageprofileInfo(ManageprofileInfo profile) {
		Connection con = DBconnection.getConnecttion();
		String sql = "insert into manageprofileinfo "
				+ "(shopkeeperemail,weblink,openshop,closeshop,branch,policy,products,date,vacation,profileimg) "
				+ "values (?, ?, ?, ?,?, ?, ?, ?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, profile.getEmail());
			ps.setString(2, profile.getWeblink());
			ps.setString(3, profile.getOpenshop());
			ps.setString(4, profile.getCloseshop());
			ps.setString(5, profile.getBranch());
			ps.setString(6, profile.getPolicy());
			ps.setString(7, profile.getProducts());
			ps.setString(8, profile.getDate());
			ps.setString(9, profile.getVacation());
			ps.setString(10, profile.getImg());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public boolean checkweblink(String weblink) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from profileinfo where weblink='" + weblink + "'";
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
	public boolean checkbranch(String branch) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from profileinfo where branch='" + branch + "'";
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
	public boolean checkEmail(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from manageprofileinfo where shopkeeperemail='" + email + "'";
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
	public List<ManageprofileInfo> getManageprofileinfoList(String email) {

		Connection con = DBconnection.getConnecttion();
		String sql = "select * from manageprofileinfo where shopkeeperemail ='" + email + "'";
		List<ManageprofileInfo> list = new ArrayList<ManageprofileInfo>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String shokeeperemail = rs.getString("shopkeeperemail");
				String weblink = rs.getString("weblink");
				String openshop = rs.getString("openshop");
				String closeshop = rs.getString("closeshop");
				String branch = rs.getString("branch");
				String policy = rs.getString("policy");
				String products = rs.getString("products");
				String date = rs.getString("date");

				String vaction = rs.getString("vacation");
				String profileimg = rs.getString("profileimg");
				list.add(new ManageprofileInfo(id, shokeeperemail, weblink, openshop, closeshop, branch, policy,
						products, date, vaction, profileimg));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ManageprofileInfo getManageprofileInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from manageprofileinfo where shopkeeperemail ='" + email + "'";
		ManageprofileInfo list = new ManageprofileInfo();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String useremail = rs.getString("shopkeeperemail");
				String weblink = rs.getString("weblink");
				String openshop = rs.getString("openshop");
				String closeshop = rs.getString("closeshop");
				String branch = rs.getString("branch");
				String policy = rs.getString("policy");
				String products = rs.getString("products");
				String date = rs.getString("date");
				String vaction = rs.getString("vacation");
				String profileimg = rs.getString("profileimg");
				list = new ManageprofileInfo(id, useremail, weblink, openshop, closeshop, branch, policy, products,
						date, vaction, profileimg);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateManageprofileInfo(ManageprofileInfo manageprofile) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update manageprofileinfo set weblink=?, openshop=?, closeshop=?,branch=?,policy=?,products=?,date=? where  shopkeeperemail=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, manageprofile.getWeblink());
			ps.setString(2, manageprofile.getOpenshop());
			ps.setString(3, manageprofile.getCloseshop());
			ps.setString(4, manageprofile.getBranch());
			ps.setString(5, manageprofile.getPolicy());
			ps.setString(6, manageprofile.getProducts());
			ps.setString(7, manageprofile.getDate());
			ps.setString(8, manageprofile.getEmail());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
