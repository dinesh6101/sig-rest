package com.sig.team.webworks.ekirana.model;

public class KeyAndValues {

	private String value;
	private Integer key;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "KeyAndValues [value=" + value + ", key=" + key + "]";
	}

}
