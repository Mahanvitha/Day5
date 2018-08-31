package com.capgemini.Day_5.javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day_5.java.MyCalculator;

class MyCalculatorTest {

	@Test
	void testPowerWithValidInputs() throws Exception{
		assertEquals(16,MyCalculator.powerCalculate(2,3));
		assertEquals(0,MyCalculator.powerCalculate(-2,3));
		assertEquals(0,MyCalculator.powerCalculate(-2,-3));
	}
	@Test
	void testPowerWithZeroInputs() {
	Exception e;
	e = assertThrows(Exception.class,()->MyCalculator.powerCalculate(0, 0));
	System.out.println(e);
	assertEquals("n and p should not be zero.",e.getMessage());
	}
	@Test
	void testPowerWithNegativeInputs() {
		Exception e;
		e = assertThrows(Exception.class,()->MyCalculator.powerCalculate(-2, -5));
		assertEquals("n and p should not be negative.",e.getMessage());
	}
}


