package edu.handong.csee.java.exceptionhandle.example.prob6;
import java.util.Scanner;

public class CustomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiating things to use
		String name, race;
		int age = 0;
		Scanner keyboard = new Scanner(System.in);
		CustomID obj = new CustomID();
		boolean repeat = true;

		//'state' is important, since it decides what method to be invoked.
		while(repeat) // infinite loop.
		{
			try 
			{
				if(obj.getState() == 0) // initial value is 0, so the body activates.
				{
					System.out.print("Enter your name : ");
					name = keyboard.nextLine();
					obj.set_name(name); // in the method, if user put something wrong, goes to the bottom catch block, shows the message, and continue the loop.
				}

				// in above method, getState(), if the user put the right thing and "passed" it, state++ activates and state becomes 1.
				// so this means that only when the program gets the right name, user can progress downward in the code.
				else if (obj.getState() ==1)
				{
					System.out.print("Enter your age : ");
					age = keyboard.nextInt();
					keyboard.nextLine();
					obj.set_age(age);
				}

				// same mechanism as above. At this point, program holds valid name and age.
				else if (obj.getState()==2)
				{
					System.out.print("Enter your race : ");
					race = keyboard.nextLine();
					obj.set_race(race);
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				continue; // actually, without continue, the program works. But for explicit showing, it is written.
			}

		}

	}

}
