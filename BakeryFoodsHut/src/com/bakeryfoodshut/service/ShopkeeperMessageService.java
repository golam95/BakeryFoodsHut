package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.dao.ShopkeeperMessageDao;
import com.bakeryfoodshut.model.ShopkeeperMessage;

public interface ShopkeeperMessageService {

	public void addMessage(ShopkeeperMessage message);

	public List<ShopkeeperMessage> getShopkeeperinfoList(String email);

	public void deleteShopkeeperMessage(int id);
	
	public void updateShopkeeperMessage(ShopkeeperMessage quantity);

	public ShopkeeperMessage getManageShopkeeperMessageInfoUpdate(String email);

}
