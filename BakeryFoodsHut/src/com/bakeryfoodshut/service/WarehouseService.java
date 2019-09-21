package com.bakeryfoodshut.service;

import java.util.List;

import com.bakeryfoodshut.model.Storehouse;

public interface WarehouseService {

	public void addWarehouse(Storehouse warehouse);

	public List<Storehouse> getWarehouseListInfo(String email);

	public void deleteWarehouseDetails(int id);
	
}
