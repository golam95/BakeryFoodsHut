package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.RegistrationDao;
import com.bakeryfoodshut.model.Post;
import com.bakeryfoodshut.model.Registration;
import com.bakeryfoodshut.utils.DBconnection;

public class RegistrationDaoImpl implements RegistrationDao {

	@Override
	public void addCustomerInfo(Registration addinfo) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into registration " + "(rname,remail,rpassword,rgender,rstatus,rdate,district,address) "
				+ "values (?, ?, ?, ?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, addinfo.getRegusername());
			ps.setString(2, addinfo.getReguserEmail());
			ps.setString(3, addinfo.getReguserPassword());
			ps.setString(4, addinfo.getReguserGender());
			ps.setString(5, addinfo.getReguserStatus());
			ps.setString(6, addinfo.getReguserDate());
			ps.setString(7, addinfo.getRegdistrict());
			ps.setString(8, addinfo.getRegaddress());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void updateCustomer(Registration updateinfo) {

		Connection con = DBconnection.getConnecttion();
		String sql = "update registration set rname=?, rpassword=?, address=?  where  remail=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, updateinfo.getRegusername());
			ps.setString(2, updateinfo.getReguserPassword());
			ps.setString(3, updateinfo.getRegaddress());
			ps.setString(4, updateinfo.getReguserEmail());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCustomer(int deleteinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Registration> getCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkCustomeremail(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from registration where remail='" + email + "'";
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
	public List<Registration> getcustomerListInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from registration where remail='" + email + "'";
		List<Registration> list = new ArrayList<Registration>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("rid");
				String name = rs.getString("rname");
				String reemail = rs.getString("remail");
				String password = rs.getString("rpassword");
				String gender = rs.getString("rgender");
				String status = rs.getString("rstatus");
				String date = rs.getString("rdate");
				String district = rs.getString("district");
				String address = rs.getString("address");
				list.add(new Registration(id, name, reemail, password, gender, status, date, district, address));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String getDistrict(String useremail) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Select * from registration where remail='" + useremail + "'";
		PreparedStatement ps;

		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String district = rs.getString("district");
				con.close();
				return district;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return "Not found";
	}

	@Override
	public void updateforgetpassword(Registration updateinfo) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update registration set rpassword=? where  remail=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, updateinfo.getReguserPassword());
			ps.setString(2, updateinfo.getReguserEmail());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
