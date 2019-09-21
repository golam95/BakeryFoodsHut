package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.ManageprofileInfoDao;
import com.bakeryfoodshut.daoImpl.ManageprofileInfoDaoImpl;
import com.bakeryfoodshut.model.ManageprofileInfo;
import com.bakeryfoodshut.service.ManageprofileInfoService;

public class ManageprofileInfoServiceImpl implements ManageprofileInfoService {

	ManageprofileInfoDao manageprofiledao = new ManageprofileInfoDaoImpl();

	@Override
	public void addManageprofileInfo(ManageprofileInfo profile) {
		manageprofiledao.addManageprofileInfo(profile);
	}

	@Override
	public boolean checkweblink(String weblink) {
		return manageprofiledao.checkweblink(weblink);
	}

	@Override
	public boolean checkbranch(String branch) {
		return manageprofiledao.checkbranch(branch);
	}

	@Override
	public boolean checkEmail(String email) {
		return manageprofiledao.checkEmail(email);
	}

	@Override
	public List<ManageprofileInfo> getManageprofileinfoList(String email) {
		return manageprofiledao.getManageprofileinfoList(email);
	}

	@Override
	public ManageprofileInfo getManageprofileInfo(String email) {
		return manageprofiledao.getManageprofileInfo(email);
	}

	@Override
	public void updateManageprofileInfo(ManageprofileInfo manageprofile) {
		manageprofiledao.updateManageprofileInfo(manageprofile);
	}

}
