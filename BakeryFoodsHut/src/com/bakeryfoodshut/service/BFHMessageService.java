package com.bakeryfoodshut.service;

import java.util.List;
import com.bakeryfoodshut.model.BFHMessage;

public interface BFHMessageService {

	public void sendMessage(BFHMessage sendmessage);
	
	public List<BFHMessage> getBFHMessageInfo();

}
