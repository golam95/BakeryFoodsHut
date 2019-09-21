package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.WarehouseDao;
import com.bakeryfoodshut.daoImpl.WarehouseDaoImpl;
import com.bakeryfoodshut.model.Storehouse;
import com.bakeryfoodshut.service.WarehouseService;

public class WarehouseServiceImpl implements WarehouseService{

	 WarehouseDao warehousedao=new  WarehouseDaoImpl();
	
	@Override
	public void addWarehouse(Storehouse warehouse) {
		warehousedao.addWarehouse(warehouse);
		
	}

	@Override
	public List<Storehouse> getWarehouseListInfo(String email) {
		// TODO Auto-generated method stub
		return warehousedao.getWarehouseListInfo(email);
	}

	@Override
	public void deleteWarehouseDetails(int id) {
		warehousedao.deleteWarehouseDetails(id);
		
	}

}
