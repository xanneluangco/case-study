package com.xanne.rh.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xanne.cmd.EmployeeGetDetailCmd;
import com.xanne.rh.BaseRH;
import com.xanne.util.CaseUtils;

public class EmployeeRH implements BaseRH {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) {
		String cmd = CaseUtils.trimStringNull(request.getParameter("cmd"));
		if (cmd.equalsIgnoreCase("list")) {
			doGetEmployeeList();
		}
	}

	private void doGetEmployeeList() {
		//EmployeeGetListCmd cmd = new EmployeeGetListCmd();
		EmployeeGetDetailCmd cmd = new EmployeeGetDetailCmd();
		cmd.setEmployeeId(100);
		cmd.execute();
	}
}
