package com.bakeryfoodshut.service;

import java.util.List;

import com.bakeryfoodshut.model.Orderconfirm;

public interface OrderconfirmService {
	public void addOrderconfirm(Orderconfirm confirm);

	public List<Orderconfirm> getOrderconfirmListInfo(String email);

	public void updateOrderconfirm(Orderconfirm update);
	
	public boolean checkOrdeconfirmId(int id);
	
	public void deleteConfirmorder(int id);
}
