/**
 * 
 */
package com.pollinate.primes.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ateevkumar
 *
 */
@Getter @Setter @NoArgsConstructor 
public class PrimesResponseModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@JsonProperty("Initial")
	private Integer inputNumber;
	@JsonProperty("Priimes")
	private List<Integer> primeNumberList;

}
