package com.xanne.cmd;

import com.xanne.bo.EmployeeBO;
import com.xanne.exception.CaseStudyException;

public class EmployeeGetDetailCmd extends BaseGetCmd {

	// input parameter
	private Integer employeeId;
	
	// output parameter
	private EmployeeBO employee;
	
	
	@Override
	public void performExecute() throws CaseStudyException {
		System.out.println("Retrieving employee id : " + employeeId);

		employee = EmployeeBO.getById(1);
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public boolean isValidToExecute() {
		if (employeeId == null) {
			System.out.println("Employee id is required.");
			return false;
		}

		return true;
	}
	
	public EmployeeBO getEmployee() {
		return employee;
	}
}
