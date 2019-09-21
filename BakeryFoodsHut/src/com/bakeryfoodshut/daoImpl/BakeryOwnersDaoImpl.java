package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.BakeryOwnersDao;
import com.bakeryfoodshut.model.BakeryOwners;
import com.bakeryfoodshut.utils.DBconnection;

public class BakeryOwnersDaoImpl implements BakeryOwnersDao {

	@Override
	public void addBakeryowner(BakeryOwners bakeryowner) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into bakeryowner " + "(ownername,owneremail,shopkeeperemail,date) "
				+ "values (?, ?, ?, ?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, bakeryowner.getOwnername());
			ps.setString(2, bakeryowner.getOwneremail());
			ps.setString(3, bakeryowner.getShopkeeperemail());
			ps.setString(4, bakeryowner.getDate());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@Override
	public List<BakeryOwners> getBakeryownerListInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from bakeryowner where shopkeeperemail='" + email + "'";
		List<BakeryOwners> list = new ArrayList<BakeryOwners>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String ownername = rs.getString("ownername");
				String owneremail = rs.getString("owneremail");
				String shopkeeperemail = rs.getString("shopkeeperemail");
				String date = rs.getString("date");
				list.add(new BakeryOwners(id, ownername, owneremail, shopkeeperemail, date));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteBakeryownerDetails(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from bakeryowner where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
