package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.BakeryOwners;

public interface BakeryOwnersDao {
	
	public void addBakeryowner(BakeryOwners warehouse);

	public List<BakeryOwners> getBakeryownerListInfo(String email);

	public void deleteBakeryownerDetails(int id);

}
