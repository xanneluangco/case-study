package com.xanne.cmd;

import com.xanne.exception.CaseStudyException;

public abstract class BaseCmd {

	public void execute() throws CaseStudyException {
		if (isValidToExecute()) {
			performExecute();
		} else {
			System.out.println("Command is not valid for execution.");
		}
	}
	
	public abstract void performExecute() throws CaseStudyException;
	public abstract boolean isValidToExecute();
}
