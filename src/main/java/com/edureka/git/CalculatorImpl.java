package com.edureka.git;

import java.math.BigInteger;

public class CalculatorImpl implements ICalculator {

	public Long add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long sub(Integer a, Integer b) {
		return new BigInteger(a+"").subtract(new BigInteger(b+"")).longValue();
	}

	public Long mul(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long div(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

}
