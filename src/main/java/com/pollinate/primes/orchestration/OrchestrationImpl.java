/**
 * 
 */
package com.pollinate.primes.orchestration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.pollinate.primes.mapper.PrimesResponseMapper;
import com.pollinate.primes.model.PrimesResponseModel;


/**
 * @author ateevkumar
 *
 */
@Service
public class OrchestrationImpl implements Orchestration {
	
	Logger logger = LoggerFactory.getLogger(OrchestrationImpl.class);

	@Override
	public PrimesResponseModel getPrimeNumbers(Integer inputNumber) {
		// TODO Auto-generated method stub
		return PrimesResponseMapper.INSTANCE.requestToResponseMap(inputNumber);
	}

}
