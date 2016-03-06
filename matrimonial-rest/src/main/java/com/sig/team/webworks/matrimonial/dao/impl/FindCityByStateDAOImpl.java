package com.sig.team.webworks.matrimonial.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.sig.team.webworks.matrimonial.Queries;
import com.sig.team.webworks.matrimonial.crud.entity.City;
import com.sig.team.webworks.matrimonial.crud.entity.State;
import com.sig.team.webworks.matrimonial.dao.FindCityByStateDAO;
import com.sig.team.webworks.matrimonial.model.StateCityList;

@Repository
public class FindCityByStateDAOImpl implements FindCityByStateDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public StateCityList findCityByState(State state) {
		StateCityList stateCityList = new StateCityList();
		State newState = entityManager.find(State.class, state.getStateId());
		stateCityList.setState(newState);
		
		/*
		StateCityList stateCityList = new StateCityList();
		List<City> cities = new ArrayList<City>();

		if (state.getStateId() != null || state.getStatetName().isEmpty() == false) {
			Query query = entityManager.createNativeQuery(Queries.FIND_CITY_BY_STATE);
			query.setParameter("stateId", state.getStateId());

			int i = 0;
			List<Object[]> result = query.getResultList();
			for (Object[] objects : result) {
				City city = new City();
				city.setCityId((Integer) objects[0]);
				city.setCityName((String) objects[1]);
				city.setStateId((Integer) objects[2]);
				cities.add(city);

				if (i == 0) {
					i++;
					State stateFromDb = new State();
					stateFromDb.setStateId((Integer) objects[2]);
					stateFromDb.setStatetName((String) objects[3]);
					stateCityList.setState(stateFromDb);
				}
			}

			stateCityList.setCities(cities);
		}

		return stateCityList;
	*/
	return stateCityList;	
	}
}
