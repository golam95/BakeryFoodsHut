package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.OfflineOrder;

public interface OfflineorderDao {

	public void addOfflineOrder(OfflineOrder offlineorder);
	
	public List<OfflineOrder> getOrderListInfo(String username);
	
	public OfflineOrder getOfflineorderInfo(int id);

	public void deleteOfflineOrder(int id);
	
	public void updateOfflineorderstatus(OfflineOrder update);
	
	public List<OfflineOrder> Offlineorderreport(String shopkeepername,String date);
	
	
	
	
	
	
}
