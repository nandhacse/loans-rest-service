package com.mc.rest.webservices.restfulwebservicesloans.exception;

public class LoanNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoanNotFoundException(String message) {
		super(message);
	}

}
