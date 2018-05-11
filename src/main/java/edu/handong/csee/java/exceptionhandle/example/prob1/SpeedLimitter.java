package edu.handong.csee.java.exceptionhandle.example.prob1;

public class SpeedLimitter {

	private int speed = 0;
	private int randomSpeed = 0;

	public SpeedLimitter(int inputSpeed, int randomSpeed) // constructor
	{
		this.speed = inputSpeed; // initializing two integers
		this.randomSpeed = randomSpeed;
	}

	public void warnSpeedLimit() { // method to compare the values

		System.out.println("Your current speed is " + this.randomSpeed+"km.");
		try 
		{
			if(this.speed < this.randomSpeed) // when this condition meets,
			{
				throw new Exception("The speed limit "+this.speed+"km is being exceeded,");

			} // this exception is thrown.
			else
			{
				System.out.println("You are driving in a proper speed.");
			}

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage()); // this line prints the Exception, thrown in the try block.
			System.out.println("Therefore you will be fined.");
		}


	}

}
