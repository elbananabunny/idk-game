public class level
{
	String[][][] level = new String[2][10][5];
	void currentLevel()
	{
		level[0][0][0] = "Start";
		int x = 0, y = 0, z = 0;
		if (level[x][y][z].equalsIgnoreCase("Start"))
			beginning();
	}
	void beginning()
	{
		System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
		System.out.println("You, " + player.getCharacter() + ", are living with your grandma, but hear a thud,");
		System.out.println("You are suspicious and go check it out, but you sexy girlfriend,");
        System.out.println("the door's door handle, is no longer attatched to the door.");
		System.out.println("It is your job to find it, " + player.getCharacter() + ".");
		System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
	}
}
