package com.bakeryfoodshut.service;

import java.util.List;

import com.bakeryfoodshut.model.Paidpackage;

public interface PaidpackageService {

	public void addPaidpackage(Paidpackage paidpackage);

	public boolean checkEmail(String email);
	
	public Paidpackage getPaidpackageInfo(String email);
	
	public List<Paidpackage> getPaidpackageInfo();
	
	public List<Paidpackage> getPaidpackageInfodistrict(String district);
}
