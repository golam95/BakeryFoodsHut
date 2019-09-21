package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.BFHMessageDao;
import com.bakeryfoodshut.model.BFHMessage;
import com.bakeryfoodshut.model.Bakerymade;
import com.bakeryfoodshut.utils.DBconnection;

public class BFHMessageDaoImpl implements BFHMessageDao {

	@Override
	public void sendMessage(BFHMessage sendmessage) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into bfhmessage " + "(shopkeeperemail,comment,date) " + "values (?, ?, ?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, sendmessage.getShopkeeperemail());
			ps.setString(2, sendmessage.getComment());
			ps.setString(3, sendmessage.getDate());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

	@Override
	public List<BFHMessage> getBFHMessageInfo() {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from bfhmessage";
		List<BFHMessage> list = new ArrayList<BFHMessage>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("shopkeeperemail");
				String email = rs.getString("comment");
				String phone = rs.getString("date");
				list.add(new BFHMessage(id, name, email, phone));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
