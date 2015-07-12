package com.xanne.cmd;

import java.util.List;

import com.xanne.bo.EmployeeBO;
import com.xanne.dao.EmployeeDAO;
import com.xanne.exception.CaseStudyException;

public class EmployeeGetListCmd extends BaseGetCmd {

	@Override
	public void performExecute() throws CaseStudyException {
		System.out.println("Performing employee get list cmd.");
		EmployeeDAO dao = new EmployeeDAO();
		List<EmployeeBO> empoyees = dao.getEmpoyees();
	}

	@Override
	public boolean isValidToExecute() {
		return true;
	}
}
