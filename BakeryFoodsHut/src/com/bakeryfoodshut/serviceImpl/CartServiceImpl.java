package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.CartDao;
import com.bakeryfoodshut.daoImpl.CartDaoImpl;
import com.bakeryfoodshut.model.Cart;
import com.bakeryfoodshut.service.CartService;

public class CartServiceImpl implements CartService {

	CartDao cartdao = new CartDaoImpl();

	@Override
	public void addCart(Cart addCart) {
		cartdao.addCart(addCart);
	}

	@Override
	public boolean checkshopkeeper(String shopkeeperEmail, String customerEmail) {
		return cartdao.checkshopkeeper(shopkeeperEmail, customerEmail);
	}

	@Override
	public boolean checkCustomer(String customerEmail) {
		return cartdao.checkCustomer(customerEmail);
	}

	@Override
	public List<Cart> getCartListInfo(String usename) {
		return cartdao.getCartListInfo(usename);
	}

	@Override
	public void deleteCart(int id) {
		cartdao.deleteCart(id);
	}

	@Override
	public void deleteCartall(String email) {
		cartdao.deleteCartall(email);	
	}

	
}
