package com.example.expenceApp.ExceptionHandler;

public class NotSavedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotSavedException(String error) {
	 super(error);
    }
    @Override
    public String getMessage() {
	// TODO Auto-generated method stub
	return super.getMessage();
    }
}
