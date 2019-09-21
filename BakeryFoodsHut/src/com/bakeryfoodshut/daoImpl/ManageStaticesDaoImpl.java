package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.ManageStaticesDao;
import com.bakeryfoodshut.model.ManageQuantity;
import com.bakeryfoodshut.model.ManageprofileInfo;
import com.bakeryfoodshut.utils.DBconnection;

public class ManageStaticesDaoImpl implements ManageStaticesDao {

	@Override
	public void addQuantityInfo(ManageQuantity addquantity) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into managequantity " + "(email,mquantity,date) " + "values (?, ?, ?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, addquantity.getEmail());
			ps.setInt(2, addquantity.getQuantity());
			ps.setString(3, addquantity.getDate());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

	@Override
	public void updateQuantity(ManageQuantity quantity) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update managequantity set mquantity=?, date=? where  email=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, quantity.getQuantity());
			ps.setString(2, quantity.getDate());
			ps.setString(3, quantity.getEmail());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean checkQuantity(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from managequantity where email='" + email + "'";
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
	public ManageQuantity getManageQuantityInfoUpdate(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from managequantity where email ='" + email + "'";
		ManageQuantity list = new ManageQuantity();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String shokeeperemail = rs.getString("email");
				int quantity = rs.getInt("mquantity");
				String date = rs.getString("date");
				list = new ManageQuantity(id, shokeeperemail, quantity, date);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ManageQuantity> getManageQuantityInfolist(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from managequantity where email ='" + email + "'";
		List<ManageQuantity> list = new ArrayList<ManageQuantity>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String shokeeperemail = rs.getString("email");
				int quantity = rs.getInt("mquantity");
				String date = rs.getString("date");
				list.add(new ManageQuantity(id, shokeeperemail, quantity, date));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int TotalPost(String email) {
		int postcount = 0;
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from post where shopkeeperemail='" + email + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				postcount++;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return postcount;
	}

	@Override
	public int TotalOrder(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from  offlineorder where shopkeeperemail='" + email + "'";
		int regination = 0;
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String statusemp = rs.getString("status");
				if (statusemp.equals("0")) {
					regination++;
				}
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return regination;
	}

	@Override
	public int RetriveQuantity(String email) {
		int retrivequantity = 0;
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from managequantity where email='" + email + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int quantity = rs.getInt("mquantity");
				retrivequantity = quantity;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retrivequantity;
	}

	@Override
	public int TotalMessage(String email) {
		int messagecount = 0;
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from shopkeepermessage where shopkeeperemail='" + email + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int messagerole = rs.getInt("messagerole");
				if (messagerole == 0) {
					messagecount++;
				}
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return messagecount;
	}

	@Override
	public int TotalMessages(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from shopkeepermessage where shopkeeperemail='" + email + "'";
		int messagecount = 0;
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				messagecount++;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return messagecount;
	}

	@Override
	public int Totalvechile(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from van where email='" + email + "'";
		int messagecount = 0;
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				messagecount++;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return messagecount;
	}

	@Override
	public int Totallocalstoreorder(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from localorder where email='" + email + "'";
		int messagecount = 0;
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				messagecount++;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return messagecount;
	}

	@Override
	public int TotalEmployee(String Status) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from  employee where email='" + Status + "'";
		int employee = 0;
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String statusemp = rs.getString("status");
				if (statusemp.equals("1")) {
					employee++;
				}
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public int TotalResignationemp(String status) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from  employee where email='" + status + "'";
		int regination = 0;
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String statusemp = rs.getString("status");
				if (statusemp.equals("0")) {
					regination++;
				}
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return regination;
	}

}
