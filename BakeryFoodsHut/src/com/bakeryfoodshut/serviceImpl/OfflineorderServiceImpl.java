package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.OfflineorderDao;
import com.bakeryfoodshut.daoImpl.OfflineorderDaoImpl;
import com.bakeryfoodshut.model.OfflineOrder;
import com.bakeryfoodshut.service.OfflineorderService;

public class OfflineorderServiceImpl implements OfflineorderService {

	OfflineorderDao offlinedao = new OfflineorderDaoImpl();

	@Override
	public void addOfflineOrder(OfflineOrder offlineorder) {
		offlinedao.addOfflineOrder(offlineorder);
	}

	@Override
	public List<OfflineOrder> getOrderListInfo(String username) {
		return offlinedao.getOrderListInfo(username);
	}

	@Override
	public void deleteOfflineOrder(int id) {
		offlinedao.deleteOfflineOrder(id);
	}

	@Override
	public OfflineOrder getOfflineorderInfo(int id) {
		return offlinedao.getOfflineorderInfo(id);
	}

	@Override
	public void updateOfflineorderstatus(OfflineOrder update) {
		offlinedao.updateOfflineorderstatus(update);
	}

	@Override
	public List<OfflineOrder> Offlineorderreport(String shopkeepername, String date) {
		return offlinedao.Offlineorderreport(shopkeepername, date);
	}

}
