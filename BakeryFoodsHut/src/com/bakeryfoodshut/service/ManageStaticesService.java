package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.ManageQuantity;

public interface ManageStaticesService {

	public void addQuantityInfo(ManageQuantity addquantity);

	public ManageQuantity getManageQuantityInfoUpdate(String email);

	public List<ManageQuantity> getManageQuantityInfolist(String email);

	public void updateQuantity(ManageQuantity quantity);

	public boolean checkQuantity(String quantitynumber);

	//
	public int TotalPost(String email);

	public int TotalOrder(String email);

	public int RetriveQuantity(String email);

	public int TotalMessage(String email);

	public int TotalMessages(String email);

	// new

	public int Totalvechile(String email);

	public int Totallocalstoreorder(String email);

	public int TotalEmployee(String Status);

	public int TotalResignationemp(String status);
}
