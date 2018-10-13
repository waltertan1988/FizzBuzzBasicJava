package com.walter.fizzbuzz.service.impl;

import com.walter.fizzbuzz.constant.Constant;
import com.walter.fizzbuzz.service.IntegerToStringService;

/**
 * IntegerToStringService implementation for BUZZ case.
 * @author hp
 */
public class IntegerToBuzzServiceImpl implements IntegerToStringService {

	@Override
	public String transfer(int n) {
		return Constant.BUZZ;
	}

	@Override
	public boolean support(int n) {
		return 0 == n%5;
	}

}