package edu.handong.csee.java.exceptionhandle.example.prob5;

public class MyException extends Exception {

	private String message = null;

	public MyException() // constructor
	{ 
		super(); // inherits from superclass
	}

	public MyException(String message) // overloading
	{
		super(message);
		this.message = message;
	}

	public MyException(Throwable cause) {
		super(cause);
	}

	public String toString()
	{
		return message;
	}



}
