package edu.handong.csee.java.exceptionhandle.example.prob5;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.print("Enter a sentence : ");
		try 
		{
			Scanner keyboard = new Scanner(System.in);
			String str = keyboard.nextLine();
			ExceptionMain.test(str);
		}
		catch(MyException mine)
		{
			System.out.println("Inside catch block : "+ mine);
		}
	}

	static void test(String str) throws MyException
	{
		if(str.equals("null"))
		{
			throw new MyException("String val is null.");
		}
		else
			System.out.println("String val is : "+str);
		// TODO Auto-generated method stub

	}

}
