package com.ustglobal.exception.customized.uncheckedexception;

public class InvalidageException extends RuntimeException {
	String message = "invalid age below 18years not allowed";
	
	public InvalidageException() {
		
	}
   public InvalidageException(String message) {
		this.message =  message;
	}
	
	
	public String getMessage() 
	{
		return message;
	}

}
