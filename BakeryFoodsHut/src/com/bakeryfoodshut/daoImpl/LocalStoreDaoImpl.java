package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.LocalStoreDao;
import com.bakeryfoodshut.model.LocalStore;
import com.bakeryfoodshut.model.VanDetails;
import com.bakeryfoodshut.utils.DBconnection;

public class LocalStoreDaoImpl implements LocalStoreDao {

	@Override
	public void addLocalorder(LocalStore addstore) {
		Connection con = DBconnection.getConnecttion();

		String sql = "Insert into localorder " + "(description,quantity,price,email,date,month,year) "
				+ "values (?, ?, ?, ?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, addstore.getDescription());
			ps.setString(2, addstore.getTotalquantity());
			ps.setInt(3, addstore.getPrice());
			ps.setString(4, addstore.getEmail());
			ps.setString(5, addstore.getDate());
			ps.setString(6, addstore.getMonth());
			ps.setString(7, addstore.getYear());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@Override
	public List<LocalStore> getLocalstoreListInfo(String usename) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from localorder where email='" + usename + "'";
		List<LocalStore> list = new ArrayList<LocalStore>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int localid = rs.getInt("id");
				String description = rs.getString("description");
				String quantity = rs.getString("quantity");
				String price = rs.getString("price");
				String email = rs.getString("email");
				String date = rs.getString("date");
				String month = rs.getString("month");
				String year = rs.getString("year");
				list.add(new LocalStore(localid, description, quantity, Integer.parseInt(price), email, date, month,
						year));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public LocalStore getLocalstoreorderInfo(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from localorder where id='" + id + "'";
		LocalStore list = new LocalStore();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int localid = rs.getInt("id");
				String description = rs.getString("description");
				String quantity = rs.getString("quantity");
				String price = rs.getString("price");
				String email = rs.getString("email");
				String date = rs.getString("date");
				String month = rs.getString("month");
				String year = rs.getString("year");
				list = new LocalStore(localid, description, quantity, Integer.parseInt(price), email, date, month,
						year);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deletelocalorder(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from localorder where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatalocalorder(LocalStore updatelocalorder) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update localorder set description=?, quantity=?, price=?,email=?,date=?,month=?,year=? where  id=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, updatelocalorder.getDescription());
			ps.setString(2, updatelocalorder.getTotalquantity());
			ps.setInt(3, updatelocalorder.getPrice());
			ps.setString(4, updatelocalorder.getEmail());
			ps.setString(5, updatelocalorder.getDate());
			ps.setString(6, updatelocalorder.getMonth());
			ps.setString(7, updatelocalorder.getYear());
			ps.setInt(8, updatelocalorder.getId());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<LocalStore> localStorereport(String shopkeepername, String date) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from localorder where email='" + shopkeepername + "' and date='" + date + "'";

		List<LocalStore> list = new ArrayList<LocalStore>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int localid = rs.getInt("id");
				String description = rs.getString("description");
				String quantity = rs.getString("quantity");
				String price = rs.getString("price");
				String email = rs.getString("email");
				String date2 = rs.getString("date");
				String month = rs.getString("month");
				String year = rs.getString("year");
				list.add(new LocalStore(localid, description, quantity, Integer.parseInt(price), email, date2, month,
						year));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<LocalStore> monthlyreportlocalStore(String shopkeepername, String month, String year) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from localorder where email='" + shopkeepername + "' and month='" + month
				+ "' and year='" + year + "'";
		List<LocalStore> list = new ArrayList<LocalStore>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int localid = rs.getInt("id");
				String description = rs.getString("description");
				String quantity = rs.getString("quantity");
				String price = rs.getString("price");
				String email = rs.getString("email");
				String date2 = rs.getString("date");
				String month1 = rs.getString("month");
				String year1 = rs.getString("year");
				list.add(new LocalStore(localid, description, quantity, Integer.parseInt(price), email, date2, month1,
						year1));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<LocalStore> yearlyreportlocalStore(String shopkeepername, String year) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from localorder where email='" + shopkeepername + "' and year='" + year + "'";
		List<LocalStore> list = new ArrayList<LocalStore>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int localid = rs.getInt("id");
				String description = rs.getString("description");
				String quantity = rs.getString("quantity");
				String price = rs.getString("price");
				String email = rs.getString("email");
				String date2 = rs.getString("date");
				String month = rs.getString("month");
				String year2 = rs.getString("year");
				list.add(new LocalStore(localid, description, quantity, Integer.parseInt(price), email, date2, month,
						year2));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
