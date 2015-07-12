package com.xanne.rh.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xanne.rh.BaseRH;
import com.xanne.util.CaseUtils;

public class LoginRH implements BaseRH {

	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		String nextPge = null;
		String cmd = CaseUtils.trimStringNull(request.getParameter("cmd"));
		
		return nextPge;

	}

}
