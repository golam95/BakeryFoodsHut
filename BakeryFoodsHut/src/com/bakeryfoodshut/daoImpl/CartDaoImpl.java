package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.CartDao;
import com.bakeryfoodshut.model.Cart;
import com.bakeryfoodshut.model.Review;
import com.bakeryfoodshut.utils.DBconnection;

public class CartDaoImpl implements CartDao {

	@Override
	public void addCart(Cart addCart) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into cart "
				+ "(shopkeeperemail,customeremail,productname,description,quantity,price,date,weighttype,discount) "
				+ "values (?, ?, ?, ?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, addCart.getShopkeeperEmail());
			ps.setString(2, addCart.getCustomerEmail());
			ps.setString(3, addCart.getProductName());
			ps.setString(4, addCart.getDescription());
			ps.setInt(5, addCart.getQuantity());
			ps.setString(6, addCart.getPrice());
			ps.setString(7, addCart.getCartDate());
			ps.setString(8, addCart.getWeighttype());
			ps.setString(9, addCart.getDiscount());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@Override
	public boolean checkshopkeeper(String shopkeeperEmail, String customerEmail) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from cart where shopkeeperemail='" + shopkeeperEmail + "' and customeremail='"
				+ customerEmail + "'";
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
	public boolean checkCustomer(String customerEmail) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from cart where customeremail='" + customerEmail + "'";
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
	public List<Cart> getCartListInfo(String username) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from cart where customeremail='" + username + "'";
		List<Cart> list = new ArrayList<Cart>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String shokeeperemail = rs.getString("shopkeeperemail");
				String customeremail = rs.getString("customeremail");
				String productName = rs.getString("productname");
				String description = rs.getString("description");
				String quantity = rs.getString("quantity");
				String price = rs.getString("price");
				String date = rs.getString("date");
				String weighttype = rs.getString("weighttype");
				String discount = rs.getString("discount");
				list.add(new Cart(id, shokeeperemail, customeremail, productName, description,
						Integer.parseInt(quantity), price, date, weighttype, discount));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteCart(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from cart where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCartall(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from cart where customeremail='" + email + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
