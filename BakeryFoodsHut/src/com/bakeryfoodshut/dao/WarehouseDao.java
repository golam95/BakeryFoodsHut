package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.Storehouse;

public interface WarehouseDao {

	public void addWarehouse(Storehouse warehouse);

	public List<Storehouse> getWarehouseListInfo(String email);

	public void deleteWarehouseDetails(int id);

}
