package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.ShopkeeperMessage;

public interface ShopkeeperMessageDao {
	
	public void addMessage(ShopkeeperMessage message);
	
	public List<ShopkeeperMessage> getShopkeeperinfoList(String email);
	
	public void deleteShopkeeperMessage(int id);
	
	public void updateShopkeeperMessage(ShopkeeperMessage quantity);
	
	public ShopkeeperMessage getManageShopkeeperMessageInfoUpdate(String email);
	
}
