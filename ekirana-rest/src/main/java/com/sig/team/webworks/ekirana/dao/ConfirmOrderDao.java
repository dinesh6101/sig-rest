package com.sig.team.webworks.ekirana.dao;

import java.time.ZonedDateTime;

public interface ConfirmOrderDao {

	Integer updateConfirmOrder(Integer customerId);
	
	Integer updateCancelOrder(Integer customerId,String comments);
		

}
