package com.exception;

public class MyFormException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exceptionMsg;

	public MyFormException(String exceptionMsg) {
		super();
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
	
}
