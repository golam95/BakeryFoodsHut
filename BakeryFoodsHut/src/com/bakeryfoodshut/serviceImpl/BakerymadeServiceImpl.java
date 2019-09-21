package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.BakerymadeDao;
import com.bakeryfoodshut.daoImpl.BakerymadeDaoImpl;
import com.bakeryfoodshut.model.Bakerymade;
import com.bakeryfoodshut.service.BakerymadeService;

public class BakerymadeServiceImpl implements BakerymadeService {

	BakerymadeDao bakerydao = new BakerymadeDaoImpl();

	@Override
	public void addBakerymade(Bakerymade bakerymade) {
		bakerydao.addBakerymade(bakerymade);

	}

	@Override
	public boolean checkEmail(String email) {
		return bakerydao.checkEmail(email);
	}

	@Override
	public Bakerymade getBakerymadeInfo(String email) {
		return bakerydao.getBakerymadeInfo(email);
	}

	@Override
	public void updateBakerymade(Bakerymade bakerymade) {
		bakerydao.updateBakerymade(bakerymade);
	}

	@Override
	public List<Bakerymade> getBakeryMadeInfo() {
		return bakerydao.getBakeryMadeInfo();
	}

	@Override
	public List<Bakerymade> getBakeryMadeInfodistrict(String district) {
		return bakerydao.getBakeryMadeInfodistrict(district);
	}

}
