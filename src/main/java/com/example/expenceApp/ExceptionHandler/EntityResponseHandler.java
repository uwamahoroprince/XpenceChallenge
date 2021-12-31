package com.example.expenceApp.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.expenceApp.Entity.ErrorResponse;

@ControllerAdvice
@ResponseStatus
public class EntityResponseHandler extends ResponseEntityExceptionHandler{
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> notFoundException(NotFoundException exception, WebRequest request) {
	ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND,exception.getMessage());
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
    @ExceptionHandler(NotSavedException.class)
    public ResponseEntity<ErrorResponse> notSavedException(NotSavedException exception,  WebRequest request){
	ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST,exception.getMessage());
	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
    @ExceptionHandler(NotDeletedException.class)
    public ResponseEntity<ErrorResponse> notDeletedException(NotDeletedException exception,  WebRequest request){
	ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST,exception.getMessage());
	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
    @ExceptionHandler(NotUpdatedException.class)
    public ResponseEntity<ErrorResponse> notUpdatedException(NotUpdatedException exception,  WebRequest request){
	ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST,exception.getMessage());
	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}
