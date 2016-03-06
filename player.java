/*
 * This class holds static information for the player.
 * If you are looking for the main, check idk.java
 */
 
public class player
{
	public static String character;
	public static void setCharacter(String playersCharacter) //sets the character atribute to whatever the arguments are.
	{
		character = playersCharacter;
	}
	public static String getCharacter() //returns a string that either is valued at "MajicMan" the "Toaster"
	{
		return character;
	}
	public static void die() //prints out the prompt after a death or suicide
	{
		System.out.println("Good job idiot, you died yourself.");
		System.out.println("I already told you there are no saves,");
		System.out.println("You probably just screwed yourself over.");
		System.out.print("Want to stay? If not Y, N, Yes, or No, defaults to yes [Y or N]: ");
	}
}
