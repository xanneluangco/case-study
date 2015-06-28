package com.xanne.rh;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BaseRH {
	public void handle(HttpServletRequest request, HttpServletResponse response);
}
