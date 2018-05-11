package edu.handong.csee.java.exceptionhandle.example.prob3;
import java.util.Scanner;

public class PowerCalculatorMain {

	public static PowerCalculator myCal = new PowerCalculator(); // instantiating. If you make it as 'final', it means that the things are not changed.
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number and its power. For example, '2 3' should show 8.");
		while(keyboard.hasNextInt()) // check if user actually typed int(if user tped something other than integer, while breaks)
		{
			//getting value from user, putting into n and p.
			
			int n = keyboard.nextInt();
			int p = keyboard.nextInt();
			
			try 
			{
				System.out.println(myCal.power(n, p)); // calling the constructor with printing out message('result' value from PowerCalculator class.) at once.
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		
		}
		
	}
	
}
