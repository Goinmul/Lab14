package edu.handong.csee.java.exceptionhandle.example.prob6;

public class CustomID extends Exception {

	//Instantiating things to use
	private String[] races = new String[] {"Vulcans", "Romulan","Klingons"};
	private String name = "";
	private int age = 0;
	private String race = "";
	private int state = 0;



	public void set_name(String str) throws Exception // name_setting method, which throws exception.
	{
		if(str.length()<5) // when user put a name within 4 letters, this method throws an exception.
		{
			state = 0;
			throw new Exception("Your name is short! Try again!");
		}
		else // if the name is proper size(greater than 4), actions below are done.
		{
			this.name = str;
			System.out.println("Name is valid!");
			System.out.println("Name : " + this.name);
			state++;
		}

	}

	public void set_age(int num) throws Exception // method for setting age.
	{
		if (num < 18) // if user put age less than 18, do below.(throws exception)
		{
			state = 1;
			throw new Exception("You are too young! Try again!");
		}
		else // if user put the right thing, do below.
		{
			this.age = num;
			System.out.println("Age is valid.");
			System.out.println("Age : "+this.age);
			state++;
		}

	}

	public void set_race(String race) throws Exception // method setting race.
	{
		for (int i=0;i<races.length;i++) // iterate 3 times(the number of species)
		{
			if (races[i].equals(race)) // races[0], [1], [2] are the species, respectively)
			{
				this.race = races[i];
				System.out.println("Vaild Race.");
				System.out.println("Race : "+races[i]);
				state = 0;
				return;
			}
		}
		state = 2;
		throw new Exception("Human! Try again."); //
	}

	public int getState() { // simple getter(for accessing private variable).
		return state;
	}

}