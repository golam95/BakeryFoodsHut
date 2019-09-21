package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.BakeryOwners;

public interface BakeryOwnersService {
	
	public void addBakeryowner(BakeryOwners warehouse);

	public List<BakeryOwners> getBakeryownerListInfo(String email);

	public void deleteBakeryownerDetails(int id);
	
}
