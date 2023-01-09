/**
 * 
 */
package com.pollinate.primes.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.pollinate.primes.model.PrimesResponseModel;

/**
 * @author ateevkumar
 *
 */
@Mapper(componentModel = "spring")
public interface PrimesResponseMapper {
	PrimesResponseMapper INSTANCE = Mappers.getMapper(PrimesResponseMapper.class);
	
	@Mapping(target = "inputNumber", source = "inputNumber")
	@Mapping(target = "primeNumberList", expression = "java(com.pollinate.primes.util.Util.primeAlgorithm(inputNumber))")
	PrimesResponseModel requestToResponseMap(Integer inputNumber);
}
