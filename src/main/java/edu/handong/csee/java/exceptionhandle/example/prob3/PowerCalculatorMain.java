package edu.handong.csee.java.exceptionhandle.example.prob3;
import java.util.Scanner;

public class PowerCalculatorMain {

	public static final PowerCalculator myCal = new PowerCalculator();
	public static final Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(keyboard.hasNextInt()) // check if user actually typed int(if user tped something other than integer, while breaks)
		{
			//getting value from user, putting into n and p.
			int n = keyboard.nextInt();
			int p = keyboard.nextInt();
			
			try 
			{
				System.out.println(myCal.power(n, p));
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		
		}
		
	}
	

}
