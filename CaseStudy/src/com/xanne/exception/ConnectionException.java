package com.xanne.exception;

public class ConnectionException extends Exception {

	private static final long serialVersionUID = 1L;

	public ConnectionException(Exception e) {
		super(e);
	}
	
	public ConnectionException(String msg) {
		super(msg);
	}
}
