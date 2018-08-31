package com.capgemini.Day_5.javaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.capgemini.Day_5.java.TaxCalculator;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws Exception{
		assertEquals(3060,TaxCalculator.calculateTax("Tim",51000,true));
		assertEquals(12000,TaxCalculator.calculateTax("tom",150000,true));
	}
	@Test
	void testTaxWithInvalidNameException() {
		Exception e;
		e = assertThrows(Exception.class,() ->TaxCalculator.calculateTax(" ", 150000, true));
		assertEquals("Employee name should not be null or empty",e.getMessage());
		e = assertThrows(Exception.class,() ->TaxCalculator.calculateTax( "", 10000, true));
		assertEquals("Employee name should not be null or empty",e.getMessage());
		
	}
	@Test
	void testTaxWithIneligibleTaxException() {
		Exception e;
		e = assertThrows(Exception.class,() ->TaxCalculator.calculateTax("Tom",3000,true));
		assertEquals("The employee does not need to pay tax.",e.getMessage());
//		e = assertThrows(Exception.class,() ->TaxCalculator.calculateTax("Tom",100,true));
//		assertEquals("The employee does not need to pay tax.",e.getMessage());
//		e = assertThrows(Exception.class,() ->TaxCalculator.calculateTax("Tom",0,true));
//		assertEquals("The employee does not need to pay tax.",e.getMessage());
	}
   
		
 @Test
   void testTaxWithInvalidCountryException() {
	   Exception e;
		e = assertThrows(Exception.class,() ->TaxCalculator.calculateTax("Tom",300000,false));
		assertEquals("The employee should be an Indian citizen for calculating tax.",e.getMessage());
   }
}

