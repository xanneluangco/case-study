package com.xanne.cmd;

public class EmployeeGetListCmd extends BaseGetCmd {

	@Override
	public void performExecute() {
		System.out.println("Performing employee get list cmd.");
	}

	@Override
	public boolean isValidToExecute() {
		return true;
	}
}
