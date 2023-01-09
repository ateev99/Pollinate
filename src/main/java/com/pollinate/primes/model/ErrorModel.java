/**
 * 
 */
package com.pollinate.primes.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ateevkumar
 *
 */
@Getter @Setter @NoArgsConstructor 
public class ErrorModel {
	private String errorMessage;
	private String errorTitle;

	public ErrorModel(String message, String title) {
		super();
		this.errorMessage = message;
		this.errorTitle = title;
	}
}
