/*
 * This class holds the prompts, such as dialogue.
 * If you want to see the conditions for what the user wants to do,
 * go to adventure.java
 * For the main, go to idk.java
 */

public class level
{
	void beginning()
	{
		if (player.getCharacter().equalsIgnoreCase("MajicMan")) //There are different prompts for each character in this case, so if statements are required.
		{
			uPrompt(); //i'm lazy
			System.out.println("You, " + player.getCharacter() + ", are living with your grandma, but hear a thud,");
			System.out.println("You are suspicious and go check it out, but you sexy girlfriend,");
			System.out.println("the door's door handle, is no longer attatched to the door.");
			System.out.println("It is your job to find Patricia (her name), " + player.getCharacter() + ".");
			System.out.println("You can do one of two things:");
			System.out.println("\t1. Go on an adventure"); //Always tab choices.
			System.out.println("\t2. Stay at your grandma's");
			jttn(2); //i'm lazy
			lPrompt(); //i'm lazy
		}
		else
		{
			uPrompt();
			System.out.println("You, " + player.getCharacter() + ", an independant woman,");
			System.out.println("are living with your grandma, but hear a thud.");
			System.out.println("You are suspicious and go check it out, but you sexy girlfriend,");
			System.out.println("the door's door handle, is no longer attatched to the door.");
			System.out.println("It is your job to find Patricia (her name), " + player.getCharacter() + ".");
			System.out.println("You can do one of two things:");
			System.out.println("\t1. Go on an adventure");
			System.out.println("\t2. Stay at your grandma's");
			jttn(2);
			lPrompt();
		}
	}

	void adventure()
	{
		uPrompt();
		System.out.println("You go on an adventure. This is the end of the game so far. You should go away now.");
		lPrompt();
	}

	void toasterHole()
	{
		uPrompt();
		System.out.println("You go down the toaster hole. This is the end of the game so far. You should go away now.");
		lPrompt();
	}
	
	/* Next three methods created out of laziness, really. */
	void uPrompt() //Upper prompt. The design above the prompt to signal that there is a new prompt.
	{
		System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
	}
	
	void lPrompt() //Lower prompt. The design under the prompt to signal that it is finished.
	{
		System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
	}
	
	void jttn(int x) //j(ust) t(ype) t(he) n(umber). Arg is how high the number should go.
	{
		System.out.print("Just type the number ");
		for (int i = 1; i <= x; ++i)
		{
			if (i < x)
				System.out.printf("(%d or ", i);
			else if (i == x)
				System.out.printf("%d in this case).\n", i);
		}
	}
}