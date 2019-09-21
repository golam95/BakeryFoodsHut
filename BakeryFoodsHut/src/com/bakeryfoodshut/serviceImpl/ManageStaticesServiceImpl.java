package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.ManageStaticesDao;
import com.bakeryfoodshut.daoImpl.ManageStaticesDaoImpl;
import com.bakeryfoodshut.model.ManageQuantity;
import com.bakeryfoodshut.service.ManageStaticesService;

public class ManageStaticesServiceImpl implements ManageStaticesService {

	ManageStaticesDao managestatices = new ManageStaticesDaoImpl();

	@Override
	public void addQuantityInfo(ManageQuantity addquantity) {
		managestatices.addQuantityInfo(addquantity);
	}

	@Override
	public void updateQuantity(ManageQuantity quantity) {
		managestatices.updateQuantity(quantity);
	}

	@Override
	public boolean checkQuantity(String email) {
		return managestatices.checkQuantity(email);
	}

	@Override
	public ManageQuantity getManageQuantityInfoUpdate(String email) {
		return managestatices.getManageQuantityInfoUpdate(email);
	}

	@Override
	public List<ManageQuantity> getManageQuantityInfolist(String email) {
		return managestatices.getManageQuantityInfolist(email);
	}

	@Override
	public int TotalPost(String email) {
		return managestatices.TotalPost(email);
	}

	@Override
	public int TotalOrder(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int RetriveQuantity(String email) {
		return managestatices.RetriveQuantity(email);
	}

	@Override
	public int TotalMessage(String email) {
		return managestatices.TotalMessage(email);
	}

	@Override
	public int TotalMessages(String email) {
		return managestatices.TotalMessages(email);
	}

	@Override
	public int Totalvechile(String email) {
		// TODO Auto-generated method stub
		return managestatices.Totalvechile(email);
	}

	@Override
	public int Totallocalstoreorder(String email) {
		// TODO Auto-generated method stub
		return managestatices.Totallocalstoreorder(email);
	}

	@Override
	public int TotalEmployee(String Status) {
		// TODO Auto-generated method stub
		return managestatices.TotalEmployee(Status);
	}

	@Override
	public int TotalResignationemp(String status) {
		// TODO Auto-generated method stub
		return managestatices.TotalResignationemp(status);
	}

}
