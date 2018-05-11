package edu.handong.csee.java.exceptionhandle.example.prob3;

public class PowerCalculator {

	public long power(int n, int p) throws Exception // means that this constructor throws exception
	{
		long result = 0;
		result = (long)Math.pow(n, p); // n to the power of p
		
		
		
		if(n<0 || p<0) // in this condition, throws below exception.
		{
			throw new Exception("n or p should not be negative.");

		}
		if (n ==0 && p == 0) // form is same as above
		{
			throw new Exception("n and p should not be zero.");
		}
		
		
		
		return result; // returning long type number, 'n to the power of p'
		
	}
	
}
