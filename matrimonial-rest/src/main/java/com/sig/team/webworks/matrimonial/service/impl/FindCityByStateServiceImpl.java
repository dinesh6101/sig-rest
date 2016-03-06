package com.sig.team.webworks.matrimonial.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sig.team.webworks.matrimonial.crud.entity.State;
import com.sig.team.webworks.matrimonial.dao.FindCityByStateDAO;
import com.sig.team.webworks.matrimonial.model.StateCityList;
import com.sig.team.webworks.matrimonial.service.FindCityByStateService;

@Service
public class FindCityByStateServiceImpl implements FindCityByStateService {

	@Resource
	private FindCityByStateDAO findCityByStateDAO;

	@Override
	public StateCityList findCityByState(State entity) {
		return findCityByStateDAO.findCityByState(entity);
	}

}
