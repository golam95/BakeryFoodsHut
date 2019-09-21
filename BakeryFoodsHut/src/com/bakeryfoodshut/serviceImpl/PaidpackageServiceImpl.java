package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.PaidpackageDao;
import com.bakeryfoodshut.daoImpl.PaidpackageDaoImpl;
import com.bakeryfoodshut.model.Paidpackage;
import com.bakeryfoodshut.service.PaidpackageService;

public class PaidpackageServiceImpl implements PaidpackageService {

	PaidpackageDao paidpackagedao = new PaidpackageDaoImpl();

	@Override
	public void addPaidpackage(Paidpackage paidpackage) {
		paidpackagedao.addPaidpackage(paidpackage);
	}

	@Override
	public boolean checkEmail(String email) {
		return paidpackagedao.checkEmail(email);
	}

	@Override
	public Paidpackage getPaidpackageInfo(String email) {
		return paidpackagedao.getPaidpackageInfo(email);
	}

	@Override
	public List<Paidpackage> getPaidpackageInfo() {
		return paidpackagedao.getPaidpackageInfo();
	}

	@Override
	public List<Paidpackage> getPaidpackageInfodistrict(String district) {
		return paidpackagedao.getPaidpackageInfodistrict(district);
	}

}
