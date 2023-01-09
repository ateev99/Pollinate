/**
 * 
 */
package com.pollinate.primes.orchestration;

import com.pollinate.primes.model.PrimesResponseModel;

/**
 * @author ateevkumar
 *
 */
public interface Orchestration {

	/**
	 * @param inputNumber
	 * @return
	 */
	PrimesResponseModel getPrimeNumbers(Integer inputNumber);

}
