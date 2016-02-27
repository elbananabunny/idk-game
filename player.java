/*
 * This class holds static information for the player.
 * If you are looking for the main, check idk.java
 */

public class player
{
	public static String character;
	public static void setCharacter(String playersCharacter)
	{
		character = playersCharacter;
	}
	public static String getCharacter()
	{
		return character;
	}
	public static void die()
	{
		System.out.println("Good job idiot, you died yourself.");
		System.out.println("I already told you there are no saves,");
		System.out.println("You probably just screwed yourself over.");
		System.out.print("Want to stay? If not Y, N, Yes, or No, defaults to yes [Y or N]: ");
	}
}
