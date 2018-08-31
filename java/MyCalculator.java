package com.capgemini.Day_5.java;

public class MyCalculator {

		

	public static long powerCalculate(int n, int p) throws Exception
	{
		long power =1;
		if(n<0 || p<0) 
			throw new Exception("n and p should not be negative.");
		
		else if(n==0 && p==0) 
			throw new Exception("n and p should not be zero.");
	
		else {
			for(int i=0;i<=p;i++)
				power = power*n;
	}
	
		return power;
		}

}
	
	
