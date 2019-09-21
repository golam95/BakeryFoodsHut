package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.Cart;


public interface CartDao {
	
	public void addCart(Cart addCart);
	
	public boolean checkshopkeeper(String shopkeeperEmail,String customerEmail);
	
	public boolean checkCustomer(String customerEmail);
	
	public List<Cart> getCartListInfo(String usename);
	
	public void deleteCart(int id);
	
	public void deleteCartall(String email);
	
	
}
