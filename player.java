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
	public static void giveHealth(int hp)
	{
		health += hp;
	}
	public static void takeHealth(int hp)
	{
		health -= hp;
	}
}
