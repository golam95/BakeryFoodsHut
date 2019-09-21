package com.bakeryfoodshut.dao;

import java.util.List;

import com.bakeryfoodshut.model.Homemade;

public interface HomemadeDao {

	public void addHomemade(Homemade homemade);

	public boolean checkEmail(String email);
	
	public List<Homemade> getHomemadeList(String email);

	public Homemade getHomemadeInfo(String email);

	public void updateHomemade(Homemade homemade);
	
	public List<Homemade> getHomemadeageInfo();
	
	public List<Homemade> getHomemadeageInfodistrict(String district);
}
