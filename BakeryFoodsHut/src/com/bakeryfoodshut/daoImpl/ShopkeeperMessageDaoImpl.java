package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.ShopkeeperMessageDao;
import com.bakeryfoodshut.model.ShopkeeperMessage;
import com.bakeryfoodshut.utils.DBconnection;

public class ShopkeeperMessageDaoImpl implements ShopkeeperMessageDao {

	@Override
	public void addMessage(ShopkeeperMessage message) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into shopkeepermessage " + "(shopkeeperemail,customeremail,comment,date,messagerole) "
				+ "values (?, ?, ?, ?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, message.getShopkeeperEmail());
			ps.setString(2, message.getCustomerEmail());
			ps.setString(3, message.getComment());
			ps.setString(4, message.getMessageDate());
			ps.setString(5, message.getStatus());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public List<ShopkeeperMessage> getShopkeeperinfoList(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from shopkeepermessage where shopkeeperemail ='" + email + "'";
		List<ShopkeeperMessage> list = new ArrayList<ShopkeeperMessage>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String useremail = rs.getString("shopkeeperemail");
				String productname = rs.getString("customeremail");
				String comment = rs.getString("comment");
				String date = rs.getString("date");
				String status = rs.getString("messagerole");
				list.add(new ShopkeeperMessage(id, useremail, productname, comment, date, status));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteShopkeeperMessage(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from shopkeepermessage where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateShopkeeperMessage(ShopkeeperMessage quantity) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update shopkeepermessage set messagerole=? where  id=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, quantity.getStatus());
			ps.setInt(2, quantity.getMessageId());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ShopkeeperMessage getManageShopkeeperMessageInfoUpdate(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from shopkeepermessage where id='" + email + "'";
		ShopkeeperMessage list = new ShopkeeperMessage();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String shokeeperemail = rs.getString("shopkeeperemail");
				String customeremail = rs.getString("customeremail");
				String comment = rs.getString("comment");
				String date = rs.getString("date");
				String messagerole = rs.getString("messagerole");
				list = new ShopkeeperMessage(id, shokeeperemail, customeremail, comment, messagerole, date);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
