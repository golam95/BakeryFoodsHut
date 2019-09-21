package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.ProfileInfoDao;
import com.bakeryfoodshut.daoImpl.ProfileInfoDaoImpl;
import com.bakeryfoodshut.model.ProfileInfo;
import com.bakeryfoodshut.service.ProfileInfoService;

public class ProfileInfoServiceImpl implements ProfileInfoService {

	ProfileInfoDao profiledao = new ProfileInfoDaoImpl();

	@Override
	public void addProfileinfo(ProfileInfo profileinfo) {
		profiledao.addProfileinfo(profileinfo);
	}

	

}
