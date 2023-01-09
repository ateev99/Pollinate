/**
 * 
 */
package com.pollinate.primes.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pollinate.primes.model.PrimesResponseModel;
import com.pollinate.primes.orchestration.Orchestration;


/**
 * @author ateevkumar
 *
 */
@RestController
public class PrimesController {
	
	Logger logger = LoggerFactory.getLogger(PrimesController.class);

	@Autowired
	Orchestration orchestration;
	
	@GetMapping(value = "/primes/{inputNumber}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public @ResponseBody PrimesResponseModel getActiveContracts(@PathVariable Integer inputNumber) {
		//logger.info("things worked");
		return orchestration.getPrimeNumbers(inputNumber);
	} 
	
}
