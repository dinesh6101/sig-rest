package com.sig.team.webworks.matrimonial.dao;

import com.sig.team.webworks.matrimonial.crud.entity.State;
import com.sig.team.webworks.matrimonial.model.StateCityList;

public interface FindCityByStateDAO {

	public StateCityList findCityByState(State state);
}
