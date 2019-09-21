package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.OrderconfirmDao;
import com.bakeryfoodshut.model.Orderconfirm;
import com.bakeryfoodshut.model.Storehouse;
import com.bakeryfoodshut.utils.DBconnection;

public class OrderconfirmDaoImpl implements OrderconfirmDao {

	@Override
	public void addOrderconfirm(Orderconfirm confirm) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into orderassign " + "(email,orderid,status,date,serviceproviderid) "
				+ "values (?, ?, ?, ?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, confirm.getServicename());
			ps.setInt(2, confirm.getOrderid());
			ps.setString(3, confirm.getStatus());
			ps.setString(4, confirm.getDate());
			ps.setInt(5, confirm.getServiceproviderId());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Orderconfirm> getOrderconfirmListInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from orderassign where email='" + email + "'";
		List<Orderconfirm> list = new ArrayList<Orderconfirm>();
		try {

			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String servicename = rs.getString("email");
				String orderid = rs.getString("orderid");
				String status = rs.getString("status");
				String date = rs.getString("date");
				String serviceproviderid = rs.getString("serviceproviderid");
				list.add(new Orderconfirm(id, servicename, Integer.parseInt(orderid), status, date,
						Integer.parseInt(serviceproviderid)));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateOrderconfirm(Orderconfirm update) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update orderassign set status=? where  id=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, update.getStatus());
			ps.setInt(2, update.getId());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean checkOrdeconfirmId(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from orderassign where serviceproviderid ='" + id + "'";
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
	public void deleteConfirmorder(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from orderassign where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
