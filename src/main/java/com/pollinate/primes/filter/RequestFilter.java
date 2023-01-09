/**
 * 
 */
package com.pollinate.primes.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.pollinate.primes.model.ErrorModel;
import com.pollinate.primes.util.Constants;

/**
 * @author ateevkumar
 *
 */
@Component
public class RequestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		boolean isInputValueValid = false; // check for something
		if (request instanceof HttpServletRequest) {
			String url = ((HttpServletRequest) request).getRequestURL().toString();
			String inputValue = url.substring(url.lastIndexOf(Constants.FORWARD_SLASH) + 1);
			isInputValueValid = inputValue.matches(Constants.REGEX_PATTERN);
		}
		if (!isInputValueValid) {
			((HttpServletResponse) response).setStatus(422);
			response.getOutputStream().write(Constants.REQUEST_PARAM_ERROR.getBytes());
			return;
		}
		chain.doFilter(request, response);
	}

}
