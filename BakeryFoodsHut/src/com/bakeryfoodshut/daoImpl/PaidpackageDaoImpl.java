package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.PaidpackageDao;
import com.bakeryfoodshut.model.Homemade;
import com.bakeryfoodshut.model.Paidpackage;
import com.bakeryfoodshut.utils.DBconnection;

public class PaidpackageDaoImpl implements PaidpackageDao {

	@Override
	public void addPaidpackage(Paidpackage paidpackage) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into paidpackage "
				+ "(name,phone,address,email,shopname,shoplocation,document,bkashno,bkashtransactionid,date,role,password,gender,district) "
				+ "values (?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, paidpackage.getPaidName());
			ps.setString(2, paidpackage.getPaidPhone());
			ps.setString(3, paidpackage.getPaidAddress());
			ps.setString(4, paidpackage.getPaidEmail());
			ps.setString(5, paidpackage.getPaidShopname());
			ps.setString(6, paidpackage.getPaidShoplocation());
			ps.setString(7, paidpackage.getPaidDocument());
			ps.setString(8, paidpackage.getPaidbkashno());
			ps.setString(9, paidpackage.getPaidbkashtransactionid());
			ps.setString(10, paidpackage.getPaidDate());
			ps.setString(11, paidpackage.getPaidRole());
			ps.setString(12, paidpackage.getPaidPassowrd());
			ps.setString(13, paidpackage.getPaidGender());
			ps.setString(14, paidpackage.getBakeryDistrict());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public boolean checkEmail(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from paidpackage where email='" + email + "'";
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
	public Paidpackage getPaidpackageInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from paidpackage where email ='" + email + "'";
		Paidpackage list = new Paidpackage();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String paidemail = rs.getString("email");
				String shopname = rs.getString("shopname");
				String shoplocation = rs.getString("shoplocation");
				String document = rs.getString("document");
				String bkashno = rs.getString("bkashno");
				String bkashtransactionid = rs.getString("bkashtransactionid");
				String date = rs.getString("date");
				String role = rs.getString("role");
				String password = rs.getString("password");
				String gender = rs.getString("gender");
				String district = rs.getString("district");
				list = new Paidpackage(id, name, phone, address, paidemail, shopname, shoplocation, document, bkashno,
						bkashtransactionid, date, role, password, gender, district);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Paidpackage> getPaidpackageInfo() {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from paidpackage";
		List<Paidpackage> list = new ArrayList<Paidpackage>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String email = rs.getString("email");
				String shopname = rs.getString("shopname");
				String shoplocation = rs.getString("shoplocation");
				String document = rs.getString("document");
				String bkashno = rs.getString("bkashno");
				String bkashtransaction = rs.getString("bkashtransactionid");
				String date = rs.getString("date");
				String role = rs.getString("role");
				String password = rs.getString("password");
				String gender = rs.getString("gender");
				String district = rs.getString("district");
				list.add(new Paidpackage(id, name, phone, address, email, shopname, shoplocation, document, bkashno,
						bkashtransaction, date, role, password, gender, district));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Paidpackage> getPaidpackageInfodistrict(String district) {

		Connection con = DBconnection.getConnecttion();
		String sql = "select * from paidpackage where district ='" + district + "'";
		List<Paidpackage> list = new ArrayList<Paidpackage>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String email = rs.getString("email");
				String shopname = rs.getString("shopname");
				String shoplocation = rs.getString("shoplocation");
				String document = rs.getString("document");
				String bkashno = rs.getString("bkashno");
				String bkashtransaction = rs.getString("bkashtransactionid");
				String date = rs.getString("date");
				String role = rs.getString("role");
				String password = rs.getString("password");
				String gender = rs.getString("gender");
				String districts = rs.getString("district");
				list.add(new Paidpackage(id, name, phone, address, email, shopname, shoplocation, document, bkashno,
						bkashtransaction, date, role, password, gender, districts));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
