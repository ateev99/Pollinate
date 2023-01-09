/**
 * 
 */
package com.pollinate.primes.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import com.pollinate.primes.model.ErrorModel;

/**
 * @author ateevkumar
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler  {
	Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	// --- General exception supersedes every exception
	@ResponseBody
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorModel generalApplicationException(HttpServletRequest request, HttpServletResponse response,
			Exception ex) {
		double applicationCode = Math.random();
		logger.debug("Error Code: "+applicationCode);
		logger.debug(ex.toString());
		return new ErrorModel("Error Code: "+applicationCode, "Apologies application error occured");
	}

}
