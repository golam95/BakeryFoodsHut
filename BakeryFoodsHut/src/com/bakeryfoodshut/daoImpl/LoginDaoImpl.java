package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bakeryfoodshut.dao.LoginDao;
import com.bakeryfoodshut.utils.DBconnection;

public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean loginAdmin(String username, String password, String role) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from admin where email='" + username + "' and password='" + password + "' and role='"
				+ role + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean loginCustomer(String username, String password, String role) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from registration where remail='" + username + "' and rpassword='" + password
				+ "' and rstatus='" + role + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean loginHomemade(String username, String password, String role) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from homemade where email='" + username + "' and password='" + password + "' and role='"
				+ role + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean loginBakery(String username, String password, String role) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from bakerymade where email='" + username + "' and password='" + password
				+ "' and role='" + role + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean loginPaidpackage(String username, String password, String role) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from paidpackage where email='" + username + "' and password='" + password
				+ "' and role='" + role + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean checkprofilemanage(String checkemail) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from manageprofileinfo where shopkeeperemail='" + checkemail + "'";
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

}
