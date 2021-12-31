package com.example.expenceApp.ExceptionHandler;

public class NotUpdatedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotUpdatedException(String error) {
    }

    @Override
    public String getMessage() {
	// TODO Auto-generated method stub
	return super.getMessage();
    }

}
