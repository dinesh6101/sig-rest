package com.sig.team.webworks.matrimonial.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.State;
import com.sig.team.webworks.matrimonial.service.FindCityByStateService;

@RestController
public class FindCityByStateController {

	@Resource
	private FindCityByStateService findCityByStateService;
	
	@RequestMapping(value = "/findCityByState", method = RequestMethod.POST)
	public @ResponseBody Object findCityByState(@RequestBody State entity) {
		return findCityByStateService.findCityByState(entity);
	}

}
