package com.xanne.cmd;

public abstract class BaseCmd {

	public void execute() {
		if (isValidToExecute()) {
			performExecute();
		} else {
			System.out.println("Command is not valid for execution.");
		}
	}
	
	public abstract void performExecute();
	public abstract boolean isValidToExecute();
}
