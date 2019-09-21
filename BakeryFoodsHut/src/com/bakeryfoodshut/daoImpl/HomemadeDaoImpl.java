package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.HomemadeDao;
import com.bakeryfoodshut.model.Homemade;
import com.bakeryfoodshut.utils.DBconnection;

public class HomemadeDaoImpl implements HomemadeDao {

	@Override
	public void addHomemade(Homemade homemade) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into homemade " + "(name,email,phone,address,role,password,hdate,gender,district) "
				+ "values (?, ?, ?, ?,?,?,?,?,?)";

		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, homemade.getHomeName());
			ps.setString(2, homemade.getHomeEmail());
			ps.setString(3, homemade.getHomePhone());
			ps.setString(4, homemade.getHomeAddress());
			ps.setString(5, homemade.getHoemRole());
			ps.setString(6, homemade.getHomePassword());
			ps.setString(7, homemade.getHomeDate());
			ps.setString(8, homemade.getHomeGender());
			ps.setString(9, homemade.getBakeryDistrict());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public boolean checkEmail(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from homemade where email='" + email + "'";
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
	public List<Homemade> getHomemadeList(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from homemade where email ='" + email + "'";
		List<Homemade> list = new ArrayList<Homemade>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String homemadeemail = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String role = rs.getString("role");
				String password = rs.getString("password");
				String date = rs.getString("hdate");
				String gender = rs.getString("gender");
				String district = rs.getString("district");
				list.add(new Homemade(id, name, homemadeemail, phone, address, role, password, date, gender, district));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Homemade getHomemadeInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from homemade where email ='" + email + "'";
		Homemade list = new Homemade();
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
				String password = rs.getString("password");
				String date = rs.getString("hdate");
				String gender = rs.getString("gender");
				String district = rs.getString("district");
				list = new Homemade(id, name, useremail, phone, address, role, password, date, gender, district);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateHomemade(Homemade homemade) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update homemade set name=?, password=? where  email=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, homemade.getHomeName());
			ps.setString(2, homemade.getHomePassword());
			ps.setString(3, homemade.getHomeEmail());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Homemade> getHomemadeageInfo() {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from homemade";
		List<Homemade> list = new ArrayList<Homemade>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String homemadeemail = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String role = rs.getString("role");
				String password = rs.getString("password");
				String date = rs.getString("hdate");
				String gender = rs.getString("gender");
				String district = rs.getString("district");
				list.add(new Homemade(id, name, homemadeemail, phone, address, role, password, date, gender, district));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Homemade> getHomemadeageInfodistrict(String district) {

		Connection con = DBconnection.getConnecttion();
		String sql = "select * from homemade where district ='" + district + "'";
		List<Homemade> list = new ArrayList<Homemade>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String homemadeemail = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String role = rs.getString("role");
				String password = rs.getString("password");
				String date = rs.getString("hdate");
				String gender = rs.getString("gender");
				String districts = rs.getString("district");
				list.add(
						new Homemade(id, name, homemadeemail, phone, address, role, password, date, gender, districts));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
