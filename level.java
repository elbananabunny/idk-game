public class level
{
	void beginning()
	{
		System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
		System.out.println("You, " + player.getCharacter() + ", are living with your grandma, but hear a thud,");
		System.out.println("You are suspicious and go check it out, but you sexy girlfriend,");
        System.out.println("the door's door handle, is no longer attatched to the door.");
		System.out.println("It is your job to find Patricia (her name), " + player.getCharacter() + ".");
		if (player.getCharacter().equalsIgnoreCase("Toaster"))
		{
			System.out.println("You can do one of three things:");
			System.out.println("\t1. Go on an adventure");
			System.out.println("\t2. Stay at your grandma's");
			System.out.println("\t3. Go through the Toaster Hole");
		}
		else
		{
			System.out.println("You can do one of two things:");
			System.out.println("\t1. Go on an adventure");
			System.out.println("\t2. Stay at your grandma's");
		}
		System.out.println("Just type the number (1 or 2 in this case)");
		System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
	}

	void adventure()
	{
		System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
		System.out.println("You go on an adventure. This is the end of the game so far. You should go away now.");
		System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
	}

	void toasterHole()
	{
		System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
		System.out.println("You go down the toaster hole. This is the end of the game so far. You should go away now.");
		System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
	}
}
