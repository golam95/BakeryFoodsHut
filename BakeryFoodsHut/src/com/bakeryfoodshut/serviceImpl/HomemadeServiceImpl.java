package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.HomemadeDao;
import com.bakeryfoodshut.daoImpl.HomemadeDaoImpl;
import com.bakeryfoodshut.model.Homemade;
import com.bakeryfoodshut.service.HomemadeService;

public class HomemadeServiceImpl implements HomemadeService {
	HomemadeDao homemadedao = new HomemadeDaoImpl();

	@Override
	public void addHomemade(Homemade homemade) {
		homemadedao.addHomemade(homemade);
	}

	@Override
	public boolean checkEmail(String email) {
		return homemadedao.checkEmail(email);
	}

	@Override
	public List<Homemade> getHomemadeList(String email) {
		return homemadedao.getHomemadeList(email);
	}

	@Override
	public Homemade getHomemadeInfo(String email) {
		return homemadedao.getHomemadeInfo(email);
	}

	@Override
	public void updateHomemade(Homemade homemade) {
		homemadedao.updateHomemade(homemade);
	}

	@Override
	public List<Homemade> getHomemadeageInfo() {
		return homemadedao.getHomemadeageInfo();
	}

	@Override
	public List<Homemade> getHomemadeageInfodistrict(String district) {
		return homemadedao.getHomemadeageInfodistrict(district);
	}

}
