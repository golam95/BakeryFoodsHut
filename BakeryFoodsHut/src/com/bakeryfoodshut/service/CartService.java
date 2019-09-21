package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.Cart;

public interface CartService {
	
	public void addCart(Cart addCart);
	
	public boolean checkshopkeeper(String shopkeeperEmail,String customerEmail);
	
	public boolean checkCustomer(String customerEmail);
	
	public List<Cart> getCartListInfo(String username);
	
	public void deleteCart(int id);
	
	public void deleteCartall(String email);
	
	
}
