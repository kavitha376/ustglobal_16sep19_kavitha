package com.ustglobal.exception.customized.checkedexception;

public class InvalidAmountException extends Exception{
	private String message = "daily limit is 40000";
	
	@Override
	public String getMessage() {
		return message;
	}
	

}
