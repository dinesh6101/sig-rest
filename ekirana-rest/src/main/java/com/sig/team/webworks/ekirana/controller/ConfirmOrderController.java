package com.sig.team.webworks.ekirana.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.dao.ConfirmOrderDao;

@RestController
public class ConfirmOrderController {

	@Resource
	private ConfirmOrderDao confirmOrderDao;

	@RequestMapping(value = "/confirmOrder", method = RequestMethod.GET)
	@ResponseBody
	public Integer updateConfirmOrder(@RequestParam("customerId") Integer customerId) {
		return confirmOrderDao.updateConfirmOrder(customerId);
	}

}
