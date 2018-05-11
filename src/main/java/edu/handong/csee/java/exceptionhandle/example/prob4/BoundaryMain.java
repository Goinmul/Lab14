package edu.handong.csee.java.exceptionhandle.example.prob4;
import java.util.Scanner;

public class BoundaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiating things to use.
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		Boundary array = new Boundary();
		boolean repeat = true;

		while(repeat)
		{
			try
			{
				//keep getting integers from user, until catch the thrown thing.
				System.out.print("Enter an Integer : ");
				num = keyboard.nextInt(); // the array that contains the integers from user is actually in the 'array' instance.
				array.receive(num); 
			}
			catch(ArrayIndexOutOfBoundsException e) // thrown from other class.
			{
				System.out.println("Invalid array index access.");
				repeat = false; // when this catch statement activates, repeat becomes false, and while loop breaks.
			}







		}

	}

}
