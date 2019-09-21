package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.Orderconfirm;
import com.bakeryfoodshut.model.Post;

public interface OrderconfirmDao {

	public void addOrderconfirm(Orderconfirm confirm);

	public List<Orderconfirm> getOrderconfirmListInfo(String email);

	public void updateOrderconfirm(Orderconfirm update);
	
	public boolean checkOrdeconfirmId(int id);
	
	public void deleteConfirmorder(int id);
	
	

}
