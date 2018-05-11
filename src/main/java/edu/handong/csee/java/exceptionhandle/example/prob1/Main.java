package edu.handong.csee.java.exceptionhandle.example.prob1;
import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int limit, speed = 0; 
		
		System.out.print("Set the speed limit : ");
		limit = keyboard.nextInt(); // getting limit from user
		speed = rand.nextInt(101);
		
		SpeedLimitter lim = new SpeedLimitter(limit,speed);
		//calling the constructor
		
		lim.warnSpeedLimit(); // invoking the method in the SpeedLimitter class.
		
		keyboard.close();
		
	}

}
