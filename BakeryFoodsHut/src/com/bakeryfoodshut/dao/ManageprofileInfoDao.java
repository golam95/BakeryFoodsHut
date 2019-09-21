package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.ManageprofileInfo;

public interface ManageprofileInfoDao {

	public void addManageprofileInfo(ManageprofileInfo profile);
	
	public boolean checkweblink(String weblink);
	
	public boolean checkbranch(String branch);
	
	public boolean checkEmail(String email);
	
	public List<ManageprofileInfo> getManageprofileinfoList(String email);
	
	public ManageprofileInfo getManageprofileInfo(String email);

	public void updateManageprofileInfo(ManageprofileInfo manageprofile);
	
	
}
