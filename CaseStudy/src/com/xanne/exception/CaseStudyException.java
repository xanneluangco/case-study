package com.xanne.exception;

public class CaseStudyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public CaseStudyException(Exception e) {
		super(e);
	}
	
	public CaseStudyException(String msg) {
		super(msg);
	}
	
	public CaseStudyException(Throwable e) {
		super(e);
	}
}
