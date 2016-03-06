package com.sig.team.webworks.matrimonial;

public class Queries {
	public final static String FIND_CITY_BY_STATE = "select c.cityId, c.cityName, s.stateId, s.statetName from city c, state s where c.stateId = s.stateId and s.stateId = :stateId";
}
