package com.xanne.util;

public class CaseUtils {
	
	private CaseUtils() {}

	public static String trimStringNull(String string) {
		string = string == null ? "" : string.trim();
		return string;
	}
	
	public static String trimString(String string) {
		string = string == null ? null : string.trim();
		return string;
	}
}
