package com.example.expenceApp.ExceptionHandler;

public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotFoundException(String error) {
	// TODO Auto-generated method stub
	super(error);
    }

    @Override
    public String getMessage() {
	// TODO Auto-generated method stub
	return super.getMessage();
    }
}
