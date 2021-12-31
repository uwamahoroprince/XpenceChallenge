package com.example.expenceApp.ExceptionHandler;

public class NotDeletedException extends RuntimeException {

    @Override
    public String getMessage() {
	// TODO Auto-generated method stub
	return super.getMessage();
    }

    private static final long serialVersionUID = 1L;

    public NotDeletedException(String error) {
	super(error);
    }
    
}