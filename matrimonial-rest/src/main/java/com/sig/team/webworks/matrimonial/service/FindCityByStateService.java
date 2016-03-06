package com.sig.team.webworks.matrimonial.service;

import com.sig.team.webworks.matrimonial.crud.entity.State;
import com.sig.team.webworks.matrimonial.model.StateCityList;

public interface FindCityByStateService {

	StateCityList findCityByState(State entity);

}
