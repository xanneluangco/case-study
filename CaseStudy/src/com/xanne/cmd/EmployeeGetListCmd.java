package com.xanne.cmd;

import java.util.List;

import com.xanne.bo.EmployeeBO;
import com.xanne.dao.EmployeeDAO;
import com.xanne.exception.CaseStudyException;

public class EmployeeGetListCmd extends BaseGetCmd {

	List<EmployeeBO> employees;
	
	@Override
	public void performExecute() throws CaseStudyException {
		EmployeeDAO dao = new EmployeeDAO();
		 employees = dao.getEmployees();
	}

	@Override
	public boolean isValidToExecute() {
		return true;
	}
	
	public List<EmployeeBO> getEmployees() {
		return employees;
	}
}
