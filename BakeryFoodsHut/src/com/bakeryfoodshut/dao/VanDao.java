package com.bakeryfoodshut.dao;

import java.util.List;

import com.bakeryfoodshut.model.VanDetails;

public interface VanDao {

	public void addVan(VanDetails van);

	public List<VanDetails> getCartListInfo(String email);

	public void deleteVanDetails(int id);
}
