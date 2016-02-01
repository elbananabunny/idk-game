public class player
{
	public static int health = 100;
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
		System.out.print("Want to leave? If not Y, N, Yes, or No, defaults to no [Y or N]: ");
	}
}
