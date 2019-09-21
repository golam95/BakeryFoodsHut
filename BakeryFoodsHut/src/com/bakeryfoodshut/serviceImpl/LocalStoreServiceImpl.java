package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.LocalStoreDao;
import com.bakeryfoodshut.daoImpl.LocalStoreDaoImpl;
import com.bakeryfoodshut.model.LocalStore;
import com.bakeryfoodshut.service.LocalStoreService;

public class LocalStoreServiceImpl implements LocalStoreService {

	LocalStoreDao localdao = new LocalStoreDaoImpl();

	@Override
	public void addLocalorder(LocalStore addstore) {
		localdao.addLocalorder(addstore);
	}

	@Override
	public List<LocalStore> getLocalstoreListInfo(String usename) {
		return localdao.getLocalstoreListInfo(usename);
	}

	@Override
	public LocalStore getLocalstoreorderInfo(int id) {
		// TODO Auto-generated method stub
		return localdao.getLocalstoreorderInfo(id);
	}

	@Override
	public void deletelocalorder(int id) {
		localdao.deletelocalorder(id);
	}

	@Override
	public void updatalocalorder(LocalStore updatelocalorder) {
		localdao.updatalocalorder(updatelocalorder);
	}

	@Override
	public List<LocalStore> localStorereport(String shopkeepername, String date) {
		return localdao.localStorereport(shopkeepername, date);
	}

	@Override
	public List<LocalStore> monthlyreportlocalStore(String shopkeepername, String month, String year) {
		return localdao.monthlyreportlocalStore(shopkeepername, month, year);
	}

	@Override
	public List<LocalStore> yearlyreportlocalStore(String shopkeepername, String year) {
		return localdao.yearlyreportlocalStore(shopkeepername, year);
	}

}
