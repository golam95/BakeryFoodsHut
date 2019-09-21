package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.BakerymadeDao;
import com.bakeryfoodshut.model.Bakerymade;
import com.bakeryfoodshut.model.Cart;
import com.bakeryfoodshut.utils.DBconnection;

public class BakerymadeDaoImpl implements BakerymadeDao {

	@Override
	public void addBakerymade(Bakerymade bakerymade) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into bakerymade "
				+ "(name,email,phone,address,role,shopname,shoplocation,document,date,password,gender,district) "
				+ "values (?, ?, ?, ?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, bakerymade.getBakeryName());
			ps.setString(2, bakerymade.getBakeryEmail());
			ps.setString(3, bakerymade.getBakeryPhone());
			ps.setString(4, bakerymade.getBakeryAddress());
			ps.setString(5, bakerymade.getBakeryRole());
			ps.setString(6, bakerymade.getBakeryShopname());
			ps.setString(7, bakerymade.getBakeryShoplocation());
			ps.setString(8, bakerymade.getBakeryDocument());
			ps.setString(9, bakerymade.getBakeryDate());
			ps.setString(10, bakerymade.getBakeryPassowrd());
			ps.setString(11, bakerymade.getBakeryGender());
			ps.setString(12, bakerymade.getBakeryDistrict());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@Override
	public boolean checkEmail(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from bakerymade where email='" + email + "'";
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
	public Bakerymade getBakerymadeInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from bakerymade where email ='" + email + "'";
		Bakerymade list = new Bakerymade();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String useremail = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String role = rs.getString("role");
				String shopname = rs.getString("shopname");
				String shoplocation = rs.getString("shoplocation");
				String document = rs.getString("document");
				String date = rs.getString("date");
				String password = rs.getString("password");
				String gender = rs.getString("gender");
				String district = rs.getString("district");
				list = new Bakerymade(id, name, useremail, phone, address, role, shopname, shoplocation, document, date,
						password, gender, district);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateBakerymade(Bakerymade bakerymade) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update bakerymade set name=?, password=? where  email=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, bakerymade.getBakeryName());
			ps.setString(2, bakerymade.getBakeryPassowrd());
			ps.setString(3, bakerymade.getBakeryEmail());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Bakerymade> getBakeryMadeInfo() {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from bakerymade";
		List<Bakerymade> list = new ArrayList<Bakerymade>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String role = rs.getString("role");
				String shopname = rs.getString("shopname");
				String shoplocation = rs.getString("shoplocation");
				String document = rs.getString("document");
				String date = rs.getString("date");
				String password = rs.getString("password");
				String gender = rs.getString("gender");
				String district = rs.getString("district");
				list.add(new Bakerymade(id, name, email, phone, address, role, shopname, shoplocation, document, date,
						password, gender, district));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Bakerymade> getBakeryMadeInfodistrict(String district) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from bakerymade where district ='" + district + "'";
		List<Bakerymade> list = new ArrayList<Bakerymade>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String role = rs.getString("role");
				String shopname = rs.getString("shopname");
				String shoplocation = rs.getString("shoplocation");
				String document = rs.getString("document");
				String date = rs.getString("date");
				String password = rs.getString("password");
				String gender = rs.getString("gender");
				String districts = rs.getString("district");
				list.add(new Bakerymade(id, name, email, phone, address, role, shopname, shoplocation, document, date,
						password, gender, districts));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
