package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.EmployeeInfo;
import com.bakeryfoodshut.model.OfflineOrder;

public interface OfflineorderService {

	public void addOfflineOrder(OfflineOrder offlineorder);

	public List<OfflineOrder> getOrderListInfo(String username);

	public void deleteOfflineOrder(int id);

	public OfflineOrder getOfflineorderInfo(int id);

	public void updateOfflineorderstatus(OfflineOrder update);

	public List<OfflineOrder> Offlineorderreport(String shopkeepername, String date);

	
}
