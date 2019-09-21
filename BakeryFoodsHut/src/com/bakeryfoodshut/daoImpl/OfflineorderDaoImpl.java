package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.OfflineorderDao;
import com.bakeryfoodshut.model.Homemade;
import com.bakeryfoodshut.model.OfflineOrder;
import com.bakeryfoodshut.utils.DBconnection;

public class OfflineorderDaoImpl implements OfflineorderDao {

	@Override
	public void addOfflineOrder(OfflineOrder offlineorder) {

		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into offlineorder "
				+ "(shopkeeperemail,customeremail,ordertype,tragflag,totalquantity,totalprice,pickuplocation,pickupdate,pickuptime,date,status) "
				+ "values (?, ?, ?, ?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, offlineorder.getShopkeeperemail());
			ps.setString(2, offlineorder.getCustomeremail());
			ps.setString(3, offlineorder.getOrdertype());
			ps.setString(4, offlineorder.getTrackflag());
			ps.setInt(5, offlineorder.getTotalquantity());
			ps.setString(6, offlineorder.getTotalprice());
			ps.setString(7, offlineorder.getPickuplocation());
			ps.setString(8, offlineorder.getPickupdate());
			ps.setString(9, offlineorder.getPickuptime());
			ps.setString(10, offlineorder.getDate());
			ps.setString(11, offlineorder.getStatus());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@Override
	public List<OfflineOrder> getOrderListInfo(String username) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from offlineorder where shopkeeperemail ='" + username + "'";
		List<OfflineOrder> list = new ArrayList<OfflineOrder>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String shopkeeperemail = rs.getString("shopkeeperemail");
				String customeremail = rs.getString("customeremail");
				String ordertype = rs.getString("ordertype");
				String tragetflag = rs.getString("tragflag");
				String totalquality = rs.getString("totalquantity");
				String totalprice = rs.getString("totalprice");
				String pickuplocation = rs.getString("pickuplocation");
				String pickupdate = rs.getString("pickupdate");
				String pickuptime = rs.getString("pickuptime");
				String date = rs.getString("date");
				String status = rs.getString("status");
				list.add(new OfflineOrder(id, shopkeeperemail, customeremail, ordertype, tragetflag,
						Integer.parseInt(totalquality), totalprice, pickuplocation, pickupdate, pickuptime, date,
						status));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteOfflineOrder(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from offlineorder where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public OfflineOrder getOfflineorderInfo(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from offlineorder where id ='" + id + "'";
		OfflineOrder list = new OfflineOrder();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int offid = rs.getInt("id");
				String shopkeeperemail = rs.getString("shopkeeperemail");
				String customeremail = rs.getString("customeremail");
				String ordertype = rs.getString("ordertype");
				String tragetflag = rs.getString("tragflag");
				String totalquality = rs.getString("totalquantity");
				String totalprice = rs.getString("totalprice");
				String pickuplocation = rs.getString("pickuplocation");
				String pickupdate = rs.getString("pickupdate");
				String pickuptime = rs.getString("pickuptime");
				String date = rs.getString("date");
				String status = rs.getString("status");
				list = new OfflineOrder(offid, shopkeeperemail, customeremail, ordertype, tragetflag,
						Integer.parseInt(totalquality), totalprice, pickuplocation, pickupdate, pickuptime, date,
						status);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateOfflineorderstatus(OfflineOrder update) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update offlineorder set status=? where id=?";
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
	public List<OfflineOrder> Offlineorderreport(String shopkeepername, String date) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from offlineorder where shopkeeperemail='" + shopkeepername + "' and date='" + date
				+ "'";
		List<OfflineOrder> list = new ArrayList<OfflineOrder>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String shopkeeperemail = rs.getString("shopkeeperemail");
				String customeremail = rs.getString("customeremail");
				String ordertype = rs.getString("ordertype");
				String tragetflag = rs.getString("tragflag");
				String totalquality = rs.getString("totalquantity");
				String totalprice = rs.getString("totalprice");
				String pickuplocation = rs.getString("pickuplocation");
				String pickupdate = rs.getString("pickupdate");
				String pickuptime = rs.getString("pickuptime");
				String date1 = rs.getString("date");
				String status = rs.getString("status");
				list.add(new OfflineOrder(id, shopkeeperemail, customeremail, ordertype, tragetflag,
						Integer.parseInt(totalquality), totalprice, pickuplocation, pickupdate, pickuptime, date1,
						status));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
