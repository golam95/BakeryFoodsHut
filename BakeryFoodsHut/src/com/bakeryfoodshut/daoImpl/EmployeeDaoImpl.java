package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bakeryfoodshut.dao.EmployeeDao;
import com.bakeryfoodshut.model.EmployeeInfo;
import com.bakeryfoodshut.utils.DBconnection;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(EmployeeInfo employee) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into employee" + "(name,designation,address,gender,nid,contactno,date,status,email) "
				+ "values (?, ?, ?, ?,?,?,?,?,?)";
		PreparedStatement ps;

		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, employee.getEmpName());
			ps.setString(2, employee.getEmpDesignation());
			ps.setString(3, employee.getEmpAddress());
			ps.setString(4, employee.getEmpGender());
			ps.setString(5, employee.getEmpNid());
			ps.setString(6, employee.getEmpContactno());
			ps.setString(7, employee.getEmpDate());
			ps.setString(8, employee.getEmpStatus());
			ps.setString(9, employee.getEmpemailAddress());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@Override
	public List<EmployeeInfo> getEmployeeListInfo(String value) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from employee where status='" + value + "'";
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		try {

			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String designation = rs.getString("designation");
				String address = rs.getString("address");
				String gender = rs.getString("gender");
				String nid = rs.getString("nid");
				String contactno = rs.getString("contactno");
				String date = rs.getString("date");
				String status = rs.getString("status");
				String emails = rs.getString("email");
				list.add(
						new EmployeeInfo(id, name, designation, address, gender, nid, contactno, date, status, emails));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateEmployee(EmployeeInfo empinfo) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update employee set status=? where  id=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, empinfo.getEmpStatus());
			ps.setInt(2, empinfo.getEmpId());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<EmployeeInfo> getEmployeeListexternal(String type) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from employee where designation='" + type + "'";
		List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		try {

			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String designation = rs.getString("designation");
				String address = rs.getString("address");
				String gender = rs.getString("gender");
				String nid = rs.getString("nid");
				String contactno = rs.getString("contactno");
				String date = rs.getString("date");
				String status = rs.getString("status");
				String emails = rs.getString("email");
				list.add(
						new EmployeeInfo(id, name, designation, address, gender, nid, contactno, date, status, emails));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
