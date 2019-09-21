package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.BakeryOwnersDao;
import com.bakeryfoodshut.daoImpl.BakeryOwnersDaoImpl;
import com.bakeryfoodshut.model.BakeryOwners;
import com.bakeryfoodshut.service.BakeryOwnersService;

public class BakeryOwnersServiceImpl implements BakeryOwnersService {

	BakeryOwnersDao bakeryownerdao=new BakeryOwnersDaoImpl();
	@Override
	public void addBakeryowner(BakeryOwners warehouse) {
		bakeryownerdao.addBakeryowner(warehouse);
		
	}

	@Override
	public List<BakeryOwners> getBakeryownerListInfo(String email) {
		// TODO Auto-generated method stub
		return bakeryownerdao.getBakeryownerListInfo(email);
	}

	@Override
	public void deleteBakeryownerDetails(int id) {
		bakeryownerdao.deleteBakeryownerDetails(id);
		
	}

}
