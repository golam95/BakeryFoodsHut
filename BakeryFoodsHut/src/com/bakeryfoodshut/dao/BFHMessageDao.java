package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.BFHMessage;


public interface BFHMessageDao {
	
	public void sendMessage(BFHMessage sendmessage);
	
	public List<BFHMessage> getBFHMessageInfo();
	
}
