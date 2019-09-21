package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.OrderconfirmDao;
import com.bakeryfoodshut.daoImpl.OrderconfirmDaoImpl;
import com.bakeryfoodshut.model.Orderconfirm;
import com.bakeryfoodshut.service.OrderconfirmService;

public class OrderconfirmServiceImpl implements OrderconfirmService {

	OrderconfirmDao orderconfirmdao = new OrderconfirmDaoImpl();

	@Override
	public void addOrderconfirm(Orderconfirm confirm) {
		orderconfirmdao.addOrderconfirm(confirm);

	}

	@Override
	public List<Orderconfirm> getOrderconfirmListInfo(String email) {
		return orderconfirmdao.getOrderconfirmListInfo(email);
	}

	@Override
	public void updateOrderconfirm(Orderconfirm update) {
		orderconfirmdao.updateOrderconfirm(update);

	}

	@Override
	public boolean checkOrdeconfirmId(int id) {
		return orderconfirmdao.checkOrdeconfirmId(id);
	}

	@Override
	public void deleteConfirmorder(int id) {
		orderconfirmdao.deleteConfirmorder(id);
	}

}
