package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.WarehouseDao;
import com.bakeryfoodshut.model.VanDetails;
import com.bakeryfoodshut.model.Storehouse;
import com.bakeryfoodshut.utils.DBconnection;

public class WarehouseDaoImpl implements WarehouseDao {

	@Override
	public void addWarehouse(Storehouse warehouse) {

		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into warehouse " + "(description,month,year,price,date,email) "
				+ "values (?, ?, ?, ?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, warehouse.getWareDescription());
			ps.setString(2, warehouse.getMonth());
			ps.setString(3, warehouse.getYear());
			ps.setString(4, warehouse.getPrice());
			ps.setString(5, warehouse.getDate());
			ps.setString(6, warehouse.getEmail());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

	@Override
	public List<Storehouse> getWarehouseListInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from warehouse where email='" + email + "'";
		List<Storehouse> list = new ArrayList<Storehouse>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String description = rs.getString("description");
				String month = rs.getString("month");
				String year = rs.getString("year");
				String price = rs.getString("price");
				String date = rs.getString("date");
				String warehouseemail = rs.getString("email");
				list.add(new Storehouse(id, description, month, year, price, date, warehouseemail));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteWarehouseDetails(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from warehouse where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
