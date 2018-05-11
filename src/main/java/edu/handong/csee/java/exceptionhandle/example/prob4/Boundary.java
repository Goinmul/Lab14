package edu.handong.csee.java.exceptionhandle.example.prob4;

public class Boundary { // since I am not allowed to use try-catch, must use throws here and put try-catch in main.

	//Initializing variables.
	private static int[] arr = new int[5]; 
	private static int count = 0;

	public void receive(int num) throws ArrayIndexOutOfBoundsException // this method throws an exception condition.
	{
		int i = count; // count is for counting.
		arr[i] = num; // value of index i(of arr) is num.
		count++; // adds up count(shows the index' growth)
		System.out.printf("array[%d] <- %d\n", i, num); // shows the result. Context is same as C.
	}

}
