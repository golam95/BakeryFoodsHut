package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.VanDao;
import com.bakeryfoodshut.daoImpl.VanDaoImpl;
import com.bakeryfoodshut.model.VanDetails;
import com.bakeryfoodshut.service.VanService;

public class VanServiceImpl implements VanService {

	VanDao vandao=new VanDaoImpl();
	
	@Override
	public void addVan(VanDetails van) {
		vandao.addVan(van);
		
	}

	@Override
	public List<VanDetails> getCartListInfo(String email) {
		// TODO Auto-generated method stub
		return vandao.getCartListInfo(email);
	}

	@Override
	public void deleteVanDetails(int id) {
		vandao.deleteVanDetails(id);
		
	}

}
