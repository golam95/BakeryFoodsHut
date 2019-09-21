package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.ProfileInfoDao;
import com.bakeryfoodshut.model.Homemade;
import com.bakeryfoodshut.model.ProfileInfo;
import com.bakeryfoodshut.utils.DBconnection;

public class ProfileInfoDaoImpl implements ProfileInfoDao {

	@Override
	public void addProfileinfo(ProfileInfo profileinfo) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into profileinfo " + "(shopkeeperemail,weblink,branch,produce,startbusiness,date) "
				+ "values (?, ?, ?, ?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, profileinfo.getInfoEmail());
			ps.setString(2, profileinfo.getInfoWeblink());
			ps.setString(3, profileinfo.getInfoBranch());
			ps.setString(4, profileinfo.getInfoProduce());
			ps.setString(5, profileinfo.getInfoStartbusiness());
			ps.setString(6, profileinfo.getInfoDate());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

}
