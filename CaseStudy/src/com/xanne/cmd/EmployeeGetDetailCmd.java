package com.xanne.cmd;

public class EmployeeGetDetailCmd extends BaseGetCmd {

	private Integer employeeId;
	
	@Override
	public void performExecute() {
		System.out.println("Retrieving employee id : " + employeeId);
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
}
