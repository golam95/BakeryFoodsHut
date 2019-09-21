package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.ShopkeeperMessageDao;
import com.bakeryfoodshut.daoImpl.ShopkeeperMessageDaoImpl;
import com.bakeryfoodshut.model.ShopkeeperMessage;
import com.bakeryfoodshut.service.ShopkeeperMessageService;

public class ShopkeeperMessageServiceImpl implements ShopkeeperMessageService {

	ShopkeeperMessageDao messagedao = new ShopkeeperMessageDaoImpl();

	@Override
	public void addMessage(ShopkeeperMessage message) {
		messagedao.addMessage(message);
	}

	@Override
	public List<ShopkeeperMessage> getShopkeeperinfoList(String email) {
		return messagedao.getShopkeeperinfoList(email);
	}

	@Override
	public void deleteShopkeeperMessage(int id) {
		messagedao.deleteShopkeeperMessage(id);
	}

	@Override
	public void updateShopkeeperMessage(ShopkeeperMessage quantity) {
		messagedao.updateShopkeeperMessage(quantity);
	}

	@Override
	public ShopkeeperMessage getManageShopkeeperMessageInfoUpdate(String email) {
		return messagedao.getManageShopkeeperMessageInfoUpdate(email);
	}
}
