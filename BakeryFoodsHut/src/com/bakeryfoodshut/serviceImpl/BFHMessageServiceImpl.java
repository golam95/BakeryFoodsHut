package com.bakeryfoodshut.serviceImpl;

import java.util.List;

import com.bakeryfoodshut.dao.BFHMessageDao;
import com.bakeryfoodshut.daoImpl.BFHMessageDaoImpl;
import com.bakeryfoodshut.model.BFHMessage;
import com.bakeryfoodshut.service.BFHMessageService;

public class BFHMessageServiceImpl implements BFHMessageService {
	
	BFHMessageDao messagedao = new BFHMessageDaoImpl();

	@Override
	public void sendMessage(BFHMessage sendmessage) {
		messagedao.sendMessage(sendmessage);
	}

	@Override
	public List<BFHMessage> getBFHMessageInfo() {
		// TODO Auto-generated method stub
		return messagedao.getBFHMessageInfo();
	}

}
