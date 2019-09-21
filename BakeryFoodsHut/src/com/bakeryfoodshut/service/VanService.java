package com.bakeryfoodshut.service;

import java.util.List;

import com.bakeryfoodshut.model.VanDetails;

public interface VanService {
	
	public void addVan(VanDetails van);

	public List<VanDetails> getCartListInfo(String email);

	public void deleteVanDetails(int id);
}
