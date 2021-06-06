package com.clien.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("com.TraineeController")
public class GlobalExceptionHandler {

@ExceptionHandler(IDNotFoundException.class)
public ResponseEntity<CustomerErrorResponse> exceptionHandler(IDNotFoundException ex)
{
	CustomerErrorResponse cer=new CustomerErrorResponse("ID_NOT_FOUND_ERROR", ex.getMessage(), HttpStatus.NOT_FOUND.value());
	return new ResponseEntity<>(cer,HttpStatus.NOT_FOUND);
}
}
