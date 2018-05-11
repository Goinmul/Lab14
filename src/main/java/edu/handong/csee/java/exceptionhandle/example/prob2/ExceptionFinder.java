package edu.handong.csee.java.exceptionhandle.example.prob2;
import java.util.*; // including all the util's stuff at once

public class ExceptionFinder {

	private int x=0, y=0; // setting variables to use them later

	public ExceptionFinder() {} // default constructor(Precisely, no need to make since java automatically does it).

	public void error_detector() {


		try 
		{
			Scanner keyboard = new Scanner(System.in); // Instantiated

			//setting x and y value(from user)
			System.out.print("x : ");
			x = keyboard.nextInt(); // getting an integer from user
			System.out.print("y : ");
			y = keyboard.nextInt(); // getting an integer from user
			System.out.println(x/y);
		}

		//for each exception, body activates respectively.
		catch(ArithmeticException e) // this exception is already embedded in Java.
		{
			System.out.println("java.Lang.ArithmeticException : " +e.getMessage()); // this getMessage() method prints the already-made lines in Java.
		}
		catch(InputMismatchException e)
		{
			System.out.println("java.util.InputMismatchException");
			// I tried to put e.getMessage() here too, but it printed 'null'. Seems that Java didn't put any String in this exception.
		}
		catch(Exception e) // I wanted to call this exception, but couldn't find out at which condition this thing comes out. :(
		{
			System.out.println("Not arithmetic or input mismatch : another kind of exception has occurred." + e.getMessage());
		}

	}
}
