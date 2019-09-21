package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.LocalStore;

public interface LocalStoreService {

	public void addLocalorder(LocalStore addstore);

	public List<LocalStore> getLocalstoreListInfo(String usename);

	public LocalStore getLocalstoreorderInfo(int id);

	public void deletelocalorder(int id);

	public void updatalocalorder(LocalStore updatelocalorder);
	
	public List<LocalStore> localStorereport(String shopkeepername,String date);
	
	public List<LocalStore> monthlyreportlocalStore(String shopkeepername, String month, String year);

	public List<LocalStore> yearlyreportlocalStore(String shopkeepername, String year);

	
}
