package com.sig.team.webworks.matrimonial.model;

import java.util.ArrayList;
import java.util.List;

import com.sig.team.webworks.matrimonial.crud.entity.City;
import com.sig.team.webworks.matrimonial.crud.entity.State;

public class StateCityList {

	private State state;
	private List<City> cities = new ArrayList<City>();

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
}
