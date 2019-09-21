package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.VanDao;
import com.bakeryfoodshut.model.Cart;
import com.bakeryfoodshut.model.VanDetails;
import com.bakeryfoodshut.utils.DBconnection;

public class VanDaoImpl implements VanDao {

	@Override
	public void addVan(VanDetails van) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into van " + "(lisence,description,price,date,email) " + "values (?, ?, ?, ?,?)";
		PreparedStatement ps;

		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, van.getVanlisence());
			ps.setString(2, van.getVanDescription());
			ps.setString(3, van.getVanprice());
			ps.setString(4, van.getVanDate());
			ps.setString(5, van.getVanEmail());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@Override
	public List<VanDetails> getCartListInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from van where email='" + email + "'";
		List<VanDetails> list = new ArrayList<VanDetails>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String lisence = rs.getString("lisence");
				String description = rs.getString("description");
				String price = rs.getString("price");
				String date = rs.getString("date");
				String emaile = rs.getString("email");
				list.add(new VanDetails(id, lisence, description, price, date, emaile));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteVanDetails(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from van where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
