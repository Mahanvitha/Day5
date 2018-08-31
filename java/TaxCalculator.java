package com.capgemini.Day_5.java;

import com.capgemini.Day_5.Exceptions.TaxWithIneligibleTaxException;
import com.capgemini.Day_5.Exceptions.TaxWithInvalidCountryException;
import com.capgemini.Day_5.Exceptions.TaxWithInvalidNameException;

public class TaxCalculator {

	public static double calculateTax(String empName, int empSal, boolean isIndian)
			throws TaxWithInvalidNameException, TaxWithIneligibleTaxException, TaxWithInvalidCountryException {

		double tax;
		if (isIndian) {
			if (empName == "" || empName == " ") {
				throw new TaxWithInvalidNameException("Employee name should not be null or empty");
			} else {
				if (empSal > 100000) {
					tax = empSal * 8 / 100;
				} else if (empSal >= 50000 || empSal < 100000) {
					tax = empSal * 6 / 100;
				} else if (empSal >= 30000 || empSal < 50000) {
					tax = empSal * 5 / 100;
				} else if (empSal >= 10000 || empSal < 30000) {
					tax = empSal * 4 / 100;
					}
				else {
					throw new TaxWithIneligibleTaxException("The employee does not need to pay tax.");
				}
			}
		} 
		else {
			throw new TaxWithInvalidCountryException("The employee should be an Indian citizen for calculating tax.");
		}
		return tax;
	}

}
