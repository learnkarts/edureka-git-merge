package com.edureka.git;

import java.math.BigInteger;

public class CalculatorImpl implements ICalculator {

	public Long add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long sub(Integer a, Integer b) {
		return null;
	}

	public Long mul(Integer a, Integer b) {
		return new BigInteger(a + "").multiply(new BigInteger(b + "")).longValue();
	}

	public Long div(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

}
