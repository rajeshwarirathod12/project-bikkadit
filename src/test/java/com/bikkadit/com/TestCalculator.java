package com.bikkadit.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {
	@Test
	public void testSum() {
		Calculator calculator=new Calculator();
		int actualresult = calculator.sum(10, 10);
		int expectedresult=20;
		assertEquals(expectedresult, actualresult);
	}
	@Test
	public void testSub() {
		Calculator calculator=new Calculator();
		int actualresult = calculator.sub(30, 15);
		int expectedResult=15;
		assertEquals(expectedResult, actualresult);
	}
	@Test
	public void testMult() {
		Calculator calculator=new Calculator();
		int actualresult = calculator.mult(35, 2);
		int expectedresult=70;
		assertEquals(expectedresult, actualresult);
		
	}
	@Test
	public void testDiv() {
		Calculator calculator=new Calculator();
		int actualresult = calculator.div(35, 7);
		int expectedresult=5;
		assertEquals(expectedresult, actualresult);
		
	}

}
