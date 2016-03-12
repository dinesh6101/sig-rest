package com.sig.team.webworks.ekirana.util;

public class StringUtil {

	public static String replaceDash(String inputString) {
		return inputString.trim().replaceAll("-", "%");
	}

}
