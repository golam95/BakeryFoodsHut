package com.bakeryfoodshut.dao;

import java.util.List;

import com.bakeryfoodshut.model.Bakerymade;
import com.bakeryfoodshut.model.Cart;


public interface BakerymadeDao {

	public void addBakerymade(Bakerymade bakerymade);

	public boolean checkEmail(String email);

	public Bakerymade getBakerymadeInfo(String email);

	public void updateBakerymade(Bakerymade bakerymade);
	
	public List<Bakerymade> getBakeryMadeInfo();
	
	public List<Bakerymade> getBakeryMadeInfodistrict(String district);
	

	
}
